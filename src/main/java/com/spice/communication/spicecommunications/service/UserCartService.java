package com.spice.communication.spicecommunications.service;

import com.spice.communication.spicecommunications.service.vo.request.UserCartRequestVO;
import com.spice.communication.spicecommunications.service.vo.response.UserCartResponseVO;

public interface UserCartService {

    UserCartResponseVO allocateCart(UserCartRequestVO userCartRequestVO);
}
