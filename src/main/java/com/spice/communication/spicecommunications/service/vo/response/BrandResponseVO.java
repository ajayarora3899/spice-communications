package com.spice.communication.spicecommunications.service.vo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BrandResponseVO {


    @JsonProperty(value = "bid")
    private Integer brandId;

    @JsonProperty(value = "bname")
    private String brandName;

    public BrandResponseVO() {
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}

