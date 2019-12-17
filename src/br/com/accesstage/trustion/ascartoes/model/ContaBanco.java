package br.com.accesstage.trustion.ascartoes.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DIM_CONTA_BANCO")
public class ContaBanco implements Serializable {

    private static final long serialVersionUID = -4450005183226139547L;

    @Id
    @Column(name = "COD_CONTA_BANCO")
    private Long codContaBanco;

    @Column(name = "DSC_CONTA_BANCO")
    private String dscContaBanco;

    @Column(name = "NRO_BANCO")
    private Integer nroBanco;

    @Column(name = "NRO_CONTA_CORRENTE")
    private String nroContaCorrente;

    @Column(name = "NRO_AGENCIA")
    private Integer nroAgencia;

    //getters e setters
    public Long getCodContaBanco() {
        return codContaBanco;
    }

    public void setCodContaBanco(Long codContaBanco) {
        this.codContaBanco = codContaBanco;
    }

    public String getDscContaBanco() {
        return dscContaBanco;
    }

    public void setDscContaBanco(String dscContaBanco) {
        this.dscContaBanco = dscContaBanco;
    }

    public Integer getNroBanco() {
        return nroBanco;
    }

    public void setNroBanco(Integer nroBanco) {
        this.nroBanco = nroBanco;
    }

    public String getNroContaCorrente() {
        return nroContaCorrente;
    }

    public void setNroContaCorrente(String nroContaCorrente) {
        this.nroContaCorrente = nroContaCorrente;
    }

    public Integer getNroAgencia() {
        return nroAgencia;
    }

    public void setNroAgencia(Integer nroAgencia) {
        this.nroAgencia = nroAgencia;
    }
}
