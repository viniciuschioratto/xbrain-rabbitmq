package com.Xbrain.RabbitMQ;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RabbitMqApplication {
	
	@Value("${queue.order.name}")
    private String orderQueue;

	public static void main(String[] args) {
		SpringApplication.run(RabbitMqApplication.class, args);
	}
	
	@Bean
    public Queue queue() {
        return new Queue(orderQueue, true);
    }

}
