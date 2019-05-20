package com.example.modeleurekaclient2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@FeignClient(serviceId = "model-eureka-client1")
public interface TestService {

    @RequestMapping("/test")
    String test();


    @RequestMapping("/hi")
    String sayHiFromClientOne(@RequestParam(value = "name", defaultValue = "forezp") String name);
}

