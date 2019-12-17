package br.com.accesstage.trustion.ascartoes.model;

import java.io.Serializable;

public class AdmProdutoOperadoraPK implements Serializable {

    private static final long serialVersionUID = 2107892686078366177L;
    private Long codOperadora;
    private Long codProduto;
    private String codProdutoOperadora;

    public AdmProdutoOperadoraPK() {
    }

    public AdmProdutoOperadoraPK(Long codOperadora, Long codProduto,
            String codProdutoOperadora) {
        this.codOperadora = codOperadora;
        this.codProduto = codProduto;
        this.codProdutoOperadora = codProdutoOperadora;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof AdmProdutoOperadoraPK) {
            final AdmProdutoOperadoraPK otherAdmProdutoOperadoraPK = (AdmProdutoOperadoraPK) other;
            final boolean areEqual = (otherAdmProdutoOperadoraPK.codOperadora
                    .equals(codOperadora)
                    && otherAdmProdutoOperadoraPK.codProduto.equals(codProduto) && otherAdmProdutoOperadoraPK.codProdutoOperadora
                    .equals(codProdutoOperadora));
            return areEqual;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    Long getCodOperadora() {
        return codOperadora;
    }

    void setCodOperadora(Long codOperadora) {
        this.codOperadora = codOperadora;
    }

    Long getCodProduto() {
        return codProduto;
    }

    void setCodProduto(Long codProduto) {
        this.codProduto = codProduto;
    }

    String getCodProdutoOperadora() {
        return codProdutoOperadora;
    }

    void setCodProdutoOperadora(String codProdutoOperadora) {
        this.codProdutoOperadora = codProdutoOperadora;
    }
}
