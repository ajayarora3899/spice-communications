package com.spice.communication.spicecommunications.service.impl;

import com.spice.communication.spicecommunications.common.ObjectMapper;
import com.spice.communication.spicecommunications.dao.CartDetailsDao;
import com.spice.communication.spicecommunications.dao.UserCartDao;
import com.spice.communication.spicecommunications.dao.model.CartDetails;
import com.spice.communication.spicecommunications.dao.model.UserCart;
import com.spice.communication.spicecommunications.service.CartDetailsService;
import com.spice.communication.spicecommunications.service.vo.request.CartDetailsRequestVO;
import com.spice.communication.spicecommunications.service.vo.response.CartDetailsResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(rollbackFor = Throwable.class)
public class CartDetailsServiceImpl implements CartDetailsService {

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    CartDetailsDao cartDetailsDao;

    @Override
    public CartDetailsResponseVO addToCart(CartDetailsRequestVO cartDetailsRequestVO) {
        CartDetails cartDetails = objectMapper.convertVoToModel(cartDetailsRequestVO);
        cartDetails = cartDetailsDao.save(cartDetails);
        CartDetailsResponseVO cartDetailsResponseVO = objectMapper.convertModelToVo(cartDetails);
        return cartDetailsResponseVO;
    }

    @Override
    public List<CartDetailsResponseVO> getCartDetailsByCartId(Integer cartId) {
        List<CartDetails> cartDetailsList = cartDetailsDao.findAllDetailsByCartId(cartId);
        List<CartDetailsResponseVO> cartDetailsResponseVOList = new ArrayList<>();
        for(CartDetails cartDetails:cartDetailsList) {
            CartDetailsResponseVO cartDetailsResponseVO = objectMapper.convertModelToVo(cartDetails);
            cartDetailsResponseVOList.add(cartDetailsResponseVO);
        }
        return cartDetailsResponseVOList;
    }
}
