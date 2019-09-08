package com.scl.online;

import com.scl.online.feign.EurekaClientFeign;
import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements EurekaClientFeign {

    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi," + name + ",sorry,error! this is feign + hystrix !";
    }
}
