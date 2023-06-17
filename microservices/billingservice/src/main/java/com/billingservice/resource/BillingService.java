package com.billingservice.resource;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/billingservice")
public class BillingService {

	
	@GetMapping
	public String welcome() {
		return "Programming billingMicroservices ";
	}
	
	
}

