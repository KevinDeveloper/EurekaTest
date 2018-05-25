package com.kevin.eurekaribbonclient.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName: RibbonService
 * @Description:
 * @Author: Kevin
 * @Date: 2018/5/25 14:04
 */
@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi(String name){
        return restTemplate.getForObject("http://eureka-client/test/hi?name="+name, String.class);
    }

    /**
     * 当服务不可用时执行的方法
     * @param name
     * @return
     */
    public String hiError(String name){
        return "hi, sorry , happen an error,"+ name;
    }

}
