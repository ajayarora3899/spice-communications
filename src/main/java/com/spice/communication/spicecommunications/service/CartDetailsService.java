package com.spice.communication.spicecommunications.service;

import com.spice.communication.spicecommunications.dao.model.CartDetails;
import com.spice.communication.spicecommunications.service.vo.request.CartDetailsRequestVO;
import com.spice.communication.spicecommunications.service.vo.response.CartDetailsResponseVO;

import java.util.List;

public interface CartDetailsService{
    CartDetailsResponseVO addToCart(CartDetailsRequestVO cartDetailsRequestVO);

    List<CartDetailsResponseVO> getCartDetailsByCartId(Integer cartId);
}
