package com.br.backendge.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.backendge.model.Evento;
import com.br.backendge.resource.interfaces.IEventoResource;
import com.br.backendge.service.EventoService;

@RestController
@RequestMapping("/evento")
public class EventoResource implements IEventoResource {

	@Autowired
	private EventoService eventoService;
	
	@Override
	public ResponseEntity<?> incluir(Evento entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> alterar(Evento entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> buscarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<?> pesquisar(Evento entity) {
		// TODO Auto-generated method stub
		return null;
	}

}
