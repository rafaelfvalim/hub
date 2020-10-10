package com.octa.iot.hub.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.octa.iot.hub.model.EventoIoT;

public interface EventoIoTRepository extends JpaRepository<EventoIoT, Long> {
	
	Page<EventoIoT> findBySensorNome(String nome, Pageable paginacao);
}
