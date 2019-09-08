package com.scl.online;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class StartClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartClientApplication.class, args);
    }

}
