package com.github.wxiaoqi.learning.uc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@MapperScan("com.github.wxiaoqi.learning.uc.mapper")
public class AgUcApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgUcApplication.class, args);
    }
}
