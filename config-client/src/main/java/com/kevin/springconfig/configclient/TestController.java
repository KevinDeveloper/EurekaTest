package com.kevin.springconfig.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: TestController
 * @Description:
 * @Author: Kevin
 * @Date: 2018/5/25 18:51
 */
@RestController
public class TestController {

    @Value("${foo}")
    String foo;

    @RequestMapping(value = "/foo")
    public String test(){
        return foo;
    }
}
