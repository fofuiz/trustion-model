package br.com.accesstage.trustion.ascartoes.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "DOMINIO_STATUS_CONCILIACAO")
public class StatusConciliacaoCA implements Serializable {

    private static final long serialVersionUID = -1865065133549076383L;

    @Id
    @GeneratedValue(generator = "seqStatusConciliacaoCA")
    @SequenceGenerator(name = "seqStatusConciliacaoCA", sequenceName = "DOMINIO_STATUS_CONC_SEQ")
    @Column(name = "COD_CONCILIACAO")
    private String id;

    @Column(name = "DSC_CONCILIACAO")
    private String dscStaConciliacao;

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "DT_CRIACAO")
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDscStaConciliacao() {
        return dscStaConciliacao;
    }

    public void setDscStaConciliacao(String dscStaConciliacao) {
        this.dscStaConciliacao = dscStaConciliacao;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        StatusConciliacaoCA other = (StatusConciliacaoCA) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

}
