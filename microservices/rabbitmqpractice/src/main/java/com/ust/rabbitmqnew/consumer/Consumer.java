package com.ust.rabbitmqnew.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.ust.rabbitmqnew.message.message;

@Component
public class Consumer {

	
	@Value("${exchangenew}")
	String exchanges;
	@Value("${queuenew}")
	String queues;
	@Value("${routing_keynew}")
	String routing_keys;
	
	@RabbitListener(queues="queue1")
	public void consumermessagefromqueue(message msg) {
		System.out.println(msg);
	}
	
}
