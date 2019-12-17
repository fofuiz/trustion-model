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
@Entity(name = "SkytefDetalheEntity")
@Table(name = "t_concil_cartao_skytef_detalhe", schema="sch_trustion")
public class SkytefDetalhe {

	@Id @GeneratedValue
	@Column(name = "skytef_detalhe_id")
	private Long skytefDetalheId;
	
	@Column(name = "bandeira")
	private String bandeira;
	
	@Column(name = "valor")
	private double valor;
	
	@ManyToOne
	@JoinColumn(name="fk_t_concil_cartao_skytef")
	private ConcilCartaoAdquirenteSkytefBkoffice concilCartaoSkytef;
	
	public SkytefDetalhe(String bandeira, double valor, ConcilCartaoAdquirenteSkytefBkoffice concilCartaoSkytef) {
		super();
		this.bandeira = bandeira;
		this.valor = valor;
		this.concilCartaoSkytef = concilCartaoSkytef;
	}

	public SkytefDetalhe(String bandeira, double valor) {
		super();
		this.bandeira = bandeira;
		this.valor = valor;
	}

}
