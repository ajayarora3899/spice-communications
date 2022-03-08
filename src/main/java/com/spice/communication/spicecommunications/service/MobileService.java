package com.spice.communication.spicecommunications.service;

import com.spice.communication.spicecommunications.service.vo.response.DropdownVO;
import com.spice.communication.spicecommunications.service.vo.response.MobileResponseVO;

import java.util.List;

public interface MobileService {

    List<MobileResponseVO> getMobiles(Integer bid);

    List<DropdownVO> getBrands();
}
