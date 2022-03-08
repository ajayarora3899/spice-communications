package com.spice.communication.spicecommunications.service.impl;

import com.spice.communication.spicecommunications.common.ErrorCodes;
import com.spice.communication.spicecommunications.service.UserCartService;
import com.spice.communication.spicecommunications.service.UserService;
import com.spice.communication.spicecommunications.service.exception.SpiceBaseException;
import com.spice.communication.spicecommunications.service.vo.request.UserCartRequestVO;
import com.spice.communication.spicecommunications.service.vo.request.UserRequestVO;
import com.spice.communication.spicecommunications.service.vo.response.DropdownVO;
import com.spice.communication.spicecommunications.service.vo.response.UserCartResponseVO;
import com.spice.communication.spicecommunications.service.vo.response.UserResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    UserCartService userCartService;

    @Override
    public List<DropdownVO> getGenderDropdown() {
        List<DropdownVO> dropdownVOList = restTemplate.getForObject("http://localhost:8081/v1/users/gender/dropdown", List.class);
        return dropdownVOList;
    }

    @Override
    public UserResponseVO validateUser(String uname, String pass) throws SpiceBaseException {
        UserResponseVO userResponseVO = null;
        try {
            userResponseVO = restTemplate.getForObject("http://localhost:8081/v1/users/validation/" + uname + "/" + pass, UserResponseVO.class);
        } catch (HttpClientErrorException e) {
            throw new SpiceBaseException(ErrorCodes.USER_NOT_REGISTERED.getMessage(), ErrorCodes.USER_NOT_REGISTERED.getErrorCode());
        }
        if (userResponseVO == null) {
            throw new SpiceBaseException(ErrorCodes.USER_NOT_REGISTERED.getMessage(), ErrorCodes.USER_NOT_REGISTERED.getErrorCode());
        }
        UserCartResponseVO userCartResponseVO= userCartService.fetchCartByUserId((userResponseVO.getUserId()));
        userResponseVO.setCartId(userCartResponseVO.getCartId());
        return userResponseVO;
    }

    @Override
    public UserResponseVO createUser(UserRequestVO userRequestVO) throws URISyntaxException {
        // exchange(URI url, HttpMethod method, HttpEntity<?> requestEntity, Class<T> responseType)
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        URI uri = new URI("http://localhost:8081/v1/users/create");
        HttpEntity<UserRequestVO> httpEntity = new HttpEntity<UserRequestVO>(userRequestVO, headers);
        ResponseEntity<UserResponseVO> responseEntity = restTemplate.exchange(uri, HttpMethod.POST, httpEntity,
                UserResponseVO.class);
        UserResponseVO userResponseVO = responseEntity.getBody();
        if(userRequestVO.getUserId()==null) {
            UserCartRequestVO userCartRequestVO = new UserCartRequestVO();
            userCartRequestVO.setUserId(userResponseVO.getUserId());
            UserCartResponseVO userCartResponseVO = userCartService.allocateCart(userCartRequestVO);
            userResponseVO.setCartId(userCartResponseVO.getCartId());
        }else {
            UserCartResponseVO userCartResponseVO=userCartService.fetchCartByUserId(userRequestVO.getUserId());
            userResponseVO.setCartId(userCartResponseVO.getCartId());
        }
        return userResponseVO;
    }

}
