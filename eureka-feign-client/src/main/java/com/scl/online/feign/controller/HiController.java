package com.scl.online.feign.controller;

import com.scl.online.demo.BasicLogicResult;
import com.scl.online.demo.LocationBizResponseMessage;
import com.scl.online.demo.LocationRequestMessage;
import com.scl.online.feign.service.FeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
public class HiController {
    @Autowired
    private FeignService feignService;

    @GetMapping("/hi/feign")
    public String sayHi(@RequestParam(defaultValue = "scl", required = false) String name) {
        return feignService.sayHi(name);
    }

    @PostMapping("/feign/getuser")
    public User getUser(@RequestBody User user) {
        log.info("接收信息为：" + user.toString());
        User userInfo = feignService.getUserInfo(user);
        log.info("返回信息为：" + user.toString());
        return userInfo;
    }
    @PostMapping("/feign/business/location")
    public String getOper(@RequestBody LocationRequestMessage message) {
        log.info("接收信息为：" + message.toString());
        BasicLogicResult<LocationBizResponseMessage> oper = feignService.getOper(message);
        log.info("返回信息为：" + oper.toString());
        return "  adsf ";
    }

}
