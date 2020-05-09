package com.neuedu.service;

import com.neuedu.pojo.Cart;

import java.util.List;

public interface CartService {
    List<Cart> getCartListByUserId(Integer userId);
}
