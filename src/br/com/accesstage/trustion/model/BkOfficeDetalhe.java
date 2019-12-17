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
@Entity(name = "BkOfficeDetalheEntity")
@Table(name = "t_concil_cartao_bkoffice_detalhe", schema="sch_trustion")
public class BkOfficeDetalhe {

	@Id @GeneratedValue
	@Column(name = "bk_detalhe_id")
	private Long bkDetalheId;
	
	@Column(name = "bandeira")
	private String bandeira;
	
	@Column(name = "valor")
	private double valor;
	
	@ManyToOne
	@JoinColumn(name="fk_t_concil_cartao_bkoffice")
	private ConcilCartaoAdquirenteSkytefBkoffice concilCartaoBkoffice;
	
	public BkOfficeDetalhe(String bandeira, double valor, ConcilCartaoAdquirenteSkytefBkoffice concilCartaoBkoffice) {
		super();
		this.bandeira = bandeira;
		this.valor = valor;
		this.concilCartaoBkoffice = concilCartaoBkoffice;
	}
	
	public BkOfficeDetalhe(String bandeira, double valor) {
		super();
		this.bandeira = bandeira;
		this.valor = valor;
	}

}