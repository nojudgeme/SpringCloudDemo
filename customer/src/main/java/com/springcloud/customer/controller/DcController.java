package com.springcloud.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @RequestMapping(value = "/consumer")
    public String dc(){
        ServiceInstance client = loadBalancerClient.choose("client");
        String host = client.getHost();
        int port = client.getPort();
        String url = "http://"+host+":"+port+"/hello?name=Hep";
        System.out.println(url);
        return restTemplate.getForObject(url,String.class);
    }
}
