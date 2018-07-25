package com.springcloud.customer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
*@author:hp(15172426627@163.com)
*@date:2018-07-25 12:22
*@description：
 * 使用@feignClient注解指定需要调用的服务名称
 * 定义的函数来绑定rest接口
*@version:1.0
*/
@FeignClient(value = "client")
public interface DcClient {

    @RequestMapping(value = "/hello",method=RequestMethod.GET)
    String hello(@RequestParam("name") String name);
}
