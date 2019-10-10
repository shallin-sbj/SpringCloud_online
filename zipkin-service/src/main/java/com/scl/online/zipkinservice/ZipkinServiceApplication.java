package com.scl.online.zipkinservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin2.server.internal.EnableZipkinServer;


@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableZipkinServer
public class ZipkinServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinServiceApplication.class, args);
    }

}
