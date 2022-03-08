package com.spice.communication.spicecommunications.service.impl;

import com.spice.communication.spicecommunications.service.MobileService;
import com.spice.communication.spicecommunications.service.vo.response.DropdownVO;
import com.spice.communication.spicecommunications.service.vo.response.MobileResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class MobileServiceImpl implements MobileService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<MobileResponseVO> getMobiles(Integer bid) {
        List<MobileResponseVO> mobileResponseVOList = restTemplate.getForObject("http://localhost:8080/v1/mobiles/list?bid="+bid,List.class);
        return mobileResponseVOList;
    }

    @Override
    public List<DropdownVO> getBrands() {
        List<DropdownVO> dropdownVOList = restTemplate.getForObject("http://localhost:8080/v1/brands/dropdown",List.class);
        return dropdownVOList;
    }


}
