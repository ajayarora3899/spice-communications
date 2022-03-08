package com.spice.communication.spicecommunications.service;

import com.spice.communication.spicecommunications.service.vo.request.UserCartRequestVO;
import com.spice.communication.spicecommunications.service.vo.response.UserCartResponseVO;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserCartService {

    UserCartResponseVO allocateCart(UserCartRequestVO userCartRequestVO);

    UserCartResponseVO fetchCartByUserId(Integer userId);
}
