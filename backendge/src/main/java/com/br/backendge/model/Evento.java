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
@Table(name="GE_EVENTO")
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@Column(name="NM_TITULO")
	private String titulo;
	
	@Column(name="PATH_BANNER")
	private String path;
	
	@Column(name="DS_TIPO")
	private String tipo;
	
	@Column(name="ST_ATIVO")
	private boolean ativo;
	
	
	@Column(name="DT_INSC_INCIO")
	private LocalDateTime dataInicioInsc;
	
	@Column(name="DT_INSC_FIM")
	private LocalDateTime dataFimInsc;
	
	@Column(name="DT_INICIO")
	private LocalDateTime dataInicio;
	
	@Column(name="DT_FIM")
	private LocalDateTime dataFim;
	
	@ManyToOne()
	@JoinColumn(name="ID_CATEGORIA")
	private Categoria categoria;
	@ManyToOne()
	@JoinColumn(name="ID_USUARIO")
	private Usuario usuario;
	@ManyToOne()
	@JoinColumn(name="ID_LOCAL")
	private Local local;
	
	@Column(name="ST_ATV_UNICA")
	private boolean atividadeUnica;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public LocalDateTime getDataInicioInsc() {
		return dataInicioInsc;
	}

	public void setDataInicioInsc(LocalDateTime dataInicioInsc) {
		this.dataInicioInsc = dataInicioInsc;
	}

	public LocalDateTime getDataFimInsc() {
		return dataFimInsc;
	}

	public void setDataFimInsc(LocalDateTime dataFimInsc) {
		this.dataFimInsc = dataFimInsc;
	}

	public LocalDateTime getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDateTime dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDateTime getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDateTime dataFim) {
		this.dataFim = dataFim;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public boolean isAtividadeUnica() {
		return atividadeUnica;
	}

	public void setAtividadeUnica(boolean atividadeUnica) {
		this.atividadeUnica = atividadeUnica;
	}
	
	

}
