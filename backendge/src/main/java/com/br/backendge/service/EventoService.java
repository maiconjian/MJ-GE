package com.br.backendge.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.backendge.model.Evento;
import com.br.backendge.repository.EventoRepository;
import com.br.backendge.service.interfaces.IEventoService;

@Service
public class EventoService implements IEventoService {

	@Autowired
	private EventoRepository eventoRepository;
	
	@Override
	public Evento incluir(Evento entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Evento alterar(Evento entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Evento buscarPorId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Evento> pesquisar(Evento filtro) {
		// TODO Auto-generated method stub
		return null;
	}

}
