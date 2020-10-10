package com.octa.iot.hub.controller.form;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.domain.Page;

import com.octa.iot.hub.model.EventoIoT;
import com.octa.iot.hub.model.Sensor;
import com.octa.iot.hub.repository.EventoIoTRepository;
import com.octa.iot.hub.repository.SensorRepository;
import com.octa.iot.hub.repository.TipoRepository;

import lombok.Data;

@Data
public class EventoIoTForm {
	
	@NotNull @NotEmpty @Length(min = 5)
	public String nomeSensor;
	
	@NotNull @NotEmpty @Length(min = 1)
	public String valor;

	public EventoIoT converter(SensorRepository sensorRepository) {
		Sensor sensor = sensorRepository.findByNome(nomeSensor);		
		return new EventoIoT(null, sensor,valor, LocalDate.now(), LocalTime.now());
	}

}
