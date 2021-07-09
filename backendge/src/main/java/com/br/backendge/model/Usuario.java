package com.br.backendge.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
	@Column(name="NM_LOGIN")
	private String login;
	@Column(name="NM_EMAIL")
	private String email;
	@Column(name="NR_SENHA")
	private String senha;
	@Column(name="ST_PCD")
	private boolean pcd;
	@Column(name="DS_PCD")
	private String descricaoPcd;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "USUARIO_PERMISSAO", joinColumns = @JoinColumn(name = "ID_USUARIO"), 
		inverseJoinColumns = @JoinColumn(name = "ID_PERMISSAO"))
	private List<Permissao> permissoes;
	
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

	public List<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<Permissao> permissoes) {
		this.permissoes = permissoes;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	

	
	

}
