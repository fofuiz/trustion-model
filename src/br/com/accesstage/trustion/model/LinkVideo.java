package br.com.accesstage.trustion.model;

import lombok.*;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "LinkVideoEntity")
@Table(name = "t_link_video", schema="sch_trustion")
public class LinkVideo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tLinkVideo")
	@SequenceGenerator(name = "tLinkVideo", sequenceName = "t_link_video_seq", allocationSize = 1)
	@Column(name = "id_link_video")
	private Long idLinkVideo;
	
	@Column(name = "gtv")
	private Long gtv;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(name = "t_link_video_tipo",
	joinColumns = @JoinColumn(
			name = "link_video_id", referencedColumnName = "id_link_video"), 
	inverseJoinColumns = @JoinColumn(
		name = "tipo_video_id", referencedColumnName = "id_tipo_video"))
	private List<TipoVideo> videos;

	public LinkVideo(Long gtv, List<TipoVideo> tipos) {
		this.gtv = gtv;
		this.videos = tipos;
	}

}