package br.com.accesstage.trustion.ascartoes.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Caio Felipe Bispo Moraes
 * @since 17/09/2015
 */
@Entity
@Table(name = "FATO_TRANSACAO_RDC")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FatoTransacaoRdc.findAll", query = "SELECT f FROM FatoTransacaoRdcCA f"),
    @NamedQuery(name = "FatoTransacaoRdc.findByNroNsu", query = "SELECT f FROM FatoTransacaoRdcCA f WHERE f.nroNsu = :nroNsu"),
    @NamedQuery(name = "FatoTransacaoRdc.findByHash", query = "SELECT f FROM FatoTransacaoRdcCA f WHERE f.hashValue = :hashValue")
})
public class FatoTransacaoRdcCA implements Serializable {

    private static final long serialVersionUID = 5147976966604739937L;

    @Column(name = "NRO_NSU")
    private BigInteger nroNsu;
    @Size(max = 12)
    @Column(name = "COD_AUTORIZACAO")
    private String codAutorizacao;
    @Column(name = "VLR_BRUTO")
    private Long vlrBruto;
    @Column(name = "VLR_LIQUIDO")
    private Long vlrLiquido;
    @Column(name = "VLR_TAXA_ANTECIPACAO")
    private Long vlrTaxaAntecipacao;
    @Column(name = "VLR_COMISSAO")
    private Long vlrComissao;
    @Column(name = "DTA_PROCESSAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtaProcessamento;
    @Column(name = "NRO_PARCELA")
    private BigInteger nroParcela;
    @Column(name = "NRO_PLANO")
    private BigInteger nroPlano;
    @Column(name = "SEQ_ARQUIVO")
    private BigInteger seqArquivo;
    @Column(name = "COD_FATO_TRANSACAO")
    private BigInteger codFatoTransacao;
    @Column(name = "COD_STATUS")
    private BigInteger codStatus;
    @Column(name = "COD_NATUREZA")
    private BigInteger codNatureza;
    @Column(name = "COD_CAPTURA")
    private BigInteger codCaptura;
    @Size(max = 346)
    @Column(name = "COD_NUMEROCARTAO")
    private String codNumerocartao;
    @Column(name = "COD_DATA_ARQUIVO_INI")
    private BigInteger codDataArquivoIni;
    @Column(name = "COD_DATA_ARQUIVO_FIM")
    private BigInteger codDataArquivoFim;
    @Column(name = "COD_DATA_CREDITO")
    private BigInteger codDataCredito;
    @Column(name = "COD_DATA_STATUS")
    private BigInteger codDataStatus;
    @Column(name = "COD_DATA_VENDA")
    private BigInteger codDataVenda;
    @Column(name = "COD_CONTA_BANCO")
    private BigInteger codContaBanco;
    @Column(name = "FLG_ANTECIPADO")
    private BigInteger flgAntecipado;
    @Column(name = "FLG_ESTORNO")
    private BigInteger flgEstorno;
    @Column(name = "FLG_CASHBACK")
    private BigInteger flgCashback;
    @Size(max = 16)
    @Column(name = "COD_LOTE_BANDEIRA")
    private String codLoteBandeira;
    @Column(name = "COD_PRODUTO")
    private BigInteger codProduto;
    @Column(name = "EMPID")
    private Integer empid;
    @Column(name = "COD_OPERADORA")
    private BigInteger codOperadora;
    @Column(name = "COD_MOEDA")
    private BigInteger codMoeda;
    @Column(name = "COD_PAIS")
    private BigInteger codPais;
    @Column(name = "COD_AJUSTE")
    private BigInteger codAjuste;
    @Column(name = "VLR_TRANSACAO_TOTAL")
    private Long vlrTransacaoTotal;
    @Column(name = "COD_ARQUIVO")
    private BigInteger codArquivo;
    @Column(name = "COD_PONTO_VENDA")
    private BigInteger codPontoVenda;
    @Column(name = "FLG_CONCILIACAO")
    private BigInteger flgConciliacao;
    @Column(name = "DTA_CONCILIACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtaConciliacao;
    @Size(max = 50)
    @Column(name = "DSC_AREA_CLIENTE")
    private String dscAreaCliente;
    @Size(max = 40)
    @Column(name = "COD_TID_TRANSACAO")
    private String codTidTransacao;
    @Size(max = 15)
    @Column(name = "NRO_UNICO")
    private String nroUnico;
    @Column(name = "COD_BANDEIRA")
    private Short codBandeira;
    @Column(name = "VLR_LIQUIDO_ORIGINAL")
    private Long vlrLiquidoOriginal;
    @Column(name = "NRO_ANTECIPACAO")
    private Integer nroAntecipacao;
    @Column(name = "FLG_EXPORTADO")
    private Short flgExportado;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 32)
    @Column(name = "HASH_VALUE")
    private String hashValue;
    @Column(name = "COD_ARQUIVO_ANTECIPACAO")
    private BigInteger codArquivoAntecipacao;
    @Size(max = 8)
    @Column(name = "NRO_LOGICO_TERMINAL")
    private String nroLogicoTerminal;
    @Column(name = "NRO_LOTE_FINANCEIRO")
    private Long nroLoteFinanceiro;
    @Column(name = "COD_DATA_REAGENDAMENTO")
    private BigInteger codDataReagendamento;
    @Column(name = "FLG_LIQUIDADO")
    private Short flgLiquidado;

    public FatoTransacaoRdcCA() {
    }

    public FatoTransacaoRdcCA(String hashValue) {
        this.hashValue = hashValue;
    }

    public BigInteger getNroNsu() {
        return nroNsu;
    }

    public void setNroNsu(BigInteger nroNsu) {
        this.nroNsu = nroNsu;
    }

    public String getCodAutorizacao() {
        return codAutorizacao;
    }

    public void setCodAutorizacao(String codAutorizacao) {
        this.codAutorizacao = codAutorizacao;
    }

    public Long getVlrBruto() {
        return vlrBruto;
    }

    public void setVlrBruto(Long vlrBruto) {
        this.vlrBruto = vlrBruto;
    }

    public Long getVlrLiquido() {
        return vlrLiquido;
    }

    public void setVlrLiquido(Long vlrLiquido) {
        this.vlrLiquido = vlrLiquido;
    }

    public Long getVlrTaxaAntecipacao() {
        return vlrTaxaAntecipacao;
    }

    public void setVlrTaxaAntecipacao(Long vlrTaxaAntecipacao) {
        this.vlrTaxaAntecipacao = vlrTaxaAntecipacao;
    }

    public Long getVlrComissao() {
        return vlrComissao;
    }

    public void setVlrComissao(Long vlrComissao) {
        this.vlrComissao = vlrComissao;
    }

    public Date getDtaProcessamento() {
        return dtaProcessamento;
    }

    public void setDtaProcessamento(Date dtaProcessamento) {
        this.dtaProcessamento = dtaProcessamento;
    }

    public BigInteger getNroParcela() {
        return nroParcela;
    }

    public void setNroParcela(BigInteger nroParcela) {
        this.nroParcela = nroParcela;
    }

    public BigInteger getNroPlano() {
        return nroPlano;
    }

    public void setNroPlano(BigInteger nroPlano) {
        this.nroPlano = nroPlano;
    }

    public BigInteger getSeqArquivo() {
        return seqArquivo;
    }

    public void setSeqArquivo(BigInteger seqArquivo) {
        this.seqArquivo = seqArquivo;
    }

    public BigInteger getCodFatoTransacao() {
        return codFatoTransacao;
    }

    public void setCodFatoTransacao(BigInteger codFatoTransacao) {
        this.codFatoTransacao = codFatoTransacao;
    }

    public BigInteger getCodStatus() {
        return codStatus;
    }

    public void setCodStatus(BigInteger codStatus) {
        this.codStatus = codStatus;
    }

    public BigInteger getCodNatureza() {
        return codNatureza;
    }

    public void setCodNatureza(BigInteger codNatureza) {
        this.codNatureza = codNatureza;
    }

    public BigInteger getCodCaptura() {
        return codCaptura;
    }

    public void setCodCaptura(BigInteger codCaptura) {
        this.codCaptura = codCaptura;
    }

    public String getCodNumerocartao() {
        return codNumerocartao;
    }

    public void setCodNumerocartao(String codNumerocartao) {
        this.codNumerocartao = codNumerocartao;
    }

    public BigInteger getCodDataArquivoIni() {
        return codDataArquivoIni;
    }

    public void setCodDataArquivoIni(BigInteger codDataArquivoIni) {
        this.codDataArquivoIni = codDataArquivoIni;
    }

    public BigInteger getCodDataArquivoFim() {
        return codDataArquivoFim;
    }

    public void setCodDataArquivoFim(BigInteger codDataArquivoFim) {
        this.codDataArquivoFim = codDataArquivoFim;
    }

    public BigInteger getCodDataCredito() {
        return codDataCredito;
    }

    public void setCodDataCredito(BigInteger codDataCredito) {
        this.codDataCredito = codDataCredito;
    }

    public BigInteger getCodDataStatus() {
        return codDataStatus;
    }

    public void setCodDataStatus(BigInteger codDataStatus) {
        this.codDataStatus = codDataStatus;
    }

    public BigInteger getCodDataVenda() {
        return codDataVenda;
    }

    public void setCodDataVenda(BigInteger codDataVenda) {
        this.codDataVenda = codDataVenda;
    }

    public BigInteger getCodContaBanco() {
        return codContaBanco;
    }

    public void setCodContaBanco(BigInteger codContaBanco) {
        this.codContaBanco = codContaBanco;
    }

    public BigInteger getFlgAntecipado() {
        return flgAntecipado;
    }

    public void setFlgAntecipado(BigInteger flgAntecipado) {
        this.flgAntecipado = flgAntecipado;
    }

    public BigInteger getFlgEstorno() {
        return flgEstorno;
    }

    public void setFlgEstorno(BigInteger flgEstorno) {
        this.flgEstorno = flgEstorno;
    }

    public BigInteger getFlgCashback() {
        return flgCashback;
    }

    public void setFlgCashback(BigInteger flgCashback) {
        this.flgCashback = flgCashback;
    }

    public String getCodLoteBandeira() {
        return codLoteBandeira;
    }

    public void setCodLoteBandeira(String codLoteBandeira) {
        this.codLoteBandeira = codLoteBandeira;
    }

    public BigInteger getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(BigInteger codProduto) {
        this.codProduto = codProduto;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public BigInteger getCodOperadora() {
        return codOperadora;
    }

    public void setCodOperadora(BigInteger codOperadora) {
        this.codOperadora = codOperadora;
    }

    public BigInteger getCodMoeda() {
        return codMoeda;
    }

    public void setCodMoeda(BigInteger codMoeda) {
        this.codMoeda = codMoeda;
    }

    public BigInteger getCodPais() {
        return codPais;
    }

    public void setCodPais(BigInteger codPais) {
        this.codPais = codPais;
    }

    public BigInteger getCodAjuste() {
        return codAjuste;
    }

    public void setCodAjuste(BigInteger codAjuste) {
        this.codAjuste = codAjuste;
    }

    public Long getVlrTransacaoTotal() {
        return vlrTransacaoTotal;
    }

    public void setVlrTransacaoTotal(Long vlrTransacaoTotal) {
        this.vlrTransacaoTotal = vlrTransacaoTotal;
    }

    public BigInteger getCodArquivo() {
        return codArquivo;
    }

    public void setCodArquivo(BigInteger codArquivo) {
        this.codArquivo = codArquivo;
    }

    public BigInteger getCodPontoVenda() {
        return codPontoVenda;
    }

    public void setCodPontoVenda(BigInteger codPontoVenda) {
        this.codPontoVenda = codPontoVenda;
    }

    public BigInteger getFlgConciliacao() {
        return flgConciliacao;
    }

    public void setFlgConciliacao(BigInteger flgConciliacao) {
        this.flgConciliacao = flgConciliacao;
    }

    public Date getDtaConciliacao() {
        return dtaConciliacao;
    }

    public void setDtaConciliacao(Date dtaConciliacao) {
        this.dtaConciliacao = dtaConciliacao;
    }

    public String getDscAreaCliente() {
        return dscAreaCliente;
    }

    public void setDscAreaCliente(String dscAreaCliente) {
        this.dscAreaCliente = dscAreaCliente;
    }

    public String getCodTidTransacao() {
        return codTidTransacao;
    }

    public void setCodTidTransacao(String codTidTransacao) {
        this.codTidTransacao = codTidTransacao;
    }

    public String getNroUnico() {
        return nroUnico;
    }

    public void setNroUnico(String nroUnico) {
        this.nroUnico = nroUnico;
    }

    public Short getCodBandeira() {
        return codBandeira;
    }

    public void setCodBandeira(Short codBandeira) {
        this.codBandeira = codBandeira;
    }

    public Long getVlrLiquidoOriginal() {
        return vlrLiquidoOriginal;
    }

    public void setVlrLiquidoOriginal(Long vlrLiquidoOriginal) {
        this.vlrLiquidoOriginal = vlrLiquidoOriginal;
    }

    public Integer getNroAntecipacao() {
        return nroAntecipacao;
    }

    public void setNroAntecipacao(Integer nroAntecipacao) {
        this.nroAntecipacao = nroAntecipacao;
    }

    public Short getFlgExportado() {
        return flgExportado;
    }

    public void setFlgExportado(Short flgExportado) {
        this.flgExportado = flgExportado;
    }

    public String getHashValue() {
        return hashValue;
    }

    public void setHashValue(String hashValue) {
        this.hashValue = hashValue;
    }

    public BigInteger getCodArquivoAntecipacao() {
        return codArquivoAntecipacao;
    }

    public void setCodArquivoAntecipacao(BigInteger codArquivoAntecipacao) {
        this.codArquivoAntecipacao = codArquivoAntecipacao;
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

    public BigInteger getCodDataReagendamento() {
        return codDataReagendamento;
    }

    public void setCodDataReagendamento(BigInteger codDataReagendamento) {
        this.codDataReagendamento = codDataReagendamento;
    }

    public Short getFlgLiquidado() {
        return flgLiquidado;
    }

    public void setFlgLiquidado(Short flgLiquidado) {
        this.flgLiquidado = flgLiquidado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (hashValue != null ? hashValue.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FatoTransacaoRdcCA)) {
            return false;
        }
        FatoTransacaoRdcCA other = (FatoTransacaoRdcCA) object;
        if ((this.hashValue == null && other.hashValue != null) || (this.hashValue != null && !this.hashValue.equals(other.hashValue))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.accesstage.ascartoes.entity.FatoTransacaoRdc[ hashValue=" + hashValue + " ]";
    }

}
