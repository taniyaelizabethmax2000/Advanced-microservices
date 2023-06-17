package com.ust.rabbitmqnew.publisher;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rabbitmqnew.message.message;

@RestController
@RequestMapping("/info")
public class Publisher {
	
	@Autowired
	private RabbitTemplate template;

	
	@Value("${exchangenew}")
	String exchanges;
	@Value("${queuenew}")
	String queues;
	@Value("${routing_keynew}")
	String routing_keys;
	
	@PostMapping("/{name}")
	public String details(@RequestBody message msg ) {
		template.convertAndSend(exchanges,routing_keys,msg);
		return "msg is inserted in queue";
	}
}
