package com.springcloud.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
*@author:hp(15172426627@163.com)
*@date:2018-07-24 15:48
*@description：
 * Eureka是服务注册中心
 * @EnableEurekaServer 用于 服务发现
*@version:1.0
*/
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
