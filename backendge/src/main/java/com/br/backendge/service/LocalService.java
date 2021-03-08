package com.br.backendge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.backendge.model.Local;
import com.br.backendge.repository.LocalRepository;
import com.br.backendge.service.interfaces.ILocalService;

@Service
public class LocalService implements ILocalService {

	@Autowired
	private LocalRepository localRepository;
	
	@Override
	public Local incluir(Local entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Local alterar(Local entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Local buscarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Local> pesquisar(Local filtro) {
		// TODO Auto-generated method stub
		return null;
	}

}
