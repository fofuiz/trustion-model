package br.com.accesstage.trustion.ascartoes.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "REMESSA_CONCILIACAO_DETALHE")
@NamedQueries({
    @NamedQuery(name = "RemessaConciliacaoDetalhe.findById", query = "SELECT f FROM FatoTransacaoElvCA f")
})
public class RemessaConciliacaoDetalhe implements Serializable {

    private static final long serialVersionUID = 682551211001004041L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqRemessaDetalhe")
    @SequenceGenerator(name = "seqRemessaDetalhe", sequenceName = "REMESSA_CONC_DETALHE_SEQ", allocationSize = 1)
    @Column(name = "COD_DETALHE", nullable = false)
    private Long codDetalhe;
    @Column(name = "COD_NSU")
    private Long codNsu;
    @Column(name = "COD_OPERADORA")
    private Long codOperadora;
    @Column(name = "COD_PONTO_VENDA")
    private Long codPontoVenda;
    @Column(name = "COD_PRODUTO")
    private Long codProduto;
    @Column(name = "COD_TIPO_ARQUIVO")
    private Long codTipoArquivo;
    @Column(name = "DSC_AREA_CLIENTE", length = 50)
    private String dscAreaCliente;
    @Column(name = "DSC_AUTORIZACAO", length = 15)
    private String dscAutorizacao;
    @Column(name = "DSC_AUTORIZACAO_CONCILIACAO", length = 15)
    private String dscAutorizacaoConciliacao;
    @Column(name = "DTA_CONCILIACAO")
    @Temporal(value = TemporalType.DATE)
    private Date dtaConciliacao;
    @Column(name = "DTA_VENDA")
    private Long dtaVenda;
    @Column(name = "EMPID")
    private Long empid;
    @Column(name = "FLG_CONCILIACAO", nullable = false)
    private Long flgConciliacao;
    @Column(name = "FLG_EXCLUSAO", nullable = false)
    private Long flgExclusao;
    @Column(name = "NRO_CAIXA", length = 6)
    private String nroCaixa;
    @Column(name = "NRO_PARCELA")
    private Long nroParcela;
    @Column(name = "NRO_PLANO")
    private Long nroPlano;
    @Column(name = "NRO_SEQ_REGISTRO")
    private Long nroSeqRegistro;
    @Column(name = "TPO_PRODUTO")
    private String tpoProduto;
    @Column(name = "VLR_BRUTO")
    private Double vlrBruto;
    @Column(name = "USER_EXCLUSAO")
    private String userExclusao;
    @Column(name = "HASH_VALUE")
    private String hashValue;
    @ManyToOne
    @JoinColumn(name = "COD_HEADER")
    private RemessaConciliacaoHeader remessaConciliacaoHeader;
    @Column(name = "COD_USUARIO")
    private Long codUsuario;
    @Column(name = "STA_CONCILIACAO")
    private String staConciliacao;
    @Column(name = "COD_ARQUIVO")
    private Long codigoArquivo;

    public RemessaConciliacaoDetalhe() {
    }

    public RemessaConciliacaoDetalhe(Long codDetalhe, RemessaConciliacaoHeader remessaConciliacaoHeader, Long codNsu,
            Long codOperadora, Long codPontoVenda, Long codProduto, Long codTipoArquivo, String dscAreaCliente,
            String dscAutorizacao, Date dtaConciliacao, Long dtaVenda, Long empid, Long flgConciliacao, Long flgExclusao,
            String nroCaixa, Long nroParcela, Long nroPlano, Long nroSeqRegistro, String tpoProduto, Double vlrBruto,
            String userExclusao, String hashValue) {
        this.codDetalhe = codDetalhe;
        this.remessaConciliacaoHeader = remessaConciliacaoHeader;
        this.codNsu = codNsu;
        this.codOperadora = codOperadora;
        this.codPontoVenda = codPontoVenda;
        this.codProduto = codProduto;
        this.codTipoArquivo = codTipoArquivo;
        this.dscAreaCliente = dscAreaCliente;
        this.dscAutorizacao = dscAutorizacao;
        this.dtaConciliacao = dtaConciliacao;
        this.dtaVenda = dtaVenda;
        this.empid = empid;
        this.flgConciliacao = flgConciliacao;
        this.flgExclusao = flgExclusao;
        this.nroCaixa = nroCaixa;
        this.nroParcela = nroParcela;
        this.nroPlano = nroPlano;
        this.nroSeqRegistro = nroSeqRegistro;
        this.tpoProduto = tpoProduto;
        this.vlrBruto = vlrBruto;
        this.userExclusao = userExclusao;
        this.hashValue = hashValue;
    }

    public Long getCodDetalhe() {
        return codDetalhe;
    }

    public void setCodDetalhe(Long codDetalhe) {
        this.codDetalhe = codDetalhe;
    }

    public Long getCodNsu() {
        return codNsu;
    }

    public void setCodNsu(Long codNsu) {
        this.codNsu = codNsu;
    }

    public Long getCodOperadora() {
        return codOperadora;
    }

    public void setCodOperadora(Long codOperadora) {
        this.codOperadora = codOperadora;
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

    public Long getCodTipoArquivo() {
        return codTipoArquivo;
    }

    public void setCodTipoArquivo(Long codTipoArquivo) {
        this.codTipoArquivo = codTipoArquivo;
    }

    public String getDscAreaCliente() {
        return dscAreaCliente;
    }

    public void setDscAreaCliente(String dscAreaCliente) {
        this.dscAreaCliente = dscAreaCliente;
    }

    public String getDscAutorizacao() {
        return dscAutorizacao;
    }

    public void setDscAutorizacao(String dscAutorizacao) {
        this.dscAutorizacao = dscAutorizacao;
    }

    public Date getDtaConciliacao() {
        return dtaConciliacao;
    }

    public void setDtaConciliacao(Date dtaConciliacao) {
        this.dtaConciliacao = dtaConciliacao;
    }

    public Long getDtaVenda() {
        return dtaVenda;
    }

    public void setDtaVenda(Long dtaVenda) {
        this.dtaVenda = dtaVenda;
    }

    public Long getEmpid() {
        return empid;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }

    public Long getFlgConciliacao() {
        return flgConciliacao;
    }

    public void setFlgConciliacao(Long flgConciliacao) {
        this.flgConciliacao = flgConciliacao;
    }

    public Long getFlgExclusao() {
        return flgExclusao;
    }

    public void setFlgExclusao(Long flgExclusao) {
        this.flgExclusao = flgExclusao;
    }

    public String getNroCaixa() {
        return nroCaixa;
    }

    public void setNroCaixa(String nroCaixa) {
        this.nroCaixa = nroCaixa;
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

    public Long getNroSeqRegistro() {
        return nroSeqRegistro;
    }

    public void setNroSeqRegistro(Long nroSeqRegistro) {
        this.nroSeqRegistro = nroSeqRegistro;
    }

    public String getTpoProduto() {
        return tpoProduto;
    }

    public void setTpoProduto(String tpoProduto) {
        this.tpoProduto = tpoProduto;
    }

    public Double getVlrBruto() {
        return vlrBruto;
    }

    public void setVlrBruto(Double vlrBruto) {
        this.vlrBruto = vlrBruto;
    }

    public RemessaConciliacaoHeader getRemessaConciliacaoHeader() {
        return remessaConciliacaoHeader;
    }

    public void setRemessaConciliacaoHeader(RemessaConciliacaoHeader remessaConciliacaoHeader) {
        this.remessaConciliacaoHeader = remessaConciliacaoHeader;
    }

    public void setUserExclusao(String userExclusao) {
        this.userExclusao = userExclusao;
    }

    public String getUserExclusao() {
        return userExclusao;
    }

    public void setHashValue(String hashValue) {
        this.hashValue = hashValue;
    }

    public String getHashValuee() {
        return hashValue;
    }

    public void setCodUsuario(Long codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Long getCodUsuario() {
        return codUsuario;
    }

    public void setStaConciliacao(String staConciliacao) {
        this.staConciliacao = staConciliacao;
    }

    public String getStaConciliacao() {
        return staConciliacao;
    }

    public void setDscAutorizacaoConciliacao(String dscAutorizacaoConciliacao) {
        this.dscAutorizacaoConciliacao = dscAutorizacaoConciliacao;
    }

    public String getDscAutorizacaoConciliacao() {
        return dscAutorizacaoConciliacao;
    }

    public Long getCodigoArquivo() {
        return codigoArquivo;
    }

    public void setCodigoArquivo(Long codigoArquivo) {
        this.codigoArquivo = codigoArquivo;
    }

}
