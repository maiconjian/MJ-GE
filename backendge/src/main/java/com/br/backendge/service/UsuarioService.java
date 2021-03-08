package com.br.backendge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.backendge.model.Usuario;
import com.br.backendge.repository.UsuarioRepository;
import com.br.backendge.service.interfaces.IUsuarioService;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario incluir(Usuario entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario alterar(Usuario entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> pesquisar(Usuario filtro) {
		// TODO Auto-generated method stub
		return null;
	}

}
