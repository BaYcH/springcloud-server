package com.bayc.springcloud.resource.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author bayc
 * @packageName com.bayc.springcloud.resource.controller
 * @className TestController
 * @description
 * @date 2021/3/15 下午5:28
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GetMapping("/date")
    public String getCurrentDate() throws InterruptedException {
        Thread.sleep(200);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(new Date());
    }
}
