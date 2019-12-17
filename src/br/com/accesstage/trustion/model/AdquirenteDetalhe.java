package br.com.accesstage.trustion.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "AdquirenteDetalheEntity")
@Table(name = "t_concil_cartao_adquirente_detalhe", schema="sch_trustion")
public class AdquirenteDetalhe {

	@Id @GeneratedValue
	@Column(name = "adquirente_detalhe_id")
	private Long adquirenteDetalheId;
	
	@Column(name = "bandeira")
	private String bandeira;
	
	@Column(name = "valor")
	private double valor;
	
	@ManyToOne
	@JoinColumn(name="fk_t_concil_cartao_adquirente")
	private ConcilCartaoAdquirenteSkytefBkoffice concilCartaoAdquirente;

	public AdquirenteDetalhe(String bandeira, double valor, ConcilCartaoAdquirenteSkytefBkoffice concilCartaoAdquirente) {
		super();
		this.bandeira = bandeira;
		this.valor = valor;
		this.concilCartaoAdquirente = concilCartaoAdquirente;
	}

	public AdquirenteDetalhe(String bandeira, double valor) {
		super();
		this.bandeira = bandeira;
		this.valor = valor;
	}

}
