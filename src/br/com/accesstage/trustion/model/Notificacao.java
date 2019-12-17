package br.com.accesstage.trustion.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "t_notificacao")
public class Notificacao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tNotificacaoSeq")
    @SequenceGenerator(name = "tNotificacaoSeq", sequenceName = "t_notificacao_seq", allocationSize = 1)
    @Column(name = "id_notificacao")
    private Long idNotificacao;

    @Column(name = "id_grupo_economico")
    private Long idGrupoEconomico;

    @Column(name = "id_empresa")
    private Long idEmpresa;

    @Column(name = "id_tipo_notificacao")
    private Long idTipoNotificacao;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @Column(name = "status")
    private String status;

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

    @Column(name = "id_transportadora")
    private Long idTransportadora;

    public Long getIdNotificacao() {
        return idNotificacao;
    }

    public Long getIdGrupoEconomico() {
        return idGrupoEconomico;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public Long getIdTipoNotificacao() {
        return idTipoNotificacao;
    }

    public void setIdNotificacao(Long idNotificacao) {
        this.idNotificacao = idNotificacao;
    }

    public void setIdGrupoEconomico(Long idGrupoEconomico) {
        this.idGrupoEconomico = idGrupoEconomico;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public void setIdTipoNotificacao(Long idTipoNotificacao) {
        this.idTipoNotificacao = idTipoNotificacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public Long getIdUsuarioCriacao() {
        return idUsuarioCriacao;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public Long getIdUsuarioAlteracao() {
        return idUsuarioAlteracao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setIdUsuarioCriacao(Long idUsuarioCriacao) {
        this.idUsuarioCriacao = idUsuarioCriacao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public void setIdUsuarioAlteracao(Long idUsuarioAlteracao) {
        this.idUsuarioAlteracao = idUsuarioAlteracao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Long getIdTransportadora() {
        return idTransportadora;
    }

    public void setIdTransportadora(Long idTransportadora) {
        this.idTransportadora = idTransportadora;
    }

}
