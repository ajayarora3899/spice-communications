package com.spice.communication.spicecommunications.controller;

import com.spice.communication.spicecommunications.service.UserService;
import com.spice.communication.spicecommunications.service.exception.SpiceBaseException;
import com.spice.communication.spicecommunications.service.vo.request.UserRequestVO;
import com.spice.communication.spicecommunications.service.vo.response.DropdownVO;
import com.spice.communication.spicecommunications.service.vo.response.UserResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/v1/sc/users")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/gender/dropdown")
    public ResponseEntity getGenderDropdown() {
        List<DropdownVO> dropdownVOList = userService.getGenderDropdown();
        return new ResponseEntity(dropdownVOList, HttpStatus.OK);
    }

    @GetMapping("/validation/{uname}/{pass}")
    public ResponseEntity validateUser(@PathVariable("uname") String uname, @PathVariable("pass") String pass) throws SpiceBaseException {
        UserResponseVO userResponseVO = userService.validateUser(uname, pass);
        return new ResponseEntity(userResponseVO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity createUser(@RequestBody UserRequestVO userRequestVO) throws URISyntaxException {
        UserResponseVO userResponseVO = userService.createUser(userRequestVO);
        return new ResponseEntity(userResponseVO,HttpStatus.OK);
    }
}
