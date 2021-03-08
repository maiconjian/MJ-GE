package com.br.backendge.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("ge")
public class GeApiProperty {

	private final Seguranca seguranca = new Seguranca();
	private String originPermitida = "http://localhost";
	private String urlDesenv = "http://localhost:4200";
	private String urlMobile = "http://localhost";
	private String urlProducao = "";
	
	
	
	public String getOriginPermitida() {
		return originPermitida;
	}



	public void setOriginPermitida(String originPermitida) {
		this.originPermitida = originPermitida;
	}



	public String getUrlDesenv() {
		return urlDesenv;
	}



	public void setUrlDesenv(String urlDesenv) {
		this.urlDesenv = urlDesenv;
	}



	public String getUrlMobile() {
		return urlMobile;
	}



	public void setUrlMobile(String urlMobile) {
		this.urlMobile = urlMobile;
	}



	public Seguranca getSeguranca() {
		return seguranca;
	}
	
	



	public String getUrlProducao() {
		return urlProducao;
	}



	public void setUrlProducao(String urlProducao) {
		this.urlProducao = urlProducao;
	}





	public static class Seguranca {

		private boolean enableHttps;

		public boolean isEnableHttps() {
			return enableHttps;
		}

		public void setEnableHttps(boolean enableHttps) {
			this.enableHttps = enableHttps;
		}
	}
	
}


