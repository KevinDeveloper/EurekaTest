package com.kevin.eurekaribbonclient.controller;

import com.kevin.eurekaribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping(value = "/eurekaribbon")
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi( String name){
        return ribbonService.hi(name);
    }

    @RequestMapping(value = "/testribbon", method = RequestMethod.GET)
    public String testRibbon(){
        ServiceInstance instance = loadBalancerClient.choose("eureka-client");
        return instance.getHost()+":" + instance.getPort();

    }

}
