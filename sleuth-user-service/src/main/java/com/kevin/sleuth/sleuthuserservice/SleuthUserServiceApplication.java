package com.kevin.sleuth.sleuthuserservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SleuthUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SleuthUserServiceApplication.class, args);
	}
}
