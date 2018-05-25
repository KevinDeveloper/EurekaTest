package com.kevin.sleuth.sleuthuserservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: UserController
 * @Description:
 * @Author: Kevin
 * @Date: 2018/5/25 19:53
 */

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi(){
        return "I am ok , I am fun";
    }

}
