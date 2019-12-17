package br.com.accesstage.trustion.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "t_cofre")
public class Cofre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tCofreSeq")
    @SequenceGenerator(name = "tCofreSeq", sequenceName = "t_cofre_seq", allocationSize = 1)
    @Column(name = "id_cofre")
    private Long idCofre;

    @Column(name = "id_equipamento")
    private Long idEquipamento;

    @Column(name = "num_serie")
    private String numSerie;

    @Column(name = "cod_cofre_transportadora")
    private Long codCofreTransportadora;


    @Column(name = "id_grupo_economico")
    private Long idGrupoEconomico;

    @Column(name = "id_empresa")
    private Long idEmpresa;
    
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa", insertable = false, updatable = false)
    @OneToOne
    private Empresa empresa;
    

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

    @Column(name = "status")
    private String status;

    @Column(name = "id_modelo_negocio")
    private Long idModeloNegocio;

    @JoinColumn(name = "id_modelo_negocio", referencedColumnName = "id_modelo_negocio", insertable = false, updatable = false)
    @OneToOne  
    private ModeloNegocio modeloNegocio;

    public Long getIdCofre() {
        return idCofre;
    }

    public Long getIdEquipamento() {
        return idEquipamento;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public Long getIdGrupoEconomico() {
        return idGrupoEconomico;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
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

    public void setIdCofre(Long idCofre) {
        this.idCofre = idCofre;
    }

    public void setIdEquipamento(Long idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public void setIdGrupoEconomico(Long idGrupoEconomico) {
        this.idGrupoEconomico = idGrupoEconomico;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCodCofreTransportadora() {
        return codCofreTransportadora;
    }

    public void setCodCofreTransportadora(Long codCofreTransportadora) {
        this.codCofreTransportadora = codCofreTransportadora;
    }

    public Long getIdModeloNegocio() {
        return idModeloNegocio;
    }

    public void setIdModeloNegocio(Long idModeloNegocio) {
        this.idModeloNegocio = idModeloNegocio;
    }
    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public ModeloNegocio getModeloNegocio() {
        return modeloNegocio;
    }

    public void setModeloNegocio(ModeloNegocio modeloNegocio) {
        this.modeloNegocio = modeloNegocio;
    }
    
    

}
