package br.com.accesstage.trustion.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "t_tipo_status_ocorrencia")
public class TipoStatusOcorrencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tTipoStatusOcorrenciaSeq")
    @SequenceGenerator(name = "tTipoStatusOcorrenciaSeq", sequenceName = "t_tipo_status_ocorrencia_seq", allocationSize = 1)
    @Column(name = "id_tipo_status_ocorrencia")
    private Long idTipoStatusOcorrencia;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Column(name = "id_usuario_criacao")
    private Long idUsuarioCriacao;

    @Column(name = "data_alteracao")
    private Date dataAlteracao;

    @Column(name = "id_usuario_alteracao")
    private Long idUsuarioAlteracao;

    public TipoStatusOcorrencia() {
        super();
    }

    public Long getIdTipoStatusOcorrencia() {
        return idTipoStatusOcorrencia;
    }

    public void setIdTipoStatusOcorrencia(Long idTipoStatusOcorrencia) {
        this.idTipoStatusOcorrencia = idTipoStatusOcorrencia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Long getIdUsuarioCriacao() {
        return idUsuarioCriacao;
    }

    public void setIdUsuarioCriacao(Long idUsuarioCriacao) {
        this.idUsuarioCriacao = idUsuarioCriacao;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public Long getIdUsuarioAlteracao() {
        return idUsuarioAlteracao;
    }

    public void setIdUsuarioAlteracao(Long idUsuarioAlteracao) {
        this.idUsuarioAlteracao = idUsuarioAlteracao;
    }
}
