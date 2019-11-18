package com.scl.online.feign;

import com.scl.online.feign.config.FeignConfig;
import com.scl.online.demo.BasicLogicResult;
import com.scl.online.demo.LocationBizResponseMessage;
import com.scl.online.demo.LocationRequestMessage;
import com.scl.online.feign.controller.User;
import com.scl.online.hystrix.HiHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(value = "gateway-service", configuration = FeignConfig.class, fallback = HiHystrix.class)
public interface EurekaClientFeign {

    @GetMapping(value = "/V0/hi")
    String sayHiFromClientEureka(@RequestParam(value = "name") String name);

    @PostMapping(value = "/V0/user")
    User getUserInfo(@RequestBody User user);

    @PostMapping(value = "/v1/business/location")
    BasicLogicResult<LocationBizResponseMessage>  queryRegionLocationForV2(@RequestBody LocationRequestMessage locationRequestMessage);
}
