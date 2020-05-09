package com.neuedu.service;

import com.neuedu.pojo.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrderList(Integer userId);

    List<Order> getOrderUnionList(Integer orderId);
}
