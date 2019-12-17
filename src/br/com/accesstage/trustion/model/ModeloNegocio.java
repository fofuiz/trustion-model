package br.com.accesstage.trustion.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity(name = "t_modelo_negocio")
public class ModeloNegocio implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tModeloNegocioSeq")
    @SequenceGenerator(name = "tModeloNegocioSeq", sequenceName = "t_modelo_negocio_seq", allocationSize = 1)
    @Column(name = "id_modelo_negocio")
    private Long idModeloNegocio;

    @Column(name = "nome")
    private String nome;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "id_tipo_servico")
    private Long idTipoServico;

    @Column(name = "id_tipo_credito")
    private Long idTipoCredito;

    @Column(name = "qtd_dias_conferencia_credito")
    private Integer quantidadeDiasConfCredito;

    @Column(name = "horario_corte_credito")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horarioCorteCredito;

    @Column(name = "horario_corte_envio_banco")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horarioCorteEnvioBanco;

    @Column(name = "horario_credito_conta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horarioCreditoConta;

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

    @ManyToOne
    @JoinColumn(referencedColumnName = "id_transportadora", name = "id_transportadora", insertable = false, updatable = false)
    private Transportadora transportadora;

    @OneToMany(mappedBy = "modeloNegocio")
    private List<EmpresaModeloNegocio> empresaModeloNegocioCollection;

    public ModeloNegocio() {
        super();
    }

    public Long getIdModeloNegocio() {
        return idModeloNegocio;
    }

    public void setIdModeloNegocio(Long idModeloNegocio) {
        this.idModeloNegocio = idModeloNegocio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getIdTipoServico() {
        return idTipoServico;
    }

    public void setIdTipoServico(Long idTipoServico) {
        this.idTipoServico = idTipoServico;
    }

    public Long getIdTipoCredito() {
        return idTipoCredito;
    }

    public void setIdTipoCredito(Long idTipoCredito) {
        this.idTipoCredito = idTipoCredito;
    }

    public Date getHorarioCorteCredito() {
        return horarioCorteCredito;
    }

    public void setHorarioCorteCredito(Date horarioCorteCredito) {
        this.horarioCorteCredito = horarioCorteCredito;
    }

    public Date getHorarioCorteEnvioBanco() {
        return horarioCorteEnvioBanco;
    }

    public void setHorarioCorteEnvioBanco(Date horarioCorteEnvioBanco) {
        this.horarioCorteEnvioBanco = horarioCorteEnvioBanco;
    }

    public Date getHorarioCreditoConta() {
        return horarioCreditoConta;
    }

    public void setHorarioCreditoConta(Date horarioCreditoConta) {
        this.horarioCreditoConta = horarioCreditoConta;
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

    public Integer getQuantidadeDiasConfCredito() {
        return quantidadeDiasConfCredito;
    }

    public void setQuantidadeDiasConfCredito(Integer quantidadeDiasConfCredito) {
        this.quantidadeDiasConfCredito = quantidadeDiasConfCredito;
    }

    public Long getIdTransportadora() {
        return idTransportadora;
    }

    public void setIdTransportadora(Long idTransportadora) {
        this.idTransportadora = idTransportadora;
    }

    public List<EmpresaModeloNegocio> getEmpresaModeloNegocioCollection() {
        return empresaModeloNegocioCollection;
    }

    public void setEmpresaModeloNegocioCollection(List<EmpresaModeloNegocio> empresaModeloNegocioCollection) {
        this.empresaModeloNegocioCollection = empresaModeloNegocioCollection;
    }

    public Transportadora getTransportadora() {
        return transportadora;
    }

    public void setTransportadora(Transportadora transportadora) {
        this.transportadora = transportadora;
    }

}
