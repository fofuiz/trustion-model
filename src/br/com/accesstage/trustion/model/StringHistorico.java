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

@Entity(name = "t_string_historico")
public class StringHistorico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tStringHistoricoSeq")
    @SequenceGenerator(name = "tStringHistoricoSeq", sequenceName = "t_string_historico_seq", allocationSize = 1)
    @Column(name = "id_string_historico")
    private Long idStringHistorico;

    @Column(name = "id_lista_banco")
    private Long idListaBanco;

    @Column(name = "texto")
    private String texto;

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

    @Column(name = "flag")
    private String flag;

    public StringHistorico() {
    }

    public Long getIdStringHistorico() {
        return idStringHistorico;
    }

    public void setIdStringHistorico(Long idStringHistorico) {
        this.idStringHistorico = idStringHistorico;
    }

    public Long getIdListaBanco() {
        return idListaBanco;
    }

    public void setIdListaBanco(Long idListaBanco) {
        this.idListaBanco = idListaBanco;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
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

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
