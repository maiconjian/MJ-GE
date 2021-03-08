package com.br.backendge.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.backendge.model.Perfil;
import com.br.backendge.resource.interfaces.IPerfilResource;
import com.br.backendge.service.PerfilService;

@RestController
@RequestMapping("/perfil")
public class PerfilResource implements IPerfilResource {

	@Autowired
	private PerfilService perfilService;
	
	@Override
	public ResponseEntity<?> incluir(Perfil entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> alterar(Perfil entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> buscarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> pesquisar(Perfil entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
