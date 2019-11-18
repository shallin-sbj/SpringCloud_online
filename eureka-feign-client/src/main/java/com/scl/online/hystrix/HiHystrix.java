package com.scl.online.hystrix;

import com.scl.online.feign.EurekaClientFeign;
import com.scl.online.demo.BasicLogicResult;
import com.scl.online.demo.LocationBizResponseMessage;
import com.scl.online.demo.LocationRequestMessage;
import com.scl.online.feign.controller.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
@Slf4j
@Component
public class HiHystrix implements EurekaClientFeign {

    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi," + name + ",sorry,error! this is feign + hystrix !";
    }

    @Override
    public User getUserInfo(User user) {
        user.setUserName("发生熔断了");
        return user;
    }

    @Override
    public BasicLogicResult<LocationBizResponseMessage> queryRegionLocationForV2(LocationRequestMessage locationRequestMessage) {
        log.error("发生熔断了。。。。。。");
        return null;
    }
}
