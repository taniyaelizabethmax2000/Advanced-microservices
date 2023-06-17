package com.ust.bootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/p")
public class controlller {
	@GetMapping("/nam")
	public String hername() {
		return "Taniya";
	}

}
