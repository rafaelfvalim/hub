package com.octa.iot.hub.controller.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import com.octa.iot.hub.model.EventoIoT;

import lombok.Data;

@Data
public class DetalheEventoIoTDto {

	public Long id;
	public String nomeSensor;
	public String tipoSensor;
	public String descricaoSensor;
	public String unidadeSensor;
	public int pontosDecimaisSensor;

	public String valor;
	public LocalDate dataEvento;
	public LocalTime horaEvento;

	public DetalheEventoIoTDto() {
	}

	public DetalheEventoIoTDto(EventoIoT eventoIoT) {
		this.id = eventoIoT.id;
		this.nomeSensor = eventoIoT.sensor.nome;
		this.tipoSensor = eventoIoT.sensor.tipo.descricao;
		this.descricaoSensor = eventoIoT.sensor.descricao;
		this.unidadeSensor = eventoIoT.sensor.unidade;
		this.pontosDecimaisSensor = eventoIoT.sensor.pontosDecimais;
		this.valor = eventoIoT.valor;
		this.dataEvento = eventoIoT.dataEvento;
		this.horaEvento = eventoIoT.horaEvento;
	}

}
