package com.ust.client;
//open feign is alternative to rest template,rest is for spring but openfeign can use anywhere
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class FeignclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignclientApplication.class, args);
	}

}
