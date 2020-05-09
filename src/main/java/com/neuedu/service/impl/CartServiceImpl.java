package com.neuedu.service.impl;

import com.neuedu.mapper.CartMapper;
import com.neuedu.pojo.Cart;
import com.neuedu.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartMapper cartMapper;

    @Override
    public List<Cart> getCartListByUserId(Integer userId) {
        return cartMapper.getCartListByUserId(userId);
    }
}
