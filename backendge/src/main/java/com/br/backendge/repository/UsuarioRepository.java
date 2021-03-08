package com.br.backendge.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.br.backendge.model.Usuario;


public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
	
	@Query(value="SELECT usuario FROM Usuario usuario "+
		         "WHRE usuario.email = :email AND usuario.ativo = true ")
	public Optional<Usuario> buscarUsuarioEmail(@Param("email")String email);
	

}
