package br.com.accesstage.trustion.ascartoes.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DOMINIO_TIPO_EXTRATO")
public class OpcaoExtratoCA implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "COD_OPCAO_EXTRATO")
    private Long codigoOpcaoExtrato;

    @Column(name = "DESCRICAO_OPCAO_EXTRATO")
    private String descricaoOpcaoExtrato;

    public Long getCodigoOpcaoExtrato() {
        return codigoOpcaoExtrato;
    }

    public void setCodigoOpcaoExtrato(Long codigoOpcaoExtrato) {
        this.codigoOpcaoExtrato = codigoOpcaoExtrato;
    }

    public String getDescricaoOpcaoExtrato() {
        return descricaoOpcaoExtrato;
    }

    public void setDescricaoOpcaoExtrato(String descricaoOpcaoExtrato) {
        this.descricaoOpcaoExtrato = descricaoOpcaoExtrato;
    }

}
