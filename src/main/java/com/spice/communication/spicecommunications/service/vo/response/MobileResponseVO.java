package com.spice.communication.spicecommunications.service.vo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;

public class MobileResponseVO {

    @JsonProperty(value = "mid")
    private Integer mobId;

    @NotNull(message = "Mobile Name Required")
    @JsonProperty(value = "mname")
    private String mobName;

    @JsonProperty(value = "brand")
    private BrandResponseVO brandResponseVO;

    public MobileResponseVO() {
    }

    public Integer getMobId() {
        return mobId;
    }

    public void setMobId(Integer mobId) {
        this.mobId = mobId;
    }

    public String getMobName() {
        return mobName;
    }

    public void setMobName(String mobName) {
        this.mobName = mobName;
    }

    public BrandResponseVO getBrandResponseVO() {
        return brandResponseVO;
    }

    public void setBrandResponseVO(BrandResponseVO brandResponseVO) {
        this.brandResponseVO = brandResponseVO;
    }
}
