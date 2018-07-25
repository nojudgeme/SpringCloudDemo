package com.springcloud.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
*@author:hp(15172426627@163.com)
*@date:2018-07-24 16:54
*@description：
 * 服务消费者
 * @EnableFeignClients 开启扫描springcloud feign客户端的功能
 * @EnableDiscoveryClient 加入到服务注册中心
*@version:1.0
*/
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class CustomerFeignApplication {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(CustomerFeignApplication.class, args);
    }
}
