package com.spice.communication.spicecommunications.controller;

import com.spice.communication.spicecommunications.service.MobileService;
import com.spice.communication.spicecommunications.service.vo.response.DropdownVO;
import com.spice.communication.spicecommunications.service.vo.response.MobileResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/sc/mobiles")
public class MobileController {

    @Autowired
    private MobileService mobileService;

    @GetMapping("/getMobiles")
    public ResponseEntity getMobiles(@RequestParam(name = "bid", required = false) Integer bid) {
        List<MobileResponseVO> mobileResponseVOList = mobileService.getMobiles(bid);
        return new ResponseEntity(mobileResponseVOList, HttpStatus.OK);
    }

    @GetMapping("/getBrands")
    public ResponseEntity getBrands(){
        List<DropdownVO> dropdownVOList = mobileService.getBrands();
        return new ResponseEntity(dropdownVOList,HttpStatus.OK);
    }

}
