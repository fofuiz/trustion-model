package br.com.accesstage.trustion.ascartoes.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "ADM_PONTO_VENDA")
public class PontoVendaCA implements Serializable {

    private static final long serialVersionUID = 2431397298123452502L;

    @Id
    @GeneratedValue(generator = "seqPontaVendaCA", strategy = GenerationType.IDENTITY)
    @SequenceGenerator(name = "seqPontaVendaCA", sequenceName = "ADM_PONTO_VENDA_SEQ", allocationSize = 1)
    @Column(name = "COD_PONTO_VENDA")
    private Long idPontoVenda;

    @Column(name = "COD_LOJA")
    private Long idLoja;

    @Column(name = "NRO_TERMINAL")
    private String numeroTerminal;

    @Column(name = "EMPID")
    private Long idEmpresa;

    @Column(name = "DTA_CRIACAO")
    @Temporal(TemporalType.DATE)
    private Date dtaCriacao;

    @Transient
    private String nmePontoVenda;

    public Long getIdPontoVenda() {
        return idPontoVenda;
    }

    public void setIdPontoVenda(Long idPontoVenda) {
        this.idPontoVenda = idPontoVenda;
    }

    public String getNumeroTerminal() {
        return numeroTerminal;
    }

    public void setNumeroTerminal(String numeroTerminal) {
        this.numeroTerminal = numeroTerminal;
    }

    public void setDtaCriacao(Date dtaCriacao) {
        this.dtaCriacao = dtaCriacao;
    }

    public Date getDtaCriacao() {
        return dtaCriacao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((idPontoVenda == null) ? 0 : idPontoVenda.hashCode());
        return result;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Long getIdLoja() {
        return idLoja;
    }

    public void setIdLoja(Long idLoja) {
        this.idLoja = idLoja;
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
        PontoVendaCA other = (PontoVendaCA) obj;
        if (idPontoVenda == null) {
            if (other.idPontoVenda != null) {
                return false;
            }
        } else if (!idPontoVenda.equals(other.idPontoVenda)) {
            return false;
        }
        return true;
    }

    public String getNmePontoVenda() {
        return nmePontoVenda;
    }

    public void setNmePontoVenda(String nmePontoVenda) {
        this.nmePontoVenda = nmePontoVenda;
    }
}
