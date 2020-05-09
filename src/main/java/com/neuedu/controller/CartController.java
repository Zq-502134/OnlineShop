package com.neuedu.controller;

import com.neuedu.pojo.Cart;
import com.neuedu.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;
    @RequestMapping("/list")
    public List<Cart> getCartList(@RequestParam("userId") Integer userId){
        return cartService.getCartListByUserId(userId);
    }
}
