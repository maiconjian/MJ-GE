package com.br.backendge.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.backendge.model.Usuario;
import com.br.backendge.resource.interfaces.IUsuarioResource;
import com.br.backendge.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioResource implements IUsuarioResource {

	@Autowired
	private UsuarioService usuarioService;
	
	@Override
	public ResponseEntity<?> incluir(Usuario entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> alterar(Usuario entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> buscarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> pesquisar(Usuario entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
