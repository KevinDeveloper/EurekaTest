package com.kevin.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: HiController
 * @Description:
 * @Author: Kevin
 * @Date: 2018/5/24 20:17
 */
@RestController
@RequestMapping(value = "/test")
public class HiController {

    @Value("${server.port}")
    String port;

//    @GetMapping(value = "/hi")
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String home(String name){
        return "hi, " + name + ", this port ="+ port;
    }

}
