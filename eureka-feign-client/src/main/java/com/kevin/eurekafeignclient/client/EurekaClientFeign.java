package com.kevin.eurekafeignclient.client;

import com.kevin.eurekafeignclient.config.FeignConfig;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: EurekaClientFeign
 * @Description:
 * @Author: Kevin
 * @Date: 2018/5/25 10:47
 */
@FeignClient(value = "eureka-client", configuration = FeignConfig.class)
public interface EurekaClientFeign {

    @GetMapping(value = "/test/hi?name={name}")
    String sayHiFromClientEureka(@PathVariable(name = "name") String name);

    @RequestMapping(value = "/test/hi", method = RequestMethod.GET)
    String sayHiFromClientEureka2(@RequestParam("name") String name);

}
