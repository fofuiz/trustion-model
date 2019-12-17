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

@Entity(name = "t_coleta_gvt")
public class ColetaGTV implements Serializable {

    public ColetaGTV(ColetaGTVBuilder builder) {

        this.numSerie = builder.numSerie;
        this.idEquipamento = builder.idEquipamento;
        this.periodoInicialDt = builder.periodoInicialDt;
        this.coletaDt = builder.coletaDt;
        this.valorTotal = builder.valorTotal;
        this.numeroGVT = builder.numeroGVT;
        this.dataCriacao = builder.dataCriacao;
        this.cnpjCliente = builder.cnpjCliente;
    }

    public ColetaGTV() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tColetaGvt")
    @SequenceGenerator(name = "tColetaGvt", sequenceName = "t_coleta_gvt_seq", allocationSize = 1)
    @Column(name = "id_coleta_gvt")
    private Long idColetaGTV;

    @Column(name = "NUM_SERIE_EQUIPAMENTO")
    private String numSerie;

    @Column(name = "id_equipamento")
    private Long idEquipamento;

    @Column(name = "cnpj_cliente")
    private String cnpjCliente;

    @Column(name = "periodo_inicial_dt")
    private LocalDateTime periodoInicialDt;

    @Column(name = "coleta_dt")
    private LocalDateTime coletaDt;

    @Column(name = "valor_total_gvt")
    private BigDecimal valorTotal;

    @Column(name = "numero_gvt")
    private Long numeroGVT;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    public Long getIdColetaGTV() {
        return idColetaGTV;
    }

    public void setIdColetaGTV(Long idColetaGTV) {
        this.idColetaGTV = idColetaGTV;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public Long getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(Long idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public LocalDateTime getPeriodoInicialDt() {
        return periodoInicialDt;
    }

    public void setPeriodoInicialDt(LocalDateTime periodoInicialDt) {
        this.periodoInicialDt = periodoInicialDt;
    }

    public LocalDateTime getColetaDt() {
        return coletaDt;
    }

    public void setColetaDt(LocalDateTime coletaDt) {
        this.coletaDt = coletaDt;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Long getNumeroGVT() {
        return numeroGVT;
    }

    public void setNumeroGVT(Long numeroGVT) {
        this.numeroGVT = numeroGVT;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getCnpjCliente() {
        return cnpjCliente;
    }

    public void setCnpjCliente(String cnpjCliente) {
        this.cnpjCliente = cnpjCliente;
    }

    public static class ColetaGTVBuilder {

        private String numSerie;
        private Long idEquipamento;
        private LocalDateTime periodoInicialDt;
        private LocalDateTime coletaDt;
        private BigDecimal valorTotal;
        private Long numeroGVT;
        private LocalDateTime dataCriacao;
        private String cnpjCliente;

        public ColetaGTVBuilder(Long idEquipamento, String numSerie) {
            this.numSerie = numSerie;
            this.idEquipamento = idEquipamento;
        }

        public ColetaGTVBuilder periodoInicialDt(LocalDateTime periodoInicialDt) {
            this.periodoInicialDt = periodoInicialDt;
            return this;
        }

        public ColetaGTVBuilder cnpjCliente(String cnpjCliente) {
            this.cnpjCliente = cnpjCliente;
            return this;
        }

        public ColetaGTVBuilder coletaDt(LocalDateTime coletaDt) {
            this.coletaDt = coletaDt;
            return this;
        }

        public ColetaGTVBuilder valorTotal(BigDecimal valorTotal) {
            this.valorTotal = valorTotal;
            return this;
        }

        public ColetaGTVBuilder numeroGVT(Long numeroGVT) {
            this.numeroGVT = numeroGVT;
            return this;
        }

        public ColetaGTVBuilder dataCriacao() {
            this.dataCriacao = LocalDateTime.now();
            return this;
        }

        public ColetaGTV build() {
            return new ColetaGTV(this);
        }
    }

}
