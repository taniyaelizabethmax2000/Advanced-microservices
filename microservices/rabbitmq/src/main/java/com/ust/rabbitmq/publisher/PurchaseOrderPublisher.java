package com.ust.rabbitmq.publisher;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.rabbitmq.config.MessagingConfig;
import com.ust.rabbitmq.model.OrderStatus;
import com.ust.rabbitmq.model.PurchaseOrder;


//this is orderstatus after confirming order in amazon
@RestController
@RequestMapping("/order")
public class PurchaseOrderPublisher {//everytime publisher has dependency on template so that it can exchange,without that it cannot knock exchange

	
	@Autowired
	private RabbitTemplate template;
	
	@Value("${ust.rabbitmq.queue}")
	  String queueName;
	@Value("$(ust.rabbitmq.exchange}")
	 String exchange;
	@Value("${ust.rabbitmq.routingkey}")
	private String routingkey;
	
	
	@PostMapping("/{customerName}")//whenever we post order in zomato postmapping is happening
		public String bookOrder(@RequestBody PurchaseOrder order,@PathVariable String customerName ) {
			order.setOrderId(UUID.randomUUID().toString());
			//other service calls
			OrderStatus orderStatus =new OrderStatus(order,"ACCEPTED", "order placed successfully by"+ customerName);
			template.convertAndSend(exchange,routingkey,orderStatus);
			return "Success";
		}
	
	
}
