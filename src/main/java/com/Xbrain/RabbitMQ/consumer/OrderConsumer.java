package com.Xbrain.RabbitMQ.consumer;

import java.io.IOException;
import java.math.BigDecimal;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.Xbrain.RabbitMQ.model.entity.Entrega;
import com.Xbrain.RabbitMQ.service.impl.EntregaServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class OrderConsumer {

	//private EntregaServiceImpl service;
	

	//public OrderConsumer(EntregaServiceImpl service) {
	//	super();
	//	this.service = service;
	//}


	@RabbitListener(queues = { "${queue.order.name}" })
	public void receive(@Payload String fileBody) {
		try {
			ObjectMapper mapper = new ObjectMapper();
			String jsonInString = fileBody.toString();
			Entrega obj = mapper.readValue(jsonInString, Entrega.class);
			//service.salvar(obj);
			System.out.println(fileBody);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}