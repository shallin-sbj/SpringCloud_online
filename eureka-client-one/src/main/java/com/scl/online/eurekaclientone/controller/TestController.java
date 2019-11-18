package com.scl.online.eurekaclientone.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(@RequestParam String name) {
        return "hi " + name + ",i  am lucy and from port:" + port;
    }

    @PostMapping("/user")
    public User getUser(@RequestBody User user) {
        user.setAge(user.getAge() + 1);
        user.setPort(port);
        return user;
    }

    public String hiError(String name) {
        return "hi," + name + ",sorry,error!";
    }

}
