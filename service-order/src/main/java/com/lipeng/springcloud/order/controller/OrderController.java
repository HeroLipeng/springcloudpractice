package com.lipeng.springcloud.order.controller;

import com.lipeng.springcloud.order.feign.UserFeignService;
import com.lipeng.springcloud.order.pojo.Order;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/order/")
public class OrderController {

    @Resource
    private UserFeignService userFeignService;

    @RequestMapping("getOrderById")
    public Object getOrderById(@RequestParam("id")Integer id){
        Order order=new Order();
        order.setId(1);
        order.setOrderNo("2020032200001");
        order.setUserId(1);
        String username=userFeignService.getUserNameById(1);
        order.setUsername(username);
        return order;
    }
}
