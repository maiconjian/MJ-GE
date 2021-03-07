package com.br.backendge.repository;

import org.springframework.data.repository.CrudRepository;

import com.br.backendge.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}
