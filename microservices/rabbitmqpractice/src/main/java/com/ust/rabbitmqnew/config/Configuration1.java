package com.ust.rabbitmqnew.config;


import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration1 {

	@Value("${exchangenew}")
	String exchanges;
	@Value("${queuenew}")
	String queues;
	@Value("${routing_keynew}")
	String routing_keys;
	
	@Bean
	public Queue queue1() {
		return new Queue(queues);
	}
	
	@Bean
	public TopicExchange exchange1() {
		return new TopicExchange(exchanges);
	}
	
   @Bean
    public Binding binding(Queue queue1,TopicExchange exchange1) {
	   return BindingBuilder.bind(queue1).to(exchange1).with(routing_keys);
   }
   
   @Bean
   public MessageConverter converter() {
	   return new Jackson2JsonMessageConverter();
   }
   
   @Bean
   public AmqpTemplate template(ConnectionFactory connectionFactory) {
	  final RabbitTemplate template=new RabbitTemplate(connectionFactory);
	   template.setMessageConverter(converter());
	   return template;
   }
}
