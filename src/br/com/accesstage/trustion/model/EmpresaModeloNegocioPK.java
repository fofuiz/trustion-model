package br.com.accesstage.trustion.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;

public class EmpresaModeloNegocioPK implements Serializable {

    @NotNull
    @Column(name = "id_empresa")
    private long idEmpresa;

    @NotNull
    @Column(name = "id_modelo_negocio")
    private long idModeloNegocio;

    public EmpresaModeloNegocioPK() {
    }

    public EmpresaModeloNegocioPK(long idEmpresa, long idModeloNegocio) {
        this.idEmpresa = idEmpresa;
        this.idModeloNegocio = idModeloNegocio;
    }

    public long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public long getIdModeloNegocio() {
        return idModeloNegocio;
    }

    public void setIdModeloNegocio(long idModeloNegocio) {
        this.idModeloNegocio = idModeloNegocio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idEmpresa;
        hash += (int) idModeloNegocio;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof EmpresaModeloNegocioPK)) {
            return false;
        }
        EmpresaModeloNegocioPK other = (EmpresaModeloNegocioPK) object;
        if (this.idEmpresa != other.idEmpresa) {
            return false;
        }
        if (this.idModeloNegocio != other.idModeloNegocio) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EmpresaModeloNegocioPK[ idEmpresa=" + idEmpresa + ", idModeloNegocio=" + idModeloNegocio + " ]";
    }

}
