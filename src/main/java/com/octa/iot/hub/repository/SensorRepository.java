package com.octa.iot.hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.octa.iot.hub.model.Sensor;

public interface SensorRepository extends JpaRepository<Sensor, Long> {

	public Sensor findByNome(String nomeSensor);
		

}
