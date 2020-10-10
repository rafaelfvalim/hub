package com.octa.iot.hub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Tipo {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)

	public Long id;
	public String descricao;

}
