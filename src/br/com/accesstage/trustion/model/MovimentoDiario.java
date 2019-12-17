package br.com.accesstage.trustion.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity(name = "MovimentoDiarioEntity")
@Table(name = "t_carga_movimento_diario", schema = "sch_trustion")
public class MovimentoDiario {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tMovimentoDiario")
	@SequenceGenerator(name = "tMovimentoDiario", sequenceName = "t_carga_movimento_diario_seq", allocationSize = 1)
	@Column(name = "id_movimento_diario")
	private Long idMovimentoDiario;

	@Column(name = "matriz")
	private String matriz;

	@Column(name = "regional")
	private String regional;

	@Column(name = "setor")
	private String setor;

	@Column(name = "id_restaurante")
	private Long idRestaurante;

	@Column(name = "bk_number")
	private Long bkNumber;

	@Column(name = "restaurante")
	private String restaurante;

	@Column(name = "data_movimento_diario")
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "Brazil/East")
	private Date dataMovimentoDiario;

	@Column(name = "tipo_pagamento")
	private String tipoPagamento;

	@Column(name = "bandeira")
	private String bandeira;

	@Column(name = "quantidade")
	private Long quantidade;

	@Column(name = "valor")
	@JsonFormat(shape = JsonFormat.Shape.STRING)
	private double valor;

	public Long getIdMovimentoDiario() {
		return idMovimentoDiario;
	}

	public void setIdMovimentoDiario(Long idMovimentoDiario) {
		this.idMovimentoDiario = idMovimentoDiario;
	}

	public String getMatriz() {
		return matriz;
	}

	public void setMatriz(String matriz) {
		this.matriz = matriz;
	}

	public String getRegional() {
		return regional;
	}

	public void setRegional(String regional) {
		this.regional = regional;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public Long getIdRestaurante() {
		return idRestaurante;
	}

	public void setIdRestaurante(Long idRestaurante) {
		this.idRestaurante = idRestaurante;
	}

	public Long getBkNumber() {
		return bkNumber;
	}

	public void setBkNumber(Long bkNumber) {
		this.bkNumber = bkNumber;
	}

	public String getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(String restaurante) {
		this.restaurante = restaurante;
	}

	public Date getDataMovimentoDiario() {
		return dataMovimentoDiario;
	}

	public void setDataMovimentoDiario(Date dataMovimentoDiario) {
		this.dataMovimentoDiario = dataMovimentoDiario;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public Long getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Long quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
