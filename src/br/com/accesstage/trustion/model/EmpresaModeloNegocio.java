package br.com.accesstage.trustion.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "t_empresa_modelo_negocio")
public class EmpresaModeloNegocio implements Serializable {

    @EmbeddedId
    protected EmpresaModeloNegocioPK empresaModeloNegocioPK;

    @JoinColumn(name = "id_empresa", insertable = false, updatable = false)
    @ManyToOne
    private Empresa empresa;

    @JoinColumn(name = "id_modelo_negocio", referencedColumnName = "id_modelo_negocio", insertable = false, updatable = false)
    @ManyToOne
    private ModeloNegocio modeloNegocio;

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

    public EmpresaModeloNegocio() {
    }

    public EmpresaModeloNegocio(EmpresaModeloNegocioPK empresaModeloNegocioPK) {
        this.empresaModeloNegocioPK = empresaModeloNegocioPK;
    }

    public EmpresaModeloNegocio(EmpresaModeloNegocioPK empresaModeloNegocioPK, Date dataCriacao) {
        this.empresaModeloNegocioPK = empresaModeloNegocioPK;
        this.dataCriacao = dataCriacao;
    }

    public EmpresaModeloNegocio(long idEmpresa, long idModeloNegocio) {
        this.empresaModeloNegocioPK = new EmpresaModeloNegocioPK(idEmpresa, idModeloNegocio);
    }

    public EmpresaModeloNegocioPK getEmpresaModeloNegocioPK() {
        return empresaModeloNegocioPK;
    }

    public void setEmpresaModeloNegocioPK(EmpresaModeloNegocioPK empresaModeloNegocioPK) {
        this.empresaModeloNegocioPK = empresaModeloNegocioPK;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empresaModeloNegocioPK != null ? empresaModeloNegocioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof EmpresaModeloNegocio)) {
            return false;
        }
        EmpresaModeloNegocio other = (EmpresaModeloNegocio) object;
        if ((this.empresaModeloNegocioPK == null && other.empresaModeloNegocioPK != null) || (this.empresaModeloNegocioPK != null && !this.empresaModeloNegocioPK.equals(other.empresaModeloNegocioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EmpresaModeloNegocio[ empresaModeloNegocioPK=" + empresaModeloNegocioPK + " ]";
    }

}
