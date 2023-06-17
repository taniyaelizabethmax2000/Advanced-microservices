package com.ust.bootdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//dockerize boot application .how do we use boot application with docker


//<finalName>boot-docker</finalName>  in pom.xml gives name to app.
//jar file is in target
@RestController
public class Welcome {

	@GetMapping("/greet")
	public String message() {
		return "Ola!Como Sava";
	}
}
