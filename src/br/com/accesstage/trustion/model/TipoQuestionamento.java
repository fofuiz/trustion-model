package br.com.accesstage.trustion.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Size;

@Entity(name = "t_tipo_questionamento")
public class TipoQuestionamento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tTipoQuestionamentoSeq")
    @SequenceGenerator(name = "tTipoQuestionamentoSeq", sequenceName = "t_tipo_questionamento_seq", allocationSize = 1)
    @Column(name = "id_tipo_questionamento")
    private Long idTipoQuestionamento;

    @Column(name = "descricao")
    @Size(min = 3, max = 150)
    private String descricao;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @Column(name = "id_usuario_criacao")
    private Long idUsuarioCriacao;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario_criacao", insertable = false, updatable = false)
    private Usuario usuarioCriacao;

    @Column(name = "data_alteracao")
    private LocalDateTime dataAlteracao;

    @Column(name = "id_usuario_alteracao")
    private Long idUsuarioAlteracao;
    
    @ManyToOne
    @JoinColumn(name = "id_usuario_alteracao", insertable = false, updatable = false)
    private Usuario usuarioAlteracao;

    public TipoQuestionamento() {
        super();
    }

    public Long getIdTipoQuestionamento() {
        return idTipoQuestionamento;
    }

    public void setIdTipoQuestionamento(Long idTipoQuestionamento) {
        this.idTipoQuestionamento = idTipoQuestionamento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Long getIdUsuarioCriacao() {
        return idUsuarioCriacao;
    }

    public void setIdUsuarioCriacao(Long idUsuarioCriacao) {
        this.idUsuarioCriacao = idUsuarioCriacao;
    }

    public LocalDateTime getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(LocalDateTime dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public Long getIdUsuarioAlteracao() {
        return idUsuarioAlteracao;
    }

    public void setIdUsuarioAlteracao(Long idUsuarioAlteracao) {
        this.idUsuarioAlteracao = idUsuarioAlteracao;
    }

    public Usuario getUsuarioCriacao() {
        return usuarioCriacao;
    }

    public void setUsuarioCriacao(Usuario usuarioCriacao) {
        this.usuarioCriacao = usuarioCriacao;
        this.idUsuarioCriacao = usuarioCriacao.getIdUsuario();
    }

    public Usuario getUsuarioAlteracao() {
        return usuarioAlteracao;
    }

    public void setUsuarioAlteracao(Usuario usuarioAlteracao) {
        this.usuarioAlteracao = usuarioAlteracao;
        this.idUsuarioAlteracao = usuarioAlteracao.getIdUsuario();
    }
    
    @PrePersist
    private void prePersist() {
        dataCriacao = LocalDateTime.now();
    }
    
    @PreUpdate
    private void preUpdate() {
        dataAlteracao = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "TipoQuestionamento{" + "idTipoQuestionamento=" + idTipoQuestionamento + ", descricao=" + descricao + ", dataCriacao=" + dataCriacao + ", idUsuarioCriacao=" + idUsuarioCriacao + ", usuarioCriacao=" + usuarioCriacao + ", dataAlteracao=" + dataAlteracao + ", idUsuarioAlteracao=" + idUsuarioAlteracao + ", usuarioAlteracao=" + usuarioAlteracao + '}';
    }
    
    
}
