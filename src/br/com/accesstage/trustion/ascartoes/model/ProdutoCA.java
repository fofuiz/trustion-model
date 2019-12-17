package br.com.accesstage.trustion.ascartoes.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "ADM_PRODUTO")
public class ProdutoCA implements Serializable {

    private static final long serialVersionUID = 8622679906279243655L;

    @Id
    @GeneratedValue(generator = "seqProdutoCA")
    @SequenceGenerator(name = "seqProdutoCA", sequenceName = "ADM_PRODUTO_SEQ")
    @Column(name = "COD_PRODUTO")
    private Long id;

    @Column(name = "NME_PRODUTO")
    private String nome;

    @Column(name = "IDT_PRODUTO")
    private String idtProduto;

    @Column(name = "IDT_BANDEIRA")
    private String idtBandeira;

    @Column(name = "COD_PRODUTO_EXPORTACAO")
    private String codigoExportacao;

    @Column(name = "FLG_PERMITE_SELECIONAR")
    private Integer permiteSelecionar;

    @Transient
    private String permitirSelecionarTexto;

    //getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPermiteSelecionar() {
        return permiteSelecionar;
    }

    public void setPermiteSelecionar(Integer permiteSelecionar) {
        this.permiteSelecionar = permiteSelecionar;
    }

    public String getIdtProduto() {
        return idtProduto;
    }

    public void setIdtProduto(String idtProduto) {
        this.idtProduto = idtProduto;
    }

    public String getIdtBandeira() {
        return idtBandeira;
    }

    public void setIdtBandeira(String idtBandeira) {
        this.idtBandeira = idtBandeira;
    }

    public String getCodigoExportacao() {
        return codigoExportacao;
    }

    public void setCodigoExportacao(String codigoExportacao) {
        this.codigoExportacao = codigoExportacao;
    }

    public String getPermitirSelecionarTexto() {
        return permitirSelecionarTexto;
    }

    public void setPermitirSelecionarTexto(String permitirSelecionarTexto) {
        this.permitirSelecionarTexto = permitirSelecionarTexto;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        ProdutoCA other = (ProdutoCA) obj;
        if (nome == null) {
            if (other.nome != null) {
                return false;
            }
        } else if (!nome.equals(other.nome)) {
            return false;
        }
        return true;
    }

}
