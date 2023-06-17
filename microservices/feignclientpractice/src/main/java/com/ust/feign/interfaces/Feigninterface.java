package com.ust.feign.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;



@FeignClient(value="feignclientpractice",url="http://localhost:8095/p")
public interface Feigninterface {

	@GetMapping("/n")
	public String getname();
	@GetMapping("/job")
	public String getjob();
	@GetMapping("/place")
	public String getplace();
	
}
