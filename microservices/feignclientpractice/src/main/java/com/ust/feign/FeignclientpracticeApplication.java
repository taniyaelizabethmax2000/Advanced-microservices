package com.ust.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableFeignClients
@SpringBootApplication

public class FeignclientpracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignclientpracticeApplication.class, args);
	}

}
