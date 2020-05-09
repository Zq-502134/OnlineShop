package com.neuedu.controller;


import com.neuedu.pojo.Order;
import com.neuedu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    List<Order> getOrderList(@RequestParam("userid") Integer userId){
        return orderService.getOrderList(userId);
    }

    @RequestMapping(value = "/unionlist",method = RequestMethod.GET)
    List<Order> getOrderUnionList(@RequestParam("orderid") Integer orderId){
        return orderService.getOrderUnionList(orderId);
    }
}
