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
@Table(name = "DOMINIO_GESTAO_VENDA_VISAO")
public class VisaoGestaoVendasCA implements Serializable {

    private static final long serialVersionUID = -5040071035152476709L;

    @Id
    @GeneratedValue(generator = "seqGestaoVendaVisaoCA")
    @SequenceGenerator(name = "seqGestaoVendaVisaoCA", sequenceName = "DOMINIO_VISAO_SEQ")
    @Column(name = "COD_VISAO")
    private Long codigoVisao;

    @Column(name = "DSC_VISAO")
    private String descricaoVisao;

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "DT_CRIACAO")
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;

    public Long getCodigoVisao() {
        return codigoVisao;
    }

    public void setCodigoVisao(Long codigoVisao) {
        this.codigoVisao = codigoVisao;
    }

    public String getDescricaoVisao() {
        return descricaoVisao;
    }

    public void setDescricaoVisao(String descricaoVisao) {
        this.descricaoVisao = descricaoVisao;
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
        result = prime * result + ((codigoVisao == null) ? 0 : codigoVisao.hashCode());
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
        VisaoGestaoVendasCA other = (VisaoGestaoVendasCA) obj;
        if (codigoVisao == null) {
            if (other.codigoVisao != null) {
                return false;
            }
        } else if (!codigoVisao.equals(other.codigoVisao)) {
            return false;
        }
        return true;
    }

}
