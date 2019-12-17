package br.com.accesstage.trustion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "T_EXT_ELEGIVEL")
public class ExtratoElegivel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "extElegivelSeq")
    @SequenceGenerator(name = "extElegivelSeq", sequenceName = "t_ext_elegivel_seq", allocationSize = 1)
    @Column(name = "ID_EXT_ELEGIVEL")
    private Long idExtElegivel;

    @Column(name = "CODIGO_BANCO")
    private Integer codigoBanco;

    @Column(name = "CONTA")
    private Integer conta;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "AGENCIA")
    private Integer agencia;

    @Column(name = "DATA_LANCAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataLancamento;

    @Column(name = "VALOR_LANCAMENTO")
    private BigDecimal valorLancamento;

    @Column(name = "HISTORICO_LANCAMENTO")
    private String historicoLancamento;

    @Column(name = "ID_CONCILIACAO")
    private Long idConciliacao;

    public ExtratoElegivel() {

    }

    public ExtratoElegivel(Integer codigoBanco, Integer agencia, Date dataLancamento,
            BigDecimal valorLancamento, String historicoLancamento, Long idConciliacao, String cnpj, Integer conta) {
        this.codigoBanco = codigoBanco;
        this.agencia = agencia;
        this.dataLancamento = dataLancamento;
        this.valorLancamento = valorLancamento;
        this.historicoLancamento = historicoLancamento;
        this.idConciliacao = idConciliacao;
        this.cnpj = cnpj;
        this.conta = conta;
    }

    public Long getIdExtElegivel() {
        return idExtElegivel;
    }

    public void setIdExtElegivel(Long idExtElegivel) {
        this.idExtElegivel = idExtElegivel;
    }

    public Integer getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(Integer codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public Integer getAgencia() {
        return agencia;
    }

    public void setAgencia(Integer agencia) {
        this.agencia = agencia;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public BigDecimal getValorLancamento() {
        return valorLancamento;
    }

    public void setValorLancamento(BigDecimal valorLancamento) {
        this.valorLancamento = valorLancamento;
    }

    public String getHistoricoLancamento() {
        return historicoLancamento;
    }

    public void setHistoricoLancamento(String historicoLancamento) {
        this.historicoLancamento = historicoLancamento;
    }

    public Long getIdConciliacao() {
        return idConciliacao;
    }

    public void setIdConciliacao(Long idConciliacao) {
        this.idConciliacao = idConciliacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    }

}
