package com.octa.iot.hub.controller.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.data.domain.Page;

import com.octa.iot.hub.model.EventoIoT;
import com.octa.iot.hub.model.Sensor;

import lombok.Data;

@Data
public class EventoIoTDto {
	
	public String nomeSensor;
	public String tipoSensor;
	public String valor;
	public LocalDate dataEvento;
	public LocalTime horaEvento;

	public EventoIoTDto() {
	}

	public EventoIoTDto(EventoIoT eventoSensor) {
		this.nomeSensor = eventoSensor.sensor.nome;
		this.tipoSensor = eventoSensor.sensor.tipo.descricao;
		this.valor = eventoSensor.valor;		
		this.dataEvento = eventoSensor.dataEvento;
		this.horaEvento = eventoSensor.horaEvento;
	}

	public static Page<EventoIoTDto> converter(Page<EventoIoT> topicos) {
		return topicos.map(EventoIoTDto::new);
	}

}
