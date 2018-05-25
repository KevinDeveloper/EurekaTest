package com.kevin.ribbonclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: RibbonController
 * @Description:
 * @Author: Kevin
 * @Date: 2018/5/24 20:40
 */

@RestController
@RequestMapping(value = "/ribbonclient")
public class RibbonController {


    @Autowired
    private LoadBalancerClient loadBalancerClient;


    @RequestMapping(value = "/testribbon", method = RequestMethod.GET)
    public String testRibbon(){
        ServiceInstance instance = loadBalancerClient.choose("stores");
        return instance.getHost()+":" + instance.getPort();

    }

}
