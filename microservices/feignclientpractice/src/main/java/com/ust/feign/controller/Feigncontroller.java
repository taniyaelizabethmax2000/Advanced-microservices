package com.ust.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.feign.interfaces.Feigninterface;
@RestController
@RequestMapping("/client")
public class Feigncontroller {

	
	@Autowired
	Feigninterface feignclient;
	
	@GetMapping("/nameproduct")
	
	public String personName() {
		return feignclient.getname();
	}
	@GetMapping("/jobproduct")
	public String personJob() {
		return feignclient.getjob();
	}
	@GetMapping("/placeproduct")
	public String personplace() {
		return feignclient.getplace();
	}
}
