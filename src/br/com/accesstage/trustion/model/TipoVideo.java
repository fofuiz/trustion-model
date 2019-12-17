package br.com.accesstage.trustion.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import br.com.accesstage.trustion.model.enums.TipoVideoEnum;
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
@Entity(name = "TipoVideoEntity")
@Table(name = "t_tipo_video", schema="sch_trustion")
public class TipoVideo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tTipoVideo")
	@SequenceGenerator(name = "tTipoVideo", sequenceName = "t_tipo_video_seq", allocationSize = 1)
	@Column(name = "id_tipo_video")
	private Long idTipoVideo;

	@Column(name = "tipo_video")
	@Enumerated(EnumType.STRING)
	@NotNull
	private TipoVideoEnum tipoVideo;

	@Column(name = "link")
	private String link;
	
	@ManyToMany(mappedBy = "videos")
	private List<LinkVideo> linkVideos;

}