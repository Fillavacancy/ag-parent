package com.github.wxiaoqi.learning.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AgEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgEurekaApplication.class, args);
    }
}
