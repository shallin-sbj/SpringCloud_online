package com.scl.online.userservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${spring.application.name}")
    String serviceName;
    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String hi() {
        return "I'm " + serviceName + "   from " + port + "  \n" + new Date();
    }
}
