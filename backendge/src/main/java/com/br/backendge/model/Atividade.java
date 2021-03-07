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
@Table(name="GE_ATIVIDADE")
public class Atividade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Long id;
	
	@Column(name="NM_ATIVIDADE")
	private String nome;
	
	@Column(name="DT_INICIO")
	private LocalDateTime dataInicio;
	@Column(name="DT_FIM")
	private LocalDateTime dataFim;
	
	@Column(name="NM_PALESTRANTE")
	private String nomePalestrante;
	
	@Column(name="DS_CURRICULO")
	private String curriculo;
	
	@Column(name="NR_VAGAS")
	private int numVagas;
	
	@ManyToOne()
	@JoinColumn(name="ID_EVENTO")
	private Evento evento;
	@ManyToOne()
	@JoinColumn(name="ID_LOCAL")
	private Local local;
	@Column(name="ST_ATIVO")
	private boolean ativo;
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
	public String getNomePalestrante() {
		return nomePalestrante;
	}
	public void setNomePalestrante(String nomePalestrante) {
		this.nomePalestrante = nomePalestrante;
	}
	public String getCurriculo() {
		return curriculo;
	}
	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}
	public int getNumVagas() {
		return numVagas;
	}
	public void setNumVagas(int numVagas) {
		this.numVagas = numVagas;
	}
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	public Local getLocal() {
		return local;
	}
	public void setLocal(Local local) {
		this.local = local;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
}
