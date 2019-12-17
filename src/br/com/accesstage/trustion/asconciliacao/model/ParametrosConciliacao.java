package br.com.accesstage.trustion.asconciliacao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author raphael
 */
@Entity
@Table(name = "PARAMETROS_CONCILIACAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ParametrosConciliacao.findAll", query = "SELECT p FROM ParametrosConciliacao p"),
    @NamedQuery(name = "ParametrosConciliacao.findByCodParametro", query = "SELECT p FROM ParametrosConciliacao p WHERE p.codParametro = :codParametro"),
    @NamedQuery(name = "ParametrosConciliacao.findByValor", query = "SELECT p FROM ParametrosConciliacao p WHERE p.valor = :valor"),
    @NamedQuery(name = "ParametrosConciliacao.findByDscParametro", query = "SELECT p FROM ParametrosConciliacao p WHERE p.dscParametro = :dscParametro"),
    @NamedQuery(name = "ParametrosConciliacao.findByEmpid", query = "SELECT p FROM ParametrosConciliacao p WHERE p.empid = :empid"),
    @NamedQuery(name = "ParametrosConciliacao.findByStaAtivo", query = "SELECT p FROM ParametrosConciliacao p WHERE p.staAtivo = :staAtivo"),
    @NamedQuery(name = "ParametrosConciliacao.findByIdParametrosConciliacao", query = "SELECT p FROM ParametrosConciliacao p WHERE p.idParametrosConciliacao = :idParametrosConciliacao")})
public class ParametrosConciliacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "COD_PARAMETRO")
    private String codParametro;
    @Size(max = 4000)
    @Column(name = "VALOR")
    private String valor;
    @Size(max = 500)
    @Column(name = "DSC_PARAMETRO")
    private String dscParametro;
    @Column(name = "EMPID")
    private Integer empid;
    @Column(name = "STA_ATIVO")
    private Character staAtivo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID_PARAMETROS_CONCILIACAO")
    private BigDecimal idParametrosConciliacao;

    public ParametrosConciliacao() {
    }

    public ParametrosConciliacao(BigDecimal idParametrosConciliacao) {
        this.idParametrosConciliacao = idParametrosConciliacao;
    }

    public ParametrosConciliacao(BigDecimal idParametrosConciliacao, String codParametro) {
        this.idParametrosConciliacao = idParametrosConciliacao;
        this.codParametro = codParametro;
    }

    public String getCodParametro() {
        return codParametro;
    }

    public void setCodParametro(String codParametro) {
        this.codParametro = codParametro;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDscParametro() {
        return dscParametro;
    }

    public void setDscParametro(String dscParametro) {
        this.dscParametro = dscParametro;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Character getStaAtivo() {
        return staAtivo;
    }

    public void setStaAtivo(Character staAtivo) {
        this.staAtivo = staAtivo;
    }

    public BigDecimal getIdParametrosConciliacao() {
        return idParametrosConciliacao;
    }

    public void setIdParametrosConciliacao(BigDecimal idParametrosConciliacao) {
        this.idParametrosConciliacao = idParametrosConciliacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idParametrosConciliacao != null ? idParametrosConciliacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ParametrosConciliacao)) {
            return false;
        }
        ParametrosConciliacao other = (ParametrosConciliacao) object;
        if ((this.idParametrosConciliacao == null && other.idParametrosConciliacao != null) || (this.idParametrosConciliacao != null && !this.idParametrosConciliacao.equals(other.idParametrosConciliacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.accesstage.trustion.asconciliacao.model.ParametrosConciliacao[ idParametrosConciliacao=" + idParametrosConciliacao + " ]";
    }

}
