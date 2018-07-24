package com.springcloud.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableEurekaClient
@SpringBootApplication
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Value("${server.port}")
    private String port;

    //Eureka客户端测试
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(@RequestParam String name) {
        return "hello,"+name+",i'm from "+port;
    }
}