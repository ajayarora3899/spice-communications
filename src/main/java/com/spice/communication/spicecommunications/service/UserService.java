package com.spice.communication.spicecommunications.service;

import com.spice.communication.spicecommunications.service.exception.SpiceBaseException;
import com.spice.communication.spicecommunications.service.vo.request.UserRequestVO;
import com.spice.communication.spicecommunications.service.vo.response.DropdownVO;
import com.spice.communication.spicecommunications.service.vo.response.UserResponseVO;

import java.net.URISyntaxException;
import java.util.List;

public interface UserService {

    List<DropdownVO> getGenderDropdown();

    UserResponseVO validateUser(String uname, String pass) throws SpiceBaseException;

    UserResponseVO createUser(UserRequestVO userRequestVO) throws URISyntaxException;
}
