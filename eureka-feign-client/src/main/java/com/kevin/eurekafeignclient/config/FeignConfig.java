package com.kevin.eurekafeignclient.config;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @ClassName: FeignConfig
 * @Description:
 * @Author: Kevin
 * @Date: 2018/5/25 10:48
 */
@Configuration
public class FeignConfig {
    @Bean
    public Retryer feignRetryer() {
        return new Retryer.Default(100,SECONDS.toMillis(1),5);
    }
}
