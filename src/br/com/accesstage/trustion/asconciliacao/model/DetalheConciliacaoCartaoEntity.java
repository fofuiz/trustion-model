package br.com.accesstage.trustion.asconciliacao.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class DetalheConciliacaoCartaoEntity implements Serializable {

    private Long id;
    private Long codEmpresa;
    private Long codOperadora;
    private Long codGrupoOperacao;
    private Integer codMovimento;
    private String nomeOperadora;
    private String nomeProduto;
    private Date dataExtrPagamento;
    private Integer numeroBanco;
    private Integer numeroAgencia;
    private String numeroConta;
    private BigDecimal valorPagamento;
    private String tipoConciliacao;
    private String status;
    private String nomeArquivoOrigem;
    private String hashValue;

    private String statusConciliado;
    private Date dataConciliado;
    private String moduloConciliado;
    private Long numeroConciliado;
    private String statusPreProcessamento;
    private String motivoConciliacao;
    private String dscExtrHistorico;
    private String dscExtrDocumento;
    private Long nroGrupoConciliado;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(Long codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public Long getCodOperadora() {
        return codOperadora;
    }

    public void setCodOperadora(Long codOperadora) {
        this.codOperadora = codOperadora;
    }

    public Long getCodGrupoOperacao() {
        return id;
    }

    public void setCodGrupoOperacao(Long codGrupoOperacao) {
        this.codGrupoOperacao = codGrupoOperacao;
    }

    public Integer getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(Integer codMovimento) {
        this.codMovimento = codMovimento;
    }

    public String getNomeOperadora() {
        return nomeOperadora;
    }

    public void setNomeOperadora(String nomeOperadora) {
        this.nomeOperadora = nomeOperadora;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Date getDataExtrPagamento() {
        return dataExtrPagamento;
    }

    public void setDataExtrPagamento(Date dataExtrPagamento) {
        this.dataExtrPagamento = dataExtrPagamento;
    }

    public Integer getNumeroBanco() {
        return numeroBanco;
    }

    public void setNumeroBanco(Integer numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    public Integer getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public BigDecimal getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(BigDecimal valorPagamento) {
        BigDecimal hundred = new BigDecimal("100");
        this.valorPagamento = valorPagamento.divide(hundred);
    }

    public String getTipoConciliacao() {
        return tipoConciliacao;
    }

    public void setTipoConciliacao(String tipoConciliacao) {
        this.tipoConciliacao = tipoConciliacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getNomeArquivoOrigem() {
        return nomeArquivoOrigem;
    }

    public void setNomeArquivoOrigem(String nomeArquivoOrigem) {
        this.nomeArquivoOrigem = nomeArquivoOrigem;
    }

    public String getHashValue() {
        return hashValue;
    }

    public void setHashValue(String hashValue) {
        this.hashValue = hashValue;
    }

    public String getStatusConciliado() {
        return statusConciliado;
    }

    public void setStatusConciliado(String statusConciliado) {
        this.statusConciliado = statusConciliado;
    }

    public Date getDataConciliado() {
        return dataConciliado;
    }

    public void setDataConciliado(Date dataConciliado) {
        this.dataConciliado = dataConciliado;
    }

    public String getModuloConciliado() {
        return moduloConciliado;
    }

    public void setModuloConciliado(String moduloConciliado) {
        this.moduloConciliado = moduloConciliado;
    }

    public Long getNumeroConciliado() {
        return numeroConciliado;
    }

    public void setNumeroConciliado(Long numeroConciliado) {
        this.numeroConciliado = numeroConciliado;
    }

    public String getStatusPreProcessamento() {
        return statusPreProcessamento;
    }

    public void setStatusPreProcessamento(String statusPreProcessamento) {
        this.statusPreProcessamento = statusPreProcessamento;
    }

    public String getMotivoConciliacao() {
        return motivoConciliacao;
    }

    public void setMotivoConciliacao(String motivoConciliacao) {
        this.motivoConciliacao = motivoConciliacao;
    }

    public String getDscExtrHistorico() {
        return dscExtrHistorico;
    }

    public void setDscExtrHistorico(String dscExtrHistorico) {
        this.dscExtrHistorico = dscExtrHistorico;
    }

    public String getDscExtrDocumento() {
        return dscExtrDocumento;
    }

    public void setDscExtrDocumento(String dscExtrDocumento) {
        this.dscExtrDocumento = dscExtrDocumento;
    }

    public Long getNroGrupoConciliado() {
        return nroGrupoConciliado;
    }

    public void setNroGrupoConciliado(Long nroGrupoConciliado) {
        this.nroGrupoConciliado = nroGrupoConciliado;
    }

    @Override
    public String toString() {
        return "DetalheConciliacaoCartaoEntity [id=" + id + ", codEmpresa=" + codEmpresa + ", codOperadora="
                + codOperadora + ", nomeProduto=" + nomeProduto + ",codGrupoOperacao=" + codGrupoOperacao + ", codMovimento=" + codMovimento
                + ", nomeOperadora=" + nomeOperadora + ", dataExtrPagamento=" + dataExtrPagamento + ", numeroBanco="
                + numeroBanco + ", numeroAgencia=" + numeroAgencia + ", numeroConta=" + numeroConta
                + ", valorPagamento=" + valorPagamento + ", tipoConciliacao=" + tipoConciliacao + ", status=" + status
                + ", nomeArquivoOrigem=" + nomeArquivoOrigem + ", hashValue=" + hashValue + ", statusConciliado="
                + statusConciliado + ", dataConciliado=" + dataConciliado + ", moduloConciliado=" + moduloConciliado
                + ", numeroConciliado=" + numeroConciliado + ", statusPreProcessamento=" + statusPreProcessamento
                + ", dscExtrHistorico=" + dscExtrHistorico + ", dscExtrDocumento=" + dscExtrDocumento
                + ", motivoConciliacao=" + motivoConciliacao + " , nroGrupoConciliado=" + nroGrupoConciliado + "]";
    }
}
