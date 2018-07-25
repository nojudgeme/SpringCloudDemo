package com.springcloud.customer.controller;

import com.springcloud.customer.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
*@author:hp(15172426627@163.com)
*@date:2018-07-24 16:56
*@description：消费 client提供的接口
*@version:1.0
*/
@RestController
public class DcController {
    @Autowired
   DcClient dcClient;

    @RequestMapping(value = "/test")
    public String dc(@RequestParam(value = "name") String name){
        return dcClient.hello(name);
    }
}
