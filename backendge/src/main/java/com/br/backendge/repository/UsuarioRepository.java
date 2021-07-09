package com.br.backendge.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.br.backendge.model.Usuario;


public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	
	
	@Query(value="SELECT * FROM GE_USUARIO AS  A "+
		         "WHERE A.NM_EMAIL = ?1 AND A.ST_ATIVO = 1 ",nativeQuery = true)
	public Optional<Usuario> buscarUsuarioEmail(String email);
	

}
