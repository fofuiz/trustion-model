package br.com.accesstage.trustion.asconciliacao.model;

import java.io.Serializable;

public class ResumoConciliacaoCartaoEntity implements Serializable {

    private Long codOperadora;
    private String nomeOperadora;
    private String dataExtrPagamento;
    private Integer numeroBanco;
    private Integer numeroAgencia;
    private String numeroConta;
    private Double valorPagamento;
    private Double valorExtrato;
    private String statusConciliado;

    public Long getCodOperadora() {
        return codOperadora;
    }

    public void setCodOperadora(Long codOperadora) {
        this.codOperadora = codOperadora;
    }

    public String getNomeOperadora() {
        return nomeOperadora;
    }

    public void setNomeOperadora(String nomeOperadora) {
        this.nomeOperadora = nomeOperadora;
    }

    public String getDataExtrPagamento() {
        return dataExtrPagamento;
    }

    public void setDataExtrPagamento(String dataExtrPagamento) {
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
        try {
            this.numeroConta = String.valueOf(Long.parseLong(numeroConta));
        } catch (Exception ex) {
            this.numeroConta = numeroConta;
        }
    }

    public Double getValorPagamento() {
        return valorPagamento;
    }

    public void setValorPagamento(Double valorPagamento) {
        this.valorPagamento = valorPagamento;
    }

    public Double getValorExtrato() {
        return valorExtrato;
    }

    public void setValorExtrato(Double valorExtrato) {
        this.valorExtrato = valorExtrato;
    }

    public String getStatusConciliado() {
        return statusConciliado;
    }

    public void setStatusConciliado(String statusConciliado) {
        this.statusConciliado = statusConciliado;
    }

    @Override
    public String toString() {
        return "ResumoConciliacaoCartaoEntity [codOperadora=" + codOperadora + ", nomeOperadora=" + nomeOperadora
                + ", dataExtrPagamento=" + dataExtrPagamento + ", numeroBanco=" + numeroBanco + ", numeroAgencia="
                + numeroAgencia + ", numeroConta=" + numeroConta + ", valorPagamentoTotal=" + valorPagamento
                + ", valorExtratoTotal=" + valorExtrato + ", statusConciliado=" + statusConciliado + "]";
    }
}
