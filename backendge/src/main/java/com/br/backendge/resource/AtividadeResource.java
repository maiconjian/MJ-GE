package com.br.backendge.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.backendge.model.Atividade;
import com.br.backendge.resource.interfaces.IAtividadeResource;
import com.br.backendge.service.AtividadeService;

@RestController
@RequestMapping("/atividade")
public class AtividadeResource implements IAtividadeResource{

	@Autowired
	private AtividadeService atividadeService;
	
	@Override
	public ResponseEntity<?> incluir(Atividade entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> alterar(Atividade entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> buscarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> pesquisar(Atividade entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
