package com.helloservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//api g
@RestController
@RequestMapping("/rest/service")
public class HelloService {
String port;
@Autowired
Environment environment;//is a reference to properties file. environment is just a class used to get port number from microservice


	@Value("name")//value is coming from application.properties file
	String strMessage;
	@GetMapping
//	public String welcome() {
//		return "Programming Microservices "+strMessage;
//	}
	public String welcome() {
		String port=environment.getProperty("server.port");
		return "Programming Microservices@"+port;
	}
	
	@GetMapping("status")
	public String status() {
		return "Up and running->>";
	}
}
