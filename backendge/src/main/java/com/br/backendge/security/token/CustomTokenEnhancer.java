package com.br.backendge.security.token;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

import com.br.backendge.security.UsuarioSistema;
import com.br.backendge.service.UsuarioService;


public class CustomTokenEnhancer implements TokenEnhancer{

	@Autowired
	private UsuarioService usuarioService;
	


	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
		UsuarioSistema usuarioSistema = (UsuarioSistema) authentication.getPrincipal();
		Map<String, Object> addInfo = new HashMap<>();
		addInfo.put("Id", usuarioSistema.getUsuario().getId());
		addInfo.put("perfil", usuarioSistema.getUsuario().getPerfil().getNome());	
		
		((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(addInfo);
		return accessToken;
	}

}
