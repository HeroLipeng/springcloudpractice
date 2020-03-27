package com.lipeng.springcloud.user.controller;

import com.lipeng.springcloud.user.pojo.User;
import com.lipeng.springcloud.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("getUserNameById")
    public String getUserNameById(@RequestParam("id")Integer id){
        //User user=userService.getUserById(1);

        return "张三"+id+"测试成功";
    }
}
