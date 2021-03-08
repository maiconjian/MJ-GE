package com.br.backendge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.backendge.model.Inscricao;
import com.br.backendge.repository.InscricaoRepository;
import com.br.backendge.service.interfaces.IInscricaoService;

@Service
public class InscricaoService implements IInscricaoService{

	@Autowired
	private InscricaoRepository inscricaoRepository;
	
	@Override
	public Inscricao incluir(Inscricao entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inscricao alterar(Inscricao entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Inscricao buscarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Inscricao> pesquisar(Inscricao filtro) {
		// TODO Auto-generated method stub
		return null;
	}

}
