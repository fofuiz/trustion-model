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

@Entity(name = "T_CONCILIADO")
public class Conciliado implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "extConciliadoSeq")
    @SequenceGenerator(name = "extConciliadoSeq", sequenceName = "t_conciliado_seq", allocationSize = 1)
    @Column(name = "ID_CONCILIACAO")
    private Long idConciliado;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "DATA_LANCAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataLancamento;

    @Column(name = "DATA_CONCILIACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataConciliacao;

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

    public Conciliado() {
    }
    
    public Conciliado(String cnpj, Date dataLancamento, Date dataConciliacao, Date dataCriacao) {
        this.cnpj = cnpj;
        this.dataLancamento = dataLancamento;
        this.dataConciliacao = dataConciliacao;
        this.dataCriacao = dataCriacao;
    }

    public Long getIdConciliado() {
        return idConciliado;
    }

    public void setIdConciliado(Long idConciliado) {
        this.idConciliado = idConciliado;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Date getDataConciliacao() {
        return dataConciliacao;
    }

    public void setDataConciliacao(Date dataConciliacao) {
        this.dataConciliacao = dataConciliacao;
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
