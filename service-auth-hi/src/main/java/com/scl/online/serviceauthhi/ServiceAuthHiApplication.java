package com.scl.online.serviceauthhi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceAuthHiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAuthHiApplication.class, args);
    }

}
