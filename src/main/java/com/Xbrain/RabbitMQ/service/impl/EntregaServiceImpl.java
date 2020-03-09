package com.Xbrain.RabbitMQ.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.Xbrain.RabbitMQ.model.entity.Entrega;
import com.Xbrain.RabbitMQ.model.repository.EntregaRepository;
import com.Xbrain.RabbitMQ.service.EntregaService;

public class EntregaServiceImpl implements EntregaService {

	private EntregaRepository repository;
	
	public EntregaServiceImpl(EntregaRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	@Transactional
	public void salvar(Entrega entrega) {
		repository.save(entrega);
	}

}
