package br.com.accesstage.trustion.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "ConcilCartaoAdquirenteSkytefBkofficeEntity")
@Table(name = "t_concil_cartao_adquirente_skytef_bkoffice", schema="sch_trustion")
public class ConcilCartaoAdquirenteSkytefBkoffice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tConcilCartaoAdSkyBk")
	@SequenceGenerator(name = "tConcilCartaoAdSkyBk", sequenceName = "t_concil_cartao_ad_sky_bk_seq", allocationSize = 1)
	@Column(name = "id_concil_cartao_ad_sky_bk")
	private Long idConcilCartaoAdSkyBk;
	
	@Column(name = "data_concil")
	private LocalDate dataConcil;

	@Column(name = "status")
	private boolean status;

	@OneToMany(mappedBy = "concilCartaoBkoffice", 
			targetEntity = BkOfficeDetalhe.class,
			fetch = FetchType.EAGER, 
			cascade = CascadeType.ALL)
	@Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
	private List<BkOfficeDetalhe> bkofficeDetalhes;
	
	@OneToMany(mappedBy = "concilCartaoSkytef",
			targetEntity = SkytefDetalhe.class,
			fetch = FetchType.EAGER, 
			cascade = CascadeType.ALL)
	@Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
	private List<SkytefDetalhe> skytefDetalhes;
	
	@OneToMany(mappedBy = "concilCartaoAdquirente",
			targetEntity = AdquirenteDetalhe.class,
			fetch = FetchType.EAGER, 
			cascade = CascadeType.ALL)
	@Fetch(org.hibernate.annotations.FetchMode.SUBSELECT)
	private List<AdquirenteDetalhe> adquirenteDetalhes;

	public ConcilCartaoAdquirenteSkytefBkoffice(LocalDate dataConcil) {
		super();
		this.dataConcil = dataConcil;
	}

}
