package com.br.backendge.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.backendge.model.Inscricao;
import com.br.backendge.resource.interfaces.IInscricaoResource;
import com.br.backendge.service.InscricaoService;

@RestController
@RequestMapping("/inscricao")
public class InscricaoResource implements IInscricaoResource {

	@Autowired
	private InscricaoService inscricaoService;
	
	@Override
	public ResponseEntity<?> incluir(Inscricao entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> alterar(Inscricao entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> buscarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> pesquisar(Inscricao entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
