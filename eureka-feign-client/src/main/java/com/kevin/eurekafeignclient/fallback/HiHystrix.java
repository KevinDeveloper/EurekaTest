package com.kevin.eurekafeignclient.fallback;

import com.kevin.eurekafeignclient.client.EurekaClientFeign;
import org.springframework.stereotype.Component;

/**
 * @ClassName: HiHystrix
 * @Description:
 * @Author: Kevin
 * @Date: 2018/5/25 14:14
 */
@Component
public class HiHystrix implements EurekaClientFeign {
    @Override
    public String sayHiFromClientEureka(String name) {
        return "hi, sorry , happen an error,1-"+ name;
    }

    @Override
    public String sayHiFromClientEureka2(String name) {
        return "hi, sorry , happen an error,2-"+ name;
    }
}
