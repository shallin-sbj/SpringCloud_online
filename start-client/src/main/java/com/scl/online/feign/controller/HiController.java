package com.scl.online.feign.controller;

import com.scl.online.feign.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HiController {
    @Autowired
    private HiService hiService;

    @GetMapping("/hi/feign")
    public String sayHi(@RequestParam(defaultValue = "scl", required = false) String name) {
        return hiService.sayHi(name);
    }
}
