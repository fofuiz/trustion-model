package br.com.accesstage.trustion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "t_detalhe_conferencia")
public class DetalheConferencia implements Serializable {

    public DetalheConferencia() {
    }

    public DetalheConferencia(DetalheConferenciaBuilder detalheConferenciaBuilder) {
        this.numSerieEquipamento = detalheConferenciaBuilder.numSerieEquipamento;
        this.idEquipamento = detalheConferenciaBuilder.idEquipamento;
        this.cnpjCliente = detalheConferenciaBuilder.cnpjCliente;
        this.numeroGVT = detalheConferenciaBuilder.numeroGVT;
        this.valorDeclarado = detalheConferenciaBuilder.valorDeclarado;
        this.dataConferencia = detalheConferenciaBuilder.dataConferencia;
        this.valorConferido = detalheConferenciaBuilder.valorConferido;
        this.dataCriacao = detalheConferenciaBuilder.dataCriacao;
        this.dataRecolhimento = detalheConferenciaBuilder.dataRecolhimento;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tDetalheConferenciaSeq")
    @SequenceGenerator(name = "tDetalheConferenciaSeq", sequenceName = "t_detalhe_conferencia_seq", allocationSize = 1)
    @Column(name = "id_detalhe_conferencia")
    private Long idDetalheConferencia;

    @Column(name = "num_serie_equipamento")
    private String numSerieEquipamento;

    @Column(name = "id_equipamento")
    private Long idEquipamento;

    @Column(name = "cnpj_cliente")
    private String cnpjCliente;

    @Column(name = "dt_recolhimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataRecolhimento;

    @Column(name = "numero_gvt")
    private String numeroGVT;

    @Column(name = "valor_declarado")
    private BigDecimal valorDeclarado;

    @Column(name = "dt_conferencia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataConferencia;

    @Column(name = "valor_conferido")
    private BigDecimal valorConferido;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    public Long getIdDetalheConferencia() {
        return idDetalheConferencia;
    }

    public void setIdDetalheConferencia(Long idDetalheConferencia) {
        this.idDetalheConferencia = idDetalheConferencia;
    }

    public String getNumSerieEquipamento() {
        return numSerieEquipamento;
    }

    public void setNumSerieEquipamento(String numSerieEquipamento) {
        this.numSerieEquipamento = numSerieEquipamento;
    }

    public Long getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(Long idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public String getCnpjCliente() {
        return cnpjCliente;
    }

    public void setCnpjCliente(String cnpjCliente) {
        this.cnpjCliente = cnpjCliente;
    }

    public String getNumeroGVT() {
        return numeroGVT;
    }

    public void setNumeroGVT(String numeroGVT) {
        this.numeroGVT = numeroGVT;
    }

    public BigDecimal getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(BigDecimal valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public Date getDataConferencia() {
        return dataConferencia;
    }

    public void setDataConferencia(Date dataConferencia) {
        this.dataConferencia = dataConferencia;
    }

    public BigDecimal getValorConferido() {
        return valorConferido;
    }

    public void setValorConferido(BigDecimal valorConferido) {
        this.valorConferido = valorConferido;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataRecolhimento() {
        return dataRecolhimento;
    }

    public void setDataRecolhimento(Date dataRecolhimento) {
        this.dataRecolhimento = dataRecolhimento;
    }

    /**
     * @author gabriel
     *
     */
    public static class DetalheConferenciaBuilder {

        private String numSerieEquipamento;
        private Long idEquipamento;
        private String cnpjCliente;
        private String numeroGVT;
        private BigDecimal valorDeclarado;
        private Date dataConferencia;
        private BigDecimal valorConferido;
        private Date dataRecolhimento;

        private Date dataCriacao;

        public DetalheConferenciaBuilder(Long idEquipamento, String numSerieEquipamento) {
            this.numSerieEquipamento = numSerieEquipamento;
            this.idEquipamento = idEquipamento;
        }

        public DetalheConferenciaBuilder cnpjCliente(String cnpjCliente) {
            this.cnpjCliente = cnpjCliente;
            return this;
        }

        public DetalheConferenciaBuilder numeroGVT(String numeroGVT) {
            this.numeroGVT = numeroGVT;
            return this;
        }

        public DetalheConferenciaBuilder detalheRecolhimento(Date dataRecolhimento) {
            this.dataRecolhimento = dataRecolhimento;
            return this;
        }

        public DetalheConferenciaBuilder valorDeclarado(BigDecimal valorDeclarado) {
            this.valorDeclarado = valorDeclarado;
            return this;
        }

        public DetalheConferenciaBuilder dataConferencia(Date dataConferencia) {
            this.dataConferencia = dataConferencia;
            return this;
        }

        public DetalheConferenciaBuilder valorConferido(BigDecimal valorConferido) {
            this.valorConferido = valorConferido;
            return this;
        }

        public DetalheConferenciaBuilder dataCriacao() {
            this.dataCriacao = Calendar.getInstance().getTime();
            return this;
        }

        public DetalheConferencia build() {
            return new DetalheConferencia(this);
        }
    }
}
