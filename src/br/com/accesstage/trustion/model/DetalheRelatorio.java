package br.com.accesstage.trustion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "t_detalhe_relatorio")
public class DetalheRelatorio implements Serializable {

    public DetalheRelatorio() {
    }

    public DetalheRelatorio(DetalheRelatorioBuilder builder) {
        this.numSerie = builder.numSerie;
        this.depositoDT = builder.depositoDT;
        this.codigoMovimento = builder.codigoMovimento;
        this.depositante = builder.depositante;
        this.tipoDeposito = builder.tipoDeposito;
        this.codigoFechamento = builder.codigoFechamento;
        this.sequencia = builder.sequencia;
        this.valorTotal = builder.valorTotal;
        this.dataCriacao = builder.dataCriacao;
        this.idEquipamento = builder.idEquipamento;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tDetalheRelatorioSeq")
    @SequenceGenerator(name = "tDetalheRelatorioSeq", sequenceName = "t_detalhe_relatorio_seq", allocationSize = 1)
    @Column(name = "ID_DETALHE_RELATORIO")
    private Long idDetalheRelatorio;

    @Column(name = "id_equipamento")
    private Long idEquipamento;

    @Column(name = "NUM_SERIE_EQUIPAMENTO")
    private String numSerie;

    @Column(name = "deposito_dt")
    private LocalDateTime depositoDT;

    @Column(name = "cod_movimento")
    private Long codigoMovimento;

    @Column(name = "depositante")
    private String depositante;

    @Column(name = "tipo_deposito")
    private String tipoDeposito;

    @Column(name = "codigo_fechamento")
    private Long codigoFechamento;

    @Column(name = "sequencia")
    private Long sequencia;

    @Column(name = "valor_total")
    private BigDecimal valorTotal;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    public Long getIdDetalheRelatorio() {
        return idDetalheRelatorio;
    }

    public void setIdDetalheRelatorio(Long idDetalheRelatorio) {
        this.idDetalheRelatorio = idDetalheRelatorio;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public LocalDateTime getDepositoDT() {
        return depositoDT;
    }

    public void setDepositoDT(LocalDateTime depositoDT) {
        this.depositoDT = depositoDT;
    }

    public Long getCodigoMovimento() {
        return codigoMovimento;
    }

    public void setCodigoMovimento(Long codigoMovimento) {
        this.codigoMovimento = codigoMovimento;
    }

    public String getDepositante() {
        return depositante;
    }

    public void setDepositante(String depositante) {
        this.depositante = depositante;
    }

    public String getTipoDeposito() {
        return tipoDeposito;
    }

    public void setTipoDeposito(String tipoDeposito) {
        this.tipoDeposito = tipoDeposito;
    }

    public Long getCodigoFechamento() {
        return codigoFechamento;
    }

    public void setCodigoFechamento(Long codigoFechamento) {
        this.codigoFechamento = codigoFechamento;
    }

    public Long getSequencia() {
        return sequencia;
    }

    public void setSequencia(Long sequencia) {
        this.sequencia = sequencia;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Long getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(Long idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public static class DetalheRelatorioBuilder {

        private String numSerie;
        private LocalDateTime depositoDT;
        private Long codigoMovimento;
        private String depositante;
        private String tipoDeposito;
        private Long codigoFechamento;
        private Long sequencia;
        private BigDecimal valorTotal;
        private LocalDateTime dataCriacao;
        private Long idEquipamento;

        public DetalheRelatorioBuilder(String numSerie, LocalDateTime depositoDT) {
            this.numSerie = numSerie;
            this.depositoDT = depositoDT;
        }

        public DetalheRelatorioBuilder idEquipamento(Long idEquipamento) {
            this.idEquipamento = idEquipamento;
            return this;
        }

        public DetalheRelatorioBuilder codigoMovimento(Long codigoMovimento) {
            this.codigoMovimento = codigoMovimento;
            return this;
        }

        public DetalheRelatorioBuilder depositante(String depositante) {
            this.depositante = depositante;
            return this;
        }

        public DetalheRelatorioBuilder tipoDeposito(String tipoDeposito) {
            this.tipoDeposito = tipoDeposito;
            return this;
        }

        public DetalheRelatorioBuilder codigoFechamento(Long codigoFechamento) {
            this.codigoFechamento = codigoFechamento;
            return this;
        }

        public DetalheRelatorioBuilder sequencia(Long sequencia) {
            this.sequencia = sequencia;
            return this;
        }

        public DetalheRelatorioBuilder valorTotal(BigDecimal valorTotal) {
            this.valorTotal = valorTotal;
            return this;
        }

        public DetalheRelatorioBuilder dataCriacao() {
            this.dataCriacao = LocalDateTime.now();
            return this;
        }

        public DetalheRelatorio build() {

            return new DetalheRelatorio(this);
        }
    }

}
