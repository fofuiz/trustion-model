package br.com.accesstage.trustion.asconciliacao.model;

import java.io.Serializable;

public class MotivoConciliacao implements Serializable {

    private Long codigoMotivoConciliacao;
    private String descConciliacao;
    private String statusConciliacao;
    private Long empID;

    public Long getCodigoMotivoConciliacao() {
        return codigoMotivoConciliacao;
    }

    public void setCodigoMotivoConciliacao(Long codigoMotivoConciliacao) {
        this.codigoMotivoConciliacao = codigoMotivoConciliacao;
    }

    public String getDescConciliacao() {
        return descConciliacao;
    }

    public void setDescConciliacao(String descConciliacao) {
        this.descConciliacao = descConciliacao;
    }

    public String getStatusConciliacao() {
        return statusConciliacao;
    }

    public void setStatusConciliacao(String statusConciliacao) {
        this.statusConciliacao = statusConciliacao;
    }

    public Long getEmpID() {
        return empID;
    }

    public void setEmpID(Long empID) {
        this.empID = empID;
    }
}
