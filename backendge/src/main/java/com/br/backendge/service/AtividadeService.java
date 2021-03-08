package com.br.backendge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.backendge.model.Atividade;
import com.br.backendge.repository.AtividadeRepository;
import com.br.backendge.service.interfaces.IAtividadeService;

@Service
public class AtividadeService implements IAtividadeService {

	@Autowired
	private AtividadeRepository atividadeRepository;
	
	@Override
	public Atividade incluir(Atividade entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Atividade alterar(Atividade entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Atividade buscarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Atividade> pesquisar(Atividade filtro) {
		// TODO Auto-generated method stub
		return null;
	}

}
