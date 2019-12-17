package br.com.accesstage.trustion.ascartoes.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "ADM_PRODUTO_OPERADORA")
@IdClass(AdmProdutoOperadoraPK.class)
public class ProdutoOperadoraCA implements Serializable {

    private static final long serialVersionUID = 3865310227717977625L;

    public ProdutoOperadoraCA() {
        super();
    }

    @Id
    @Column(name = "COD_OPERADORA", nullable = false)
    private Long codOperadora;
    @Id
    @Column(name = "COD_PRODUTO", nullable = false)
    private Long codProduto;
    @Id
    @Column(name = "COD_PRODUTO_OPERADORA", nullable = false, length = 10)
    private String codProdutoOperadora;

    @Transient
    private ProdutoCA produto;

    public ProdutoOperadoraCA(Long codOperadora, Long codProduto,
            String codProdutoOperadora) {
        this.codOperadora = codOperadora;
        this.codProduto = codProduto;
        this.codProdutoOperadora = codProdutoOperadora;
    }

    public ProdutoOperadoraCA(ProdutoOperadoraCA pca, ProdutoCA p) {
        this(pca.codOperadora, pca.codProduto, pca.codProdutoOperadora);
        this.produto = p;
    }

    public ProdutoOperadoraCA(Long codigoProduto, String nomeProduto,
            Integer permiteSelecionar) {
        this.produto = new ProdutoCA();
        produto.setId(codigoProduto);
        produto.setNome(nomeProduto);
        produto.setPermiteSelecionar(permiteSelecionar);
    }

    public ProdutoOperadoraCA(String codigoProdutoOperadora, Long codigoProduto, String nomeProduto, String idtProduto, String idtBandeira, String codigoExportacao,
            Integer permiteSelecionar) {
        this.codProdutoOperadora = codigoProdutoOperadora;
        this.produto = new ProdutoCA();
        produto.setId(codigoProduto);
        produto.setNome(nomeProduto);
        produto.setPermiteSelecionar(permiteSelecionar);
        produto.setIdtProduto(idtProduto);
        produto.setIdtBandeira(idtBandeira);
        produto.setCodigoExportacao(codigoExportacao);

    }

    public Long getCodOperadora() {
        return codOperadora;
    }

    public void setCodOperadora(Long codOperadora) {
        this.codOperadora = codOperadora;
    }

    public Long getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Long codProduto) {
        this.codProduto = codProduto;
    }

    public String getCodProdutoOperadora() {
        return codProdutoOperadora;
    }

    public void setCodProdutoOperadora(String codProdutoOperadora) {
        this.codProdutoOperadora = codProdutoOperadora;
    }

    public ProdutoCA getProduto() {
        return produto;
    }
}
