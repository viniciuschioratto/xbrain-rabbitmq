package com.Xbrain.RabbitMQ.model.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Entrega")
public class Entrega {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_entrega;
	
	@Column(name = "id")
	private Long id;
	
	@Column(name ="valor")
	private BigDecimal valor;
	
	@Column(name ="rua")
	private String rua;
	
	@Column(name ="numero")
	private String numero;
	
	@Column(name ="bairro")
	private String bairro;
	
	@Column(name ="estado")
	private String estado;
	
	@Column(name ="cidade")
	private String cidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Long getId_entrega() {
		return id_entrega;
	}

	public void setId_entrega(Long id_entrega) {
		this.id_entrega = id_entrega;
	}
	
}
