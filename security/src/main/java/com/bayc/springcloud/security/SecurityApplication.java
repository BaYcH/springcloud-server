package com.bayc.springcloud.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author bayc
 * @packageName com.bayc.springcloud.security
 * @className SecurityApplication
 * @description
 * @date 2021/3/12 下午12:04
 */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class SecurityApplication {
    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }
}
