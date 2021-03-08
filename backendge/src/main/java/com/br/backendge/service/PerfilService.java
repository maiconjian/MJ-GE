package com.br.backendge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.backendge.model.Perfil;
import com.br.backendge.repository.PerfilRepository;
import com.br.backendge.service.interfaces.IPerfilService;

@Service
public class PerfilService implements IPerfilService{

	@Autowired
	private PerfilRepository perfilRepository;
	
	@Override
	public Perfil incluir(Perfil entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perfil alterar(Perfil entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Perfil buscarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Perfil> pesquisar(Perfil filtro) {
		// TODO Auto-generated method stub
		return null;
	}

}
