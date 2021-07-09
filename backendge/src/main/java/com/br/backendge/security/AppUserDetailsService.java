package com.br.backendge.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.br.backendge.model.Usuario;
import com.br.backendge.repository.UsuarioRepository;


@Service
public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		
	
//		Optional<Usuario> usuarioOptional = usuarioRepository.buscarLogin(login);
//		Usuario usuario = usuarioOptional.orElseThrow(() -> new UsernameNotFoundException("Login ou senha incorretos"));
//		return new UsuarioSistema(usuario, getPermissoes(usuario));

	
		Optional<Usuario> usuarioOptional = usuarioRepository.buscarUsuarioEmail(email);
		if(usuarioOptional.isPresent()) {
			Usuario usuario = usuarioOptional.orElseThrow(() -> new UsernameNotFoundException("Login ou senha incorretos"));
			return new UsuarioSistema(usuario, getPermissoes(usuario));
		}else {
			throw new BadCredentialsException("Este usuario esta desativado.");
		}		
	}
	

	private Collection<? extends GrantedAuthority> getPermissoes(Usuario usuario) {
		Set<SimpleGrantedAuthority> authorities = new HashSet<>();
		usuario.getPermissoes().forEach(p -> authorities.add(new SimpleGrantedAuthority(p.getNome().toUpperCase())));
		return authorities;
	}


}
