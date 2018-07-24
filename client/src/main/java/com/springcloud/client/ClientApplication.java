package com.springcloud.client;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Applications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

/**
*@author:hp(15172426627@163.com)
*@date:2018-07-24 15:51
*@description：
 * @EnableEurekaClient 客户端用于处理业务
*@version:1.0
*/
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
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String test(@RequestParam String name) {
        return "hello,"+name+",i'm from "+port;
    }
}
