package br.com.accesstage.trustion.ascartoes.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "ADM_TAXA_ADMIN")
public class TaxaAdministrativa implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "seqTaxaAdmin", sequenceName = "ADM_TAXA_ADMIN_SEQ", allocationSize = 1)
    @GeneratedValue(generator = "seqTaxaAdmin", strategy = GenerationType.SEQUENCE)
    @Column(name = "COD_TAXA_ADMIN")
    private Long codTaxaAdministrativa;

    @Column(name = "EMPID")
    private Long codEmp;

    @Column(name = "COD_PONTO_VENDA")
    private Long codPontoVenda;

    @Column(name = "COD_OPERADORA")
    private Long codOperadora;

    @Column(name = "COD_PRODUTO")
    private Long codProduto;

    @Column(name = "NRO_PLANO")
    private Long nroPlano;

    @Column(name = "TX_ADM_CADASTRADA")
    private BigDecimal txAdmCadastrada;

    @Column(name = "COD_USUARIO")
    private Long codUsuario;

    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "DTA_ALTERACAO")
    private Date dtaAlteracao;

    @Transient
    private PontoVendaCA loja;

    @Transient
    private ProdutoCA produto;

    @Transient
    private OperadoraCA operadora;

    @Transient
    private String nmeLoja;

    @Transient
    private String nmePontoVenda;

    @Transient
    private String nmeOperadora;

    @Transient
    private String nome;

    public TaxaAdministrativa() {
        super();
    }

    public Long getCodTaxaAdministrativa() {
        return codTaxaAdministrativa;
    }

    public void setCodTaxaAdministrativa(Long codTaxaAdministrativa) {
        this.codTaxaAdministrativa = codTaxaAdministrativa;
    }

    public Long getCodEmp() {
        return codEmp;
    }

    public void setCodEmp(Long codEmp) {
        this.codEmp = codEmp;
    }

    public Long getCodPontoVenda() {
        return codPontoVenda;
    }

    public void setCodPontoVenda(Long codPontoVenda) {
        this.codPontoVenda = codPontoVenda;
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

    public Long getNroPlano() {
        return nroPlano;
    }

    public void setNroPlano(Long nroPlano) {
        this.nroPlano = nroPlano;
    }

    public BigDecimal getTxAdmCadastrada() {
        return txAdmCadastrada;
    }

    public void setTxAdmCadastrada(BigDecimal txAdmCadastrada) {
        this.txAdmCadastrada = txAdmCadastrada;
    }

    public Long getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Long codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Date getDtaAlteracao() {
        return dtaAlteracao;
    }

    public void setDtaAlteracao(Date dtaAlteracao) {
        this.dtaAlteracao = dtaAlteracao;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof TaxaAdministrativa)) {
            return false;
        }
        final TaxaAdministrativa other = (TaxaAdministrativa) object;
        if (!(codTaxaAdministrativa == null ? other.codTaxaAdministrativa == null : codTaxaAdministrativa.equals(other.codTaxaAdministrativa))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 37;
        int result = 1;
        result = PRIME * result + ((codTaxaAdministrativa == null) ? 0 : codTaxaAdministrativa.hashCode());
        return result;
    }

    public ProdutoCA getProduto() {
        return produto;
    }

    public void setProduto(ProdutoCA produto) {
        this.produto = produto;
    }

    public OperadoraCA getOperadora() {
        return operadora;
    }

    public void setOperadora(OperadoraCA operadora) {
        this.operadora = operadora;
    }

    public PontoVendaCA getLoja() {
        return loja;
    }

    public void setLoja(PontoVendaCA loja) {
        this.loja = loja;
    }

    public String getNmeLoja() {
        return nmeLoja;
    }

    public void setNmeLoja(String nmeLoja) {
        this.nmeLoja = nmeLoja;
    }

    public String getNmePontoVenda() {
        return nmePontoVenda;
    }

    public void setNmePontoVenda(String nmePontoVenda) {
        this.nmePontoVenda = nmePontoVenda;
    }

    public String getNmeOperadora() {
        return nmeOperadora;
    }

    public void setNmeOperadora(String nmeOperadora) {
        this.nmeOperadora = nmeOperadora;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
