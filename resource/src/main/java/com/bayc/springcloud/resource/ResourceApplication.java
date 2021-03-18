package com.bayc.springcloud.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author bayc
 * @packageName com.bayc.springcloud.resource
 * @className ResourceApplication
 * @description
 * @date 2021/3/15 下午5:27
 */
@EnableEurekaClient
@SpringBootApplication
@EnableHystrix
public class ResourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ResourceApplication.class, args);
    }
}
