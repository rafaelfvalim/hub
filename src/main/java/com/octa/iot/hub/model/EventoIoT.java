package com.octa.iot.hub.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class EventoIoT {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	@ManyToOne
	public Sensor sensor;
	public String valor;
	public LocalDate dataEvento;
	public LocalTime horaEvento;

	public EventoIoT() {
	}

	public EventoIoT(Long id, Sensor sensor, String valor, LocalDate dataEvento, LocalTime horaEvento) {
		this.id = id;
		this.valor = valor;
		this.sensor = sensor;
		this.dataEvento = dataEvento;
		this.horaEvento = horaEvento;
	}


}
