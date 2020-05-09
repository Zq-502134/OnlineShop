package com.neuedu.service.impl;

import com.neuedu.mapper.OrderMapper;
import com.neuedu.pojo.Order;
import com.neuedu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class OrderServiceImpl  implements OrderService {
    @Autowired
    private OrderMapper orderMapper;
    @Override
    public List<Order> getOrderList(Integer userId) {
        return orderMapper.getOrderList(userId);
    }

    @Override
    public List<Order> getOrderUnionList(Integer orderId) {
        return orderMapper.getOrderUnionList(orderId);
    }
}
