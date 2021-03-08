package com.br.backendge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.backendge.model.Categoria;
import com.br.backendge.repository.CategoriaRepository;
import com.br.backendge.service.interfaces.ICategoriaService;

@Service
public class CategoriaService implements ICategoriaService{

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Override
	public Categoria incluir(Categoria entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categoria alterar(Categoria entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Categoria buscarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Categoria> pesquisar(Categoria filtro) {
		// TODO Auto-generated method stub
		return null;
	}

}
