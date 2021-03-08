package com.br.backendge.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.backendge.model.Local;
import com.br.backendge.resource.interfaces.ILocalResource;
import com.br.backendge.service.LocalService;

@RestController
@RequestMapping("/local")
public class LocalResource implements ILocalResource {

	@Autowired
	private LocalService localService;
	
	@Override
	public ResponseEntity<?> incluir(Local entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> alterar(Local entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> buscarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> pesquisar(Local entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
