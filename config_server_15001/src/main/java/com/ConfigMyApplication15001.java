package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer //开启SCC服务器端注解
public class ConfigMyApplication15001 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigMyApplication15001.class, args);
    }
}