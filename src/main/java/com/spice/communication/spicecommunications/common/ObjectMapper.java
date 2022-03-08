package com.spice.communication.spicecommunications.common;

import com.spice.communication.spicecommunications.dao.model.*;
import com.spice.communication.spicecommunications.service.vo.request.CartDetailsRequestVO;
import com.spice.communication.spicecommunications.service.vo.request.UserCartRequestVO;
import com.spice.communication.spicecommunications.service.vo.response.*;
import org.springframework.stereotype.Component;

@Component
public class ObjectMapper {

    public UserCart convertVoToModel(UserCartRequestVO userCartRequestVO) {
        UserCart userCart = new UserCart();
        userCart.setCartId(userCartRequestVO.getCartId());
        userCart.setUser(new User(userCartRequestVO.getUserId()));
        return userCart;
    }

    public CartDetails convertVoToModel(CartDetailsRequestVO cartDetailsRequestVO) {
        CartDetails cartDetails = new CartDetails();
        cartDetails.setCartDetailsId(cartDetailsRequestVO.getCartDetailsId());
        cartDetails.setCart(new UserCart(cartDetailsRequestVO.getCartId()));
        cartDetails.setMobile(new Mobile(cartDetailsRequestVO.getMobId()));
        cartDetails.setVariant(new Variant(cartDetailsRequestVO.getVariantId()));
        cartDetails.setCount(cartDetailsRequestVO.getCount());
        return cartDetails;
    }

    public UserCartResponseVO convertModelToVo(UserCart userCart) {
        UserCartResponseVO userCartResponseVO = new UserCartResponseVO();
        userCartResponseVO.setCartId(userCart.getCartId());
        User user = userCart.getUser();
        if(user!= null) userCartResponseVO.setUserId(user.getUserId());
        return userCartResponseVO;
    }

    public CartDetailsResponseVO convertModelToVo(CartDetails cartDetails) {
        CartDetailsResponseVO cartDetailsResponseVO = new CartDetailsResponseVO() ;
        cartDetailsResponseVO.setCount(cartDetails.getCount());
        cartDetailsResponseVO.setCartDetailsId(cartDetails.getCartDetailsId());

        /*UserCart userCart = cartDetails.getCart();
        UserCartResponseVO userCartResponseVO = convertModelToVo(userCart);
        cartDetailsResponseVO.setUserCartResponseVO(userCartResponseVO);*/

        /*Mobile mobile = cartDetails.getMobile();
        MobileResponseVO mobileResponseVO = convertModelToVo(mobile);
        cartDetailsResponseVO.setMobileResponseVO(mobileResponseVO);*/

        cartDetailsResponseVO.setUserCartResponseVO(convertModelToVo(cartDetails.getCart()));
        cartDetailsResponseVO.setVariantResponseVO(convertModelToVo(cartDetails.getVariant()));
        cartDetailsResponseVO.setMobileResponseVO(convertModelToVo(cartDetails.getMobile()));

        return cartDetailsResponseVO;
    }

    public MobileResponseVO convertModelToVo(Mobile mobile) {
        MobileResponseVO mobileResponseVO = new MobileResponseVO();
        mobileResponseVO.setMobId(mobile.getMobileId());
        mobileResponseVO.setMobName(mobile.getMobileName());
        Brand brand = mobile.getBrand();
        //if (brand != null) mobileResponseVO.setBrandId(brand.getBrandId());
        if (brand != null) mobileResponseVO.setBrandResponseVO(convertModelToVo(brand));
        return mobileResponseVO;
    }

    public VariantResponseVO convertModelToVo(Variant variant) {
        VariantResponseVO variantResponseVO = new VariantResponseVO();
        variantResponseVO.setVariantId(variant.getVariantId());
        variantResponseVO.setVariantName(variant.getRam() + "|" + variant.getStorage());
        variantResponseVO.setAvailablePiece(variant.getAvailablePiece());
        variantResponseVO.setPrice(variant.getPrice());
        variantResponseVO.setTotalPiece(variant.getTotalPiece());
        Mobile mobile = variant.getMobile();
        if(mobile != null) variantResponseVO.setMobileId((mobile.getMobileId()));
        return variantResponseVO;
    }

    public BrandResponseVO convertModelToVo(Brand brand) {
        BrandResponseVO brandResponseVO = new BrandResponseVO();
        brandResponseVO.setBrandId(brand.getBrandId());
        brandResponseVO.setBrandName(brand.getBrandName());
        return brandResponseVO;
    }

}
