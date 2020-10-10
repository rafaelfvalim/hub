package com.octa.iot.hub.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.octa.iot.hub.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Optional<Usuario> findByEmail(String email);

}
