package com.lipeng.springcloud.order.feign;

import org.springframework.stereotype.Component;

@Component
public class UserFeignServiceImpl implements UserFeignService {
    public String getUserNameById(Integer id){
        return "用户查询失败";
    }
}
