package com.github.wxiaoqi.learning.auth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.github.wxiaoqi.learning.auth.mapper")
public class AgAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgAuthApplication.class, args);
    }
}
