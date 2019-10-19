package com.scl.online.eureka.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


@RestController
public class HiController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return "hi " + name + ",i am from port:" + port;
    }

    @PostMapping("/user")
    public User getUser(@RequestBody User user) {
        user.setAge(user.getAge() + 1);
        user.setPort(port);
        return user;
    }

}
