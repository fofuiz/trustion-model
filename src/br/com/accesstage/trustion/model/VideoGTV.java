package br.com.accesstage.trustion.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.TimeZone;

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

@Entity(name = "VideoGTVEntity")
@Table(name = "t_video_gtv", schema="sch_trustion")
public class VideoGTV implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tVideoGtv")
	@SequenceGenerator(name = "tVideoGtv", sequenceName = "t_video_gtv_seq", allocationSize = 1)
	@Column(name = "id_video_gtv")
	private Long idVideoGTV;

	@Column(name = "data_gtv")
    @Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(pattern = "dd/MM/yyyy", locale = "pt-BR", timezone = "Brazil/East")
	private Date dataVideoGtv;

	@Column(name = "numero_loja")
	private Long numeroLoja;

	@Column(name = "id_loja_descricao")
	private String idLojaDescricao;

	@Column(name = "cnpj_loja")
	private String cnpj;

	@Column(name = "numero_gtv")
	private Long gtv;

	@Column(name = "link_video")
	private String link;

	public Long getIdVideoGTV() {
		return idVideoGTV;
	}

	public void setIdVideoGTV(Long idVideoGTV) {
		this.idVideoGTV = idVideoGTV;
	}

	public Date getDataVideoGtv() {
		return dataVideoGtv;
	}

	public void setDataVideoGtv(Date dataVideoGtv) {
		this.dataVideoGtv = dataVideoGtv;
	}

	public Long getNumeroLoja() {
		return numeroLoja;
	}

	public void setNumeroLoja(Long numeroLoja) {
		this.numeroLoja = numeroLoja;
	}

	public String getIdLojaDescricao() {
		return idLojaDescricao;
	}

	public void setIdLojaDescricao(String idLojaDescricao) {
		this.idLojaDescricao = idLojaDescricao;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Long getGtv() {
		return gtv;
	}

	public void setGtv(Long gtv) {
		this.gtv = gtv;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
