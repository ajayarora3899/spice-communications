package com.spice.communication.spicecommunications.service.impl;

import com.spice.communication.spicecommunications.common.ObjectMapper;
import com.spice.communication.spicecommunications.dao.UserCartDao;
import com.spice.communication.spicecommunications.dao.model.UserCart;
import com.spice.communication.spicecommunications.service.UserCartService;
import com.spice.communication.spicecommunications.service.vo.request.UserCartRequestVO;
import com.spice.communication.spicecommunications.service.vo.response.UserCartResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCartServiceImpl implements UserCartService {

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    UserCartDao userCartDao;

    @Override
    public UserCartResponseVO allocateCart(UserCartRequestVO userCartRequestVO){
        UserCart userCart = objectMapper.convertVoToModel(userCartRequestVO);
        userCart = userCartDao.save(userCart);
        UserCartResponseVO userCartResponseVO = objectMapper.convertModelToVo(userCart);
        return userCartResponseVO ;
    }

    @Override
    public UserCartResponseVO fetchCartByUserId(Integer userId) {
        UserCart userCart=null;
        userCart = userCartDao.fetchByUserId(userId);
        UserCartResponseVO userCartResponseVO=objectMapper.convertModelToVo(userCart);
        return userCartResponseVO;
    }
}
