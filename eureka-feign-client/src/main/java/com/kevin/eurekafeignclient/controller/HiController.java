package com.kevin.eurekafeignclient.controller;

import com.kevin.eurekafeignclient.client.EurekaClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: HiController
 * @Description:
 * @Author: Kevin
 * @Date: 2018/5/25 10:52
 */
@RestController
@RequestMapping(value = "/feign")
public class HiController {

    @Autowired
    private EurekaClientFeign eurekaClientFeign;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(String name){
        return eurekaClientFeign.sayHiFromClientEureka(name);
    }
    @RequestMapping(value = "/hi2", method = RequestMethod.GET)
    public String sayHi2(String name){
        return eurekaClientFeign.sayHiFromClientEureka2(name);
    }


}
