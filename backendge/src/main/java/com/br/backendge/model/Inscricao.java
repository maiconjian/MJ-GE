package com.br.backendge.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="GE_INSCRICAO")
public class Inscricao {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	@Column(name="DT_INSCRICAO")
	private LocalDateTime dataInscricao;
	@Column(name="CD_AUTENTICACAO")
	private String codigoAutenticacao;
	@Column(name="ST_PRESENCA")
	private boolean presenca;
	@Column(name="ST_ATIVO")
	private boolean ativo;
	@ManyToOne()
	@JoinColumn(name="ID_USUARIO")
	private Usuario usuario;
	@ManyToOne()
	@JoinColumn(name="ID_ATIVIDADE")
	private Atividade atividade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDataInscricao() {
		return dataInscricao;
	}

	public void setDataInscricao(LocalDateTime dataInscricao) {
		this.dataInscricao = dataInscricao;
	}

	public String getCodigoAutenticacao() {
		return codigoAutenticacao;
	}

	public void setCodigoAutenticacao(String codigoAutenticacao) {
		this.codigoAutenticacao = codigoAutenticacao;
	}

	public boolean isPresenca() {
		return presenca;
	}

	public void setPresenca(boolean presenca) {
		this.presenca = presenca;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}
	
	
	

}
