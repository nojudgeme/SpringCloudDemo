package com.springcloud.customer.controller;

import com.springcloud.customer.DcClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author:hp(15172426627@163.com)
 * @date:2018-07-24 16:56
 * @description：消费 client提供的接口
 * @version:1.0
 */
@RestController
public class DcController {

    @Autowired
    DcClient dcClient;

    @RequestMapping(value = "/test")
    public String dc(@RequestParam(value = "name") String name) {
        return dcClient.hello(name);
    }

    //@RequestPart-> 指定接收的文件  MediaType.MULTIPART_FORM_DATA_VALUE  数据以文件形式传播
    @PostMapping(value = "uploadFile",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String saveFile(@RequestPart("file") MultipartFile file){
        return file.getName();
    }
}
