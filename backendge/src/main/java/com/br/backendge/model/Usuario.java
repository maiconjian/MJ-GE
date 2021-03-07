package com.br.backendge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="GE_USUARIO")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	@Column(name="NM_NOME")
	private String nome;
	@Column(name="LG_EMAIL")
	private String email;
	@Column(name="PW_SENHA")
	private String senha;
	@Column(name="ST_PCD")
	private boolean pcd;
	@Column(name="DS_PCD")
	private String descricaoPcd;
	@Column(name="ST_ATIVO")
	private boolean ativo;
	
	@ManyToOne()
	@JoinColumn(name = "ID_PERFIL")
	private Perfil perfil;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isPcd() {
		return pcd;
	}

	public void setPcd(boolean pcd) {
		this.pcd = pcd;
	}

	public String getDescricaoPcd() {
		return descricaoPcd;
	}

	public void setDescricaoPcd(String descricaoPcd) {
		this.descricaoPcd = descricaoPcd;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public Perfil getPerfil() {
		return perfil;
	}

	public void setPerfil(Perfil perfil) {
		this.perfil = perfil;
	}


	
	

}