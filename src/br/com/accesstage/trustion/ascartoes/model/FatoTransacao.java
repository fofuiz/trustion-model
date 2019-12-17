package br.com.accesstage.trustion.ascartoes.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "FATO_TRANSACAO")
@NamedQueries({
    @NamedQuery(name = "FatoTransacao.findByHash", query = "SELECT f FROM FatoTransacao f WHERE f.hashValue = :hashValue")
})
public class FatoTransacao implements Serializable {

    private static final long serialVersionUID = -9185559308459232443L;

    @Id
    @Column(name = "HASH_VALUE", nullable = false, length = 32)
    private String hashValue;

    @Column(name = "COD_AJUSTE")
    private Long codAjuste;

    @Column(name = "COD_ARQUIVO")
    private Long codArquivo;

    @Column(name = "COD_ARQUIVO_ANTECIPACAO")
    private Long codArquivoAntecipacao;

    @Column(name = "COD_AUTORIZACAO", length = 12)
    private String codAutorizacao;

    @Column(name = "COD_BANDEIRA")
    private Long codBandeira;

    @Column(name = "COD_CAPTURA")
    private Long codCaptura;

    @Column(name = "COD_DATA_ARQUIVO_FIM")
    private Long codDataArquivoFim;

    @Column(name = "COD_DATA_ARQUIVO_INI")
    private Long codDataArquivoIni;

    @Column(name = "COD_DATA_CREDITO")
    private Long codDataCredito;

    @Column(name = "COD_DATA_STATUS")
    private Long codDataStatus;

    @Column(name = "COD_DATA_VENDA")
    private Long codDataVenda;

    @Column(name = "COD_FATO_TRANSACAO")
    private Long codFatoTransacao;

    @Column(name = "COD_LOTE_BANDEIRA", length = 16)
    private String codLoteBandeira;

    @Column(name = "COD_MOEDA")
    private Long codMoeda;

    @Column(name = "COD_NATUREZA")
    private Long codNatureza;

    @Column(name = "COD_NUMEROCARTAO", length = 346)
    private String codNumerocartao;

    @Column(name = "COD_OPERADORA")
    private Long codOperadora;

    @Column(name = "COD_PAIS")
    private Long codPais;

    @Column(name = "COD_PONTO_VENDA")
    private Long codPontoVenda;

    @Transient
    private Long codProduto;

    @Column(name = "COD_STATUS")
    private Long codStatus;

    @Column(name = "COD_TID_TRANSACAO", length = 40)
    private String codTidTransacao;

    @Column(name = "DSC_AREA_CLIENTE", length = 50)
    private String dscAreaCliente;

    @Column(name = "DTA_CONCILIACAO")
    @Temporal(value = TemporalType.DATE)
    private Date dtaConciliacao;

    @Column(name = "DTA_PROCESSAMENTO")
    private Timestamp dtaProcessamento;

    @Column(name = "EMPID")
    private Long empid;

    @Column(name = "FLG_ANTECIPADO")
    private Long flgAntecipado;

    @Column(name = "FLG_CASHBACK")
    private Long flgCashback;

    @Column(name = "FLG_CONCILIACAO")
    private Long flgConciliacao;

    @Column(name = "FLG_ESTORNO")
    private Long flgEstorno;

    @Column(name = "FLG_EXPORTADO")
    private Long flgExportado;

    @Column(name = "NRO_ANTECIPACAO")
    private Long nroAntecipacao;

    @Column(name = "NRO_LOGICO_TERMINAL", length = 8)
    private String nroLogicoTerminal;

    @Column(name = "NRO_LOTE_FINANCEIRO")
    private Long nroLoteFinanceiro;

    @Column(name = "NRO_NSU")
    private Long nroNsu;

    @Column(name = "NRO_PARCELA")
    private Long nroParcela;

    @Column(name = "NRO_PLANO")
    private Long nroPlano;

    @Column(name = "NRO_UNICO", length = 15)
    private String nroUnico;

    @Column(name = "SEQ_ARQUIVO")
    private Long seqArquivo;

    @Column(name = "VLR_BRUTO")
    private Long vlrBruto;

    @Column(name = "VLR_COMISSAO")
    private Long vlrComissao;

    @Column(name = "VLR_LIQUIDO")
    private Long vlrLiquido;

    @Column(name = "VLR_LIQUIDO_ORIGINAL")
    private Long vlrLiquidoOriginal;

    @Column(name = "VLR_TAXA_ANTECIPACAO")
    private Long vlrTaxaAntecipacao;

    @Column(name = "VLR_TRANSACAO_TOTAL")
    private Long vlrTransacaoTotal;

    @Column(name = "FLG_LIQUIDADO")
    private Short flgLiquidado;

    @ManyToOne
    @JoinColumn(name = "cod_produto")
    private ProdutoCA produto;

    @ManyToOne
    @JoinColumn(name = "COD_CONTA_BANCO")
    private ContaBanco contaBanco;

    public FatoTransacao() {
        super();
    }

    // getters e setters
    public Long getCodAjuste() {
        return codAjuste;
    }

    public void setCodAjuste(Long codAjuste) {
        this.codAjuste = codAjuste;
    }

    public Long getCodArquivo() {
        return codArquivo;
    }

    public void setCodArquivo(Long codArquivo) {
        this.codArquivo = codArquivo;
    }

    public Long getCodArquivoAntecipacao() {
        return codArquivoAntecipacao;
    }

    public void setCodArquivoAntecipacao(Long codArquivoAntecipacao) {
        this.codArquivoAntecipacao = codArquivoAntecipacao;
    }

    public String getCodAutorizacao() {
        return codAutorizacao;
    }

    public void setCodAutorizacao(String codAutorizacao) {
        this.codAutorizacao = codAutorizacao;
    }

    public Long getCodBandeira() {
        return codBandeira;
    }

    public void setCodBandeira(Long codBandeira) {
        this.codBandeira = codBandeira;
    }

    public Long getCodCaptura() {
        return codCaptura;
    }

    public void setCodCaptura(Long codCaptura) {
        this.codCaptura = codCaptura;
    }

    public Long getCodDataArquivoFim() {
        return codDataArquivoFim;
    }

    public void setCodDataArquivoFim(Long codDataArquivoFim) {
        this.codDataArquivoFim = codDataArquivoFim;
    }

    public Long getCodDataArquivoIni() {
        return codDataArquivoIni;
    }

    public void setCodDataArquivoIni(Long codDataArquivoIni) {
        this.codDataArquivoIni = codDataArquivoIni;
    }

    public Long getCodDataCredito() {
        return codDataCredito;
    }

    public void setCodDataCredito(Long codDataCredito) {
        this.codDataCredito = codDataCredito;
    }

    public Long getCodDataStatus() {
        return codDataStatus;
    }

    public void setCodDataStatus(Long codDataStatus) {
        this.codDataStatus = codDataStatus;
    }

    public Long getCodDataVenda() {
        return codDataVenda;
    }

    public void setCodDataVenda(Long codDataVenda) {
        this.codDataVenda = codDataVenda;
    }

    public Long getCodFatoTransacao() {
        return codFatoTransacao;
    }

    public void setCodFatoTransacao(Long codFatoTransacao) {
        this.codFatoTransacao = codFatoTransacao;
    }

    public String getCodLoteBandeira() {
        return codLoteBandeira;
    }

    public void setCodLoteBandeira(String codLoteBandeira) {
        this.codLoteBandeira = codLoteBandeira;
    }

    public Long getCodMoeda() {
        return codMoeda;
    }

    public void setCodMoeda(Long codMoeda) {
        this.codMoeda = codMoeda;
    }

    public Long getCodNatureza() {
        return codNatureza;
    }

    public void setCodNatureza(Long codNatureza) {
        this.codNatureza = codNatureza;
    }

    public String getCodNumerocartao() {
        return codNumerocartao;
    }

    public void setCodNumerocartao(String codNumerocartao) {
        this.codNumerocartao = codNumerocartao;
    }

    public Long getCodOperadora() {
        return codOperadora;
    }

    public void setCodOperadora(Long codOperadora) {
        this.codOperadora = codOperadora;
    }

    public Long getCodPais() {
        return codPais;
    }

    public void setCodPais(Long codPais) {
        this.codPais = codPais;
    }

    public Long getCodPontoVenda() {
        return codPontoVenda;
    }

    public void setCodPontoVenda(Long codPontoVenda) {
        this.codPontoVenda = codPontoVenda;
    }

    public Long getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Long codProduto) {
        this.codProduto = codProduto;
    }

    public Long getCodStatus() {
        return codStatus;
    }

    public void setCodStatus(Long codStatus) {
        this.codStatus = codStatus;
    }

    public String getCodTidTransacao() {
        return codTidTransacao;
    }

    public void setCodTidTransacao(String codTidTransacao) {
        this.codTidTransacao = codTidTransacao;
    }

    public String getDscAreaCliente() {
        return dscAreaCliente;
    }

    public void setDscAreaCliente(String dscAreaCliente) {
        this.dscAreaCliente = dscAreaCliente;
    }

    public Date getDtaConciliacao() {
        return dtaConciliacao;
    }

    public void setDtaConciliacao(Date dtaConciliacao) {
        this.dtaConciliacao = dtaConciliacao;
    }

    public Timestamp getDtaProcessamento() {
        return dtaProcessamento;
    }

    public void setDtaProcessamento(Timestamp dtaProcessamento) {
        this.dtaProcessamento = dtaProcessamento;
    }

    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }

    public Long getFlgAntecipado() {
        return flgAntecipado;
    }

    public void setFlgAntecipado(Long flgAntecipado) {
        this.flgAntecipado = flgAntecipado;
    }

    public Long getFlgCashback() {
        return flgCashback;
    }

    public void setFlgCashback(Long flgCashback) {
        this.flgCashback = flgCashback;
    }

    public Long getFlgConciliacao() {
        return flgConciliacao;
    }

    public void setFlgConciliacao(Long flgConciliacao) {
        this.flgConciliacao = flgConciliacao;
    }

    public Long getFlgEstorno() {
        return flgEstorno;
    }

    public void setFlgEstorno(Long flgEstorno) {
        this.flgEstorno = flgEstorno;
    }

    public Long getFlgExportado() {
        return flgExportado;
    }

    public void setFlgExportado(Long flgExportado) {
        this.flgExportado = flgExportado;
    }

    public String getHashValue() {
        return hashValue;
    }

    public void setHashValue(String hashValue) {
        this.hashValue = hashValue;
    }

    public Long getNroAntecipacao() {
        return nroAntecipacao;
    }

    public void setNroAntecipacao(Long nroAntecipacao) {
        this.nroAntecipacao = nroAntecipacao;
    }

    public String getNroLogicoTerminal() {
        return nroLogicoTerminal;
    }

    public void setNroLogicoTerminal(String nroLogicoTerminal) {
        this.nroLogicoTerminal = nroLogicoTerminal;
    }

    public Long getNroLoteFinanceiro() {
        return nroLoteFinanceiro;
    }

    public void setNroLoteFinanceiro(Long nroLoteFinanceiro) {
        this.nroLoteFinanceiro = nroLoteFinanceiro;
    }

    public Long getNroNsu() {
        return nroNsu;
    }

    public void setNroNsu(Long nroNsu) {
        this.nroNsu = nroNsu;
    }

    public Long getNroParcela() {
        return nroParcela;
    }

    public void setNroParcela(Long nroParcela) {
        this.nroParcela = nroParcela;
    }

    public Long getNroPlano() {
        return nroPlano;
    }

    public void setNroPlano(Long nroPlano) {
        this.nroPlano = nroPlano;
    }

    public String getNroUnico() {
        return nroUnico;
    }

    public void setNroUnico(String nroUnico) {
        this.nroUnico = nroUnico;
    }

    public Long getSeqArquivo() {
        return seqArquivo;
    }

    public void setSeqArquivo(Long seqArquivo) {
        this.seqArquivo = seqArquivo;
    }

    public Long getVlrBruto() {
        return vlrBruto;
    }

    public void setVlrBruto(Long vlrBruto) {
        this.vlrBruto = vlrBruto;
    }

    public Long getVlrComissao() {
        return vlrComissao;
    }

    public void setVlrComissao(Long vlrComissao) {
        this.vlrComissao = vlrComissao;
    }

    public Long getVlrLiquido() {
        return vlrLiquido;
    }

    public void setVlrLiquido(Long vlrLiquido) {
        this.vlrLiquido = vlrLiquido;
    }

    public Long getVlrLiquidoOriginal() {
        return vlrLiquidoOriginal;
    }

    public void setVlrLiquidoOriginal(Long vlrLiquidoOriginal) {
        this.vlrLiquidoOriginal = vlrLiquidoOriginal;
    }

    public Long getVlrTaxaAntecipacao() {
        return vlrTaxaAntecipacao;
    }

    public void setVlrTaxaAntecipacao(Long vlrTaxaAntecipacao) {
        this.vlrTaxaAntecipacao = vlrTaxaAntecipacao;
    }

    public Long getVlrTransacaoTotal() {
        return vlrTransacaoTotal;
    }

    public void setVlrTransacaoTotal(Long vlrTransacaoTotal) {
        this.vlrTransacaoTotal = vlrTransacaoTotal;
    }

    public ProdutoCA getProduto() {
        return produto;
    }

    public void setProduto(ProdutoCA produto) {
        this.produto = produto;
    }

    public ContaBanco getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(ContaBanco contaBanco) {
        this.contaBanco = contaBanco;
    }

    public Short getFlgLiquidado() {
        return flgLiquidado;
    }

    public void setFlgLiquidado(Short flgLiquidado) {
        this.flgLiquidado = flgLiquidado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((hashValue == null) ? 0 : hashValue.hashCode());
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
        final FatoTransacao other = (FatoTransacao) obj;
        if (hashValue == null) {
            if (other.hashValue != null) {
                return false;
            }
        } else if (!hashValue.equals(other.hashValue)) {
            return false;
        }
        return true;
    }

}
