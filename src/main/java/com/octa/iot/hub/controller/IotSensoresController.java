package com.octa.iot.hub.controller;

import java.net.URI;

import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.octa.iot.hub.controller.dto.EventoIoTDto;
import com.octa.iot.hub.controller.form.EventoIoTForm;
import com.octa.iot.hub.model.EventoIoT;
import com.octa.iot.hub.repository.EventoIoTRepository;
import com.octa.iot.hub.repository.SensorRepository;

@RestController
@RequestMapping("/api/v1/iot")
public class IotSensoresController {

	@Autowired
	private EventoIoTRepository eventoIoTRepository;
	
	@Autowired
	private SensorRepository sensorRepository;
	
	@GetMapping
	@Cacheable(value = "listaEventosIoT")
	public Page<EventoIoTDto> listaEventos(@RequestParam(required = false) String nomeSensor, 
			@PageableDefault(sort = "dataEvento", direction = Direction.DESC, page = 0, size = 10) Pageable paginacao) {
		
		if (nomeSensor == null) {
			Page<EventoIoT> eventos = eventoIoTRepository.findAll(paginacao);
			return EventoIoTDto.converter(eventos);
		} else {
			Page<EventoIoT> eventos = eventoIoTRepository.findBySensorNome(nomeSensor, paginacao);
			return EventoIoTDto.converter(eventos);	
		}	
	}
	
	@PostMapping
	@Transactional
	@CacheEvict(value = "listaEventosIoT", allEntries = true)
	public ResponseEntity<EventoIoTDto> criaEvento(@RequestBody @Valid EventoIoTForm form, UriComponentsBuilder uriBuilder) {
		EventoIoT evento = form.converter(sensorRepository);
		eventoIoTRepository.save(evento);
		URI uri = uriBuilder.path("/topicos/{id}").buildAndExpand(evento.getId()).toUri();
		return ResponseEntity.created(uri).body(new EventoIoTDto(evento));
	}
	
}
