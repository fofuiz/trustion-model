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

@Entity(name = "t_atividade")
public class Atividade implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tAtividadeSeq")
    @SequenceGenerator(name = "tAtividadeSeq", sequenceName = "t_atividade_seq", allocationSize = 1)
    @Column(name = "id_atividade")
    private Long idAtividade;

    @Column(name = "id_ocorrencia")
    private Long idOcorrencia;

    @Column(name = "id_tipo_status_ocorrencia")
    private Long idtTipoOcorrencia;

    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "data_horario")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHorario;

    @Column(name = "atividade")
    private String atividade;

    @Column(name = "tipo_atividade")
    private String tipoAtividade;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Column(name = "id_usuario_criacao")
    private Long idUsuarioCriacao;

    @Column(name = "data_alteracao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAlteracao;

    @Column(name = "id_usuario_alteracao")
    private Long idUsuarioAlteracao;

    @Column(name = "responsavel")
    private String responsavel;

    @Column(name = "id_motivo")
    private Long idMotivo;

    @Column(name = "fl_mescla")
    private boolean isMescla;

    public Atividade() {
        super();
    }

    public Long getIdAtividade() {
        return idAtividade;
    }

    public void setIdAtividade(Long idAtividade) {
        this.idAtividade = idAtividade;
    }

    public Long getIdtTipoOcorrencia() {
        return idtTipoOcorrencia;
    }

    public void setIdtTipoOcorrencia(Long idtTipoOcorrencia) {
        this.idtTipoOcorrencia = idtTipoOcorrencia;
    }

    public Long getIdOcorrencia() {
        return idOcorrencia;
    }

    public void setIdOcorrencia(Long idOcorrencia) {
        this.idOcorrencia = idOcorrencia;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Date getDataHorario() {
        return dataHorario;
    }

    public void setDataHorario(Date dataHorario) {
        this.dataHorario = dataHorario;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
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

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Long getIdMotivo() {
        return idMotivo;
    }

    public void setIdMotivo(Long idMotivo) {
        this.idMotivo = idMotivo;
    }

    public boolean isMescla() {
        return isMescla;
    }

    public void setMescla(boolean isMescla) {
        this.isMescla = isMescla;
    }

    public boolean isIsMescla() {
        return isMescla;
    }

    public void setIsMescla(boolean isMescla) {
        this.isMescla = isMescla;
    }

}
