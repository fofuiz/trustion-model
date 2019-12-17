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

@Entity(name = "t_periodo_resumo_numerario")
public class PeriodoResumoNumerario implements Serializable {

    @Id
    @SequenceGenerator(name = "tResumoPeriodoNumerarioSeq", sequenceName = "t_periodo_resumo_numerario_seq", allocationSize = 1)
    @GeneratedValue(generator = "tResumoPeriodoNumerarioSeq", strategy = GenerationType.SEQUENCE)
    @Column(name = "id_periodo_resumo")
    private Long idPeriodoResumo;

    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "periodo_coleta")
    private Long periodoColeta;

    @Column(name = "periodo_conferencia")
    private Long periodoConferencia;

    @Column(name = "periodo_credito")
    private Long periodoCredito;

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

    public PeriodoResumoNumerario() {
    }

    public Long getIdPeriodoResumo() {
        return idPeriodoResumo;
    }

    public void setIdPeriodoResumo(Long idPeriodoResumo) {
        this.idPeriodoResumo = idPeriodoResumo;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getPeriodoColeta() {
        return periodoColeta;
    }

    public void setPeriodoColeta(Long periodoColeta) {
        this.periodoColeta = periodoColeta;
    }

    public Long getPeriodoConferencia() {
        return periodoConferencia;
    }

    public void setPeriodoConferencia(Long periodoConferencia) {
        this.periodoConferencia = periodoConferencia;
    }

    public Long getPeriodoCredito() {
        return periodoCredito;
    }

    public void setPeriodoCredito(Long periodoCredito) {
        this.periodoCredito = periodoCredito;
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
