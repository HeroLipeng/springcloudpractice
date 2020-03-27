package com.lipeng.springcloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//eureka服务注册
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer {
    //
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class,args);
    }
}
