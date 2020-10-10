package com.octa.iot.hub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Sensor {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	@ManyToOne
	public Tipo tipo;
	public String nome;
	public String descricao;
	public String unidade;
	public int pontosDecimais;
	
}
