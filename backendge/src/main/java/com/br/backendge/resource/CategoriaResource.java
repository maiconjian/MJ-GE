package com.br.backendge.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.backendge.model.Categoria;
import com.br.backendge.resource.interfaces.ICategoriaResource;
import com.br.backendge.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaResource implements ICategoriaResource{

	@Autowired
	private CategoriaService categoriaService;
	
	@Override
	public ResponseEntity<?> incluir(Categoria entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> alterar(Categoria entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> buscarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> pesquisar(Categoria entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
