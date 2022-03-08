package com.spice.communication.spicecommunications.service.vo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CartDetailsResponseVO {

    private Integer cartDetailsId;

    @JsonProperty(value = "userCart")
    private UserCartResponseVO userCartResponseVO;

    @JsonProperty(value = "mobile")
    private MobileResponseVO mobileResponseVO;

    @JsonProperty(value = "variant")
    private VariantResponseVO variantResponseVO;

    private Integer count;

    public CartDetailsResponseVO() {
    }

    public Integer getCartDetailsId() {
        return cartDetailsId;
    }

    public void setCartDetailsId(Integer cartDetailsId) {
        this.cartDetailsId = cartDetailsId;
    }

    public UserCartResponseVO getUserCartResponseVO() {
        return userCartResponseVO;
    }

    public void setUserCartResponseVO(UserCartResponseVO userCartResponseVO) {
        this.userCartResponseVO = userCartResponseVO;
    }

    public MobileResponseVO getMobileResponseVO() {
        return mobileResponseVO;
    }

    public void setMobileResponseVO(MobileResponseVO mobileResponseVO) {
        this.mobileResponseVO = mobileResponseVO;
    }

    public VariantResponseVO getVariantResponseVO() {
        return variantResponseVO;
    }

    public void setVariantResponseVO(VariantResponseVO variantResponseVO) {
        this.variantResponseVO = variantResponseVO;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }
}
