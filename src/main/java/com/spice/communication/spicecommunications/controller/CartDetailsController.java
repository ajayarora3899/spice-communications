package com.spice.communication.spicecommunications.controller;

import com.spice.communication.spicecommunications.dao.model.UserCart;
import com.spice.communication.spicecommunications.service.CartDetailsService;
import com.spice.communication.spicecommunications.service.vo.request.CartDetailsRequestVO;
import com.spice.communication.spicecommunications.service.vo.response.CartDetailsResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/sc/cart")
public class CartDetailsController {

    @Autowired
    CartDetailsService cartDetailsService;

    @PostMapping("/add")
    public ResponseEntity addToCart(@RequestBody CartDetailsRequestVO cartDetailsRequestVO){
        CartDetailsResponseVO cartDetailsResponseVO = cartDetailsService.addToCart(cartDetailsRequestVO);
        return new ResponseEntity(cartDetailsResponseVO, HttpStatus.OK);
    }

    @GetMapping("/getCartDetails/{cartId}")
    public ResponseEntity getCartDetailsByCartId(@PathVariable("cartId") Integer cartId){
        List<CartDetailsResponseVO> cartDetailsResponseVOList = cartDetailsService.getCartDetailsByCartId(cartId);
        return  new ResponseEntity(cartDetailsResponseVOList,HttpStatus.OK);
    }
}
