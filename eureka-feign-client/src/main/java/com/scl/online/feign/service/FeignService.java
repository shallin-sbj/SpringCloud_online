package com.scl.online.feign.service;

import com.scl.online.demo.BasicLogicResult;
import com.scl.online.demo.LocationBizResponseMessage;
import com.scl.online.demo.LocationRequestMessage;
import com.scl.online.feign.EurekaClientFeign;
import com.scl.online.feign.controller.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FeignService {

    @Autowired
    private EurekaClientFeign eurekaClientFeign;

    public String sayHi(String name) {
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }

    public User getUserInfo(User user) {
        return eurekaClientFeign.getUserInfo(user);
    }

    public BasicLogicResult<LocationBizResponseMessage> getOper(LocationRequestMessage message) {
        return eurekaClientFeign.queryRegionLocationForV2(message);
    }
}
