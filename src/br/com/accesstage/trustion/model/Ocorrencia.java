package br.com.accesstage.trustion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "t_ocorrencia")
public class Ocorrencia implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tOcorrenciaSeq")
    @SequenceGenerator(name = "tOcorrenciaSeq", sequenceName = "t_ocorrencia_seq", allocationSize = 1)
    @Column(name = "id_ocorrencia")
    private Long idOcorrencia;

    @Column(name = "id_tipo_questionamento")
    private Long idTipoQuestionamento;

    @Column(name = "valor_questionado")
    private BigDecimal valorQuestionado;

    @Column(name = "id_status_mescla")
    private Long idStatusMescla;

    public BigDecimal getValorAjuste() {
        return valorAjuste;
    }

    public void setValorAjuste(BigDecimal valorAjuste) {
        this.valorAjuste = valorAjuste;
    }

    @Column(name = "valor_ajuste")
    private BigDecimal valorAjuste;

    @Column(name = "id_tipo_status_ocorrencia")
    private Long idTipoStatusOcorrencia;

    @Column(name = "data_status_ocorrencia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataStatusOcorrencia;

    //@Null
    @Column(name = "id_ocorrencia_mescla")
    private Long idOcorrenciaMescla;

    @Column(name = "id_usuario_criacao")
    private Long idUsuarioCriacao;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Column(name = "id_usuario_alteracao")
    private Long idUsuarioAlteracao;

    @Column(name = "data_alteracao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAlteracao;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_ocorrencia_mescla")
    private List<Ocorrencia> mesclas;

    @Column(name = "is_ocorrencia_d1")
    private boolean isOcorrenciaD1;

    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
    @ManyToOne
    private Categoria categoria;

    @Column(name = "id_transportadora")
    private Long idTransportadora;

    public Ocorrencia() {
        super();
    }

    public Long getIdOcorrencia() {
        return idOcorrencia;
    }

    public void setIdOcorrencia(Long idOcorrencia) {
        this.idOcorrencia = idOcorrencia;
    }

    public Long getIdTipoQuestionamento() {
        return idTipoQuestionamento;
    }

    public void setIdTipoQuestionamento(Long idTipoQuestionamento) {
        this.idTipoQuestionamento = idTipoQuestionamento;
    }

    public BigDecimal getValorQuestionado() {
        return valorQuestionado;
    }

    public void setValorQuestionado(BigDecimal valorQuestionado) {
        this.valorQuestionado = valorQuestionado;
    }

    public Long getIdStatusMescla() {
        return idStatusMescla;
    }

    public void setIdStatusMescla(Long idStatusMescla) {
        this.idStatusMescla = idStatusMescla;
    }

    public Long getIdTipoStatusOcorrencia() {
        return idTipoStatusOcorrencia;
    }

    public void setIdTipoStatusOcorrencia(Long idTipoStatusOcorrencia) {
        this.idTipoStatusOcorrencia = idTipoStatusOcorrencia;
    }

    public Date getDataStatusOcorrencia() {
        return dataStatusOcorrencia;
    }

    public void setDataStatusOcorrencia(Date dataStatusOcorrencia) {
        this.dataStatusOcorrencia = dataStatusOcorrencia;
    }

    public Long getIdOcorrenciaMescla() {
        return idOcorrenciaMescla;
    }

    public void setIdOcorrenciaMescla(Long idOcorrenciaMescla) {
        this.idOcorrenciaMescla = idOcorrenciaMescla;
    }

    public Long getIdUsuarioCriacao() {
        return idUsuarioCriacao;
    }

    public void setIdUsuarioCriacao(Long idUsuarioCriacao) {
        this.idUsuarioCriacao = idUsuarioCriacao;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Long getIdUsuarioAlteracao() {
        return idUsuarioAlteracao;
    }

    public void setIdUsuarioAlteracao(Long idUsuarioAlteracao) {
        this.idUsuarioAlteracao = idUsuarioAlteracao;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public List<Ocorrencia> getMesclas() {
        return mesclas;
    }

    public boolean isIsOcorrenciaD1() {
        return isOcorrenciaD1;
    }

    public void setIsOcorrenciaD1(boolean isOcorrenciaD1) {
        this.isOcorrenciaD1 = isOcorrenciaD1;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Long getIdTransportadora() {
        return idTransportadora;
    }

    public void setIdTransportadora(Long idTransportadora) {
        this.idTransportadora = idTransportadora;
    }

}
