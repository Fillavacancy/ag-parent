package com.github.wxiaoqi.learning.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableConfigServer
public class AgConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(AgConfigApplication.class, args);
    }
}
