package com.springcloud.earukafeignuploadserver.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("eureka-feign")
public interface UpLoadService {


}
