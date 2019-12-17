/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.accesstage.trustion.fornax.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author caiomoraes
 */
@Entity
@Table(name = "CSFROMTO")
public class CsFromTo implements Serializable {

    @Id
    @Column(name = "ID_CSFROMTO")
    private Long id;
    @Column(name = "CODCLI")
    private String codCliente;
    @Column(name = "TPDADO")
    private String tpDado;
    @Column(name = "VALORDE")
    private String valorDe;
    @Column(name = "VALORPARA")
    private String valorPara;
    @Column(name = "DESCRICAO")
    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getTpDado() {
        return tpDado;
    }

    public void setTpDado(String tpDado) {
        this.tpDado = tpDado;
    }

    public String getValorDe() {
        return valorDe;
    }

    public void setValorDe(String valorDe) {
        this.valorDe = valorDe;
    }

    public String getValorPara() {
        return valorPara;
    }

    public void setValorPara(String valorPara) {
        this.valorPara = valorPara;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
