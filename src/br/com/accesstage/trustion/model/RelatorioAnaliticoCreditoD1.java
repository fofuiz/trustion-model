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

@Entity(name = "t_relatorio_analitico_credito_d1")
public class RelatorioAnaliticoCreditoD1 implements Serializable {

    public RelatorioAnaliticoCreditoD1() {
    }

    public RelatorioAnaliticoCreditoD1(RelatorioAnaliticoCreditoD1Builder builder) {
        this.idGrupoEconomico = builder.idGrupoEconomico;
        this.idEmpresa = builder.idEmpresa;
        this.cnpj = builder.cnpj;
        this.gtv = builder.gtv;
        this.compartimento = builder.compartimento;
        this.dataConferencia = builder.dataConferencia;
        this.valorConferido = builder.valorConferido;
        this.valorQuestionado = builder.valorQuestionado;
        this.statusConciliacao = builder.statusConciliacao;
        this.idOcorrencia = builder.idOcorrencia;
        this.statusOcorrencia = builder.statusOcorrencia;
        this.dataStatusOcorrencia = builder.dataStatusOcorrencia;
        this.dataCriacao = builder.dataCriacao;
        this.idConciliacao = builder.idConciliacao;
        this.siglaLoja = builder.siglaLoja;
        this.dataColeta = builder.dataColeta;
        this.valorColeta = builder.valorColeta;
        this.responsavel = builder.responsavel;
        this.idTransportadora = builder.idTransportadora;
        this.idModeloNegocio = builder.idModeloNegocio;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tRelatorioAnaliticoCreditoD1Seq")
    @SequenceGenerator(name = "tRelatorioAnaliticoCreditoD1Seq", sequenceName = "t_relatorio_analitico_credito_d1_seq", allocationSize = 1)
    @Column(name = "id_relatorio_analitico")
    private Long idRelatorioAnalitico;

    @Column(name = "id_grupo_economico")
    private Long idGrupoEconomico;

    @Column(name = "id_empresa")
    private Long idEmpresa;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "gtv")
    private String gtv;

    @Column(name = "compartimento")
    private String compartimento;

    @Column(name = "dt_conferencia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataConferencia;

    @Column(name = "valor_conferido")
    private BigDecimal valorConferido;

    @Column(name = "dt_credito")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCredito;

    @Column(name = "valor_credito")
    private BigDecimal valorCredito;

    @Column(name = "valor_questionado")
    private BigDecimal valorQuestionado;

    @Column(name = "status_conciliacao")
    private String statusConciliacao;

    @Column(name = "id_ocorrencia")
    private Long idOcorrencia;

    @Column(name = "dt_status_ocorrencia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataStatusOcorrencia;

    @Column(name = "status_ocorrencia")
    private String statusOcorrencia;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Column(name = "id_conciliacao")
    private Long idConciliacao;

    @Column(name = "sigla_loja")
    private String siglaLoja;

    @Column(name = "dt_de_coleta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataColeta;

    @Column(name = "valor_coleta")
    private BigDecimal valorColeta;

    @Column(name = "responsavel")
    private String responsavel;

    @Column(name = "id_transportadora")
    private Long idTransportadora;

    @Column(name = "id_modelo_negocio")
    private Long idModeloNegocio;


    public Long getIdRelatorioAnalitico() {
        return idRelatorioAnalitico;
    }

    public void setIdRelatorioAnalitico(Long idRelatorioAnalitico) {
        this.idRelatorioAnalitico = idRelatorioAnalitico;
    }

    public Long getIdGrupoEconomico() {
        return idGrupoEconomico;
    }

    public void setIdGrupoEconomico(Long idGrupoEconomico) {
        this.idGrupoEconomico = idGrupoEconomico;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getGtv() {
        return gtv;
    }

    public void setGtv(String gtv) {
        this.gtv = gtv;
    }

    public String getCompartimento() {
        return compartimento;
    }

    public void setCompartimento(String compartimento) {
        this.compartimento = compartimento;
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

    public Date getDataCredito() {
        return dataCredito;
    }

    public void setDataCredito(Date dataCredito) {
        this.dataCredito = dataCredito;
    }

    public BigDecimal getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(BigDecimal valorCredito) {
        this.valorCredito = valorCredito;
    }

    public String getStatusConciliacao() {
        return statusConciliacao;
    }

    public void setStatusConciliacao(String statusConciliacao) {
        this.statusConciliacao = statusConciliacao;
    }

    public Long getIdOcorrencia() {
        return idOcorrencia;
    }

    public void setIdOcorrencia(Long idOcorrencia) {
        this.idOcorrencia = idOcorrencia;
    }

    public BigDecimal getValorQuestionado() {
        return valorQuestionado;
    }

    public void setValorQuestionado(BigDecimal valorQuestionado) {
        this.valorQuestionado = valorQuestionado;
    }

    public Date getDataStatusOcorrencia() {
        return dataStatusOcorrencia;
    }

    public void setDataStatusOcorrencia(Date dataStatusOcorrencia) {
        this.dataStatusOcorrencia = dataStatusOcorrencia;
    }

    public String getStatusOcorrencia() {
        return statusOcorrencia;
    }

    public void setStatusOcorrencia(String statusOcorrencia) {
        this.statusOcorrencia = statusOcorrencia;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Long getIdConciliacao() {
        return idConciliacao;
    }

    public void setIdConciliacao(Long idConciliacao) {
        this.idConciliacao = idConciliacao;
    }

    public String getSiglaLoja() {
        return siglaLoja;
    }

    public void setSiglaLoja(String siglaLoja) {
        this.siglaLoja = siglaLoja;
    }

    public Date getDataColeta() {
        return dataColeta;
    }

    public void setDataColeta(Date dataColeta) {
        this.dataColeta = dataColeta;
    }

    public BigDecimal getValorColeta() {
        return valorColeta;
    }

    public void setValorColeta(BigDecimal valorColeta) {
        this.valorColeta = valorColeta;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Long getIdTransportadora() {
        return idTransportadora;
    }

    public void setIdTransportadora(Long idTransportadora) {
        this.idTransportadora = idTransportadora;
    }

    public Long getIdModeloNegocio() {
        return idModeloNegocio;
    }

    public void setIdModeloNegocio(Long idModeloNegocio) {
        this.idModeloNegocio = idModeloNegocio;
    }


    public static class RelatorioAnaliticoCreditoD1Builder {

        private Long idGrupoEconomico;
        private Long idEmpresa;
        private Date dataStatusOcorrencia;
        private Date dataCriacao;
        private String cnpj;
        private String gtv;
        private String compartimento;
        private Date dataConferencia;
        private BigDecimal valorConferido;
        private Date dataCredito;
        private BigDecimal valorCredito;
        private BigDecimal valorQuestionado;
        private String statusConciliacao;
        private Long idOcorrencia;
        private String statusOcorrencia;
        private Long idConciliacao;
        private String siglaLoja;
        private Date dataColeta;
        private BigDecimal valorColeta;
        private Long idTransportadora;
        private Long idModeloNegocio;
        private String responsavel;


        public RelatorioAnaliticoCreditoD1Builder(Long idGrupoEconomico, Long idEmpresa) {
            this.idGrupoEconomico = idGrupoEconomico;
            this.idEmpresa = idEmpresa;
        }

        public RelatorioAnaliticoCreditoD1Builder cnpjCliente(String cnpj) {
            this.cnpj = cnpj;
            return this;
        }

        public RelatorioAnaliticoCreditoD1Builder gtv(String gtv) {
            this.gtv = gtv;
            return this;
        }

        public RelatorioAnaliticoCreditoD1Builder compartimento(String compartimento) {
            this.compartimento = compartimento;
            return this;
        }

        public RelatorioAnaliticoCreditoD1Builder dataConferencia(Date dataConferencia) {
            this.dataConferencia = dataConferencia;
            return this;
        }

        public RelatorioAnaliticoCreditoD1Builder valorConferido(BigDecimal valorConferido) {
            this.valorConferido = valorConferido;
            return this;
        }

        public RelatorioAnaliticoCreditoD1Builder valorQuestionado(BigDecimal valorQuestionado) {
            this.valorQuestionado = valorQuestionado;
            return this;
        }

        public RelatorioAnaliticoCreditoD1Builder statusConciliacao(String statusConciliacao) {
            this.statusConciliacao = statusConciliacao;
            return this;
        }

        public RelatorioAnaliticoCreditoD1Builder idOcorrencia(Long idOcorrencia) {
            this.idOcorrencia = idOcorrencia;
            return this;
        }

        public RelatorioAnaliticoCreditoD1Builder statusOcorrencia(String statusOcorrencia) {
            this.statusOcorrencia = statusOcorrencia;
            return this;
        }

        public RelatorioAnaliticoCreditoD1Builder dataCriacao() {
            this.dataCriacao = Calendar.getInstance().getTime();
            return this;
        }

        public RelatorioAnaliticoCreditoD1Builder idConciliacao(Long idConciliacao) {
            this.idConciliacao = idConciliacao;
            return this;
        }

        public RelatorioAnaliticoCreditoD1Builder siglaLoja(String siglaLoja) {
            this.siglaLoja = siglaLoja;
            return this;
        }

        public RelatorioAnaliticoCreditoD1Builder dataColeta(Date dataColeta) {
            this.dataColeta = dataColeta;
            return this;
        }

        public RelatorioAnaliticoCreditoD1Builder valorColeta(BigDecimal valorColeta) {
            this.valorColeta = valorColeta;
            return this;
        }

        public RelatorioAnaliticoCreditoD1Builder responsavel(String responsavel) {
            this.responsavel = responsavel;
            return this;
        }

        public RelatorioAnaliticoCreditoD1Builder idTransportadora(Long idTransportadora) {
            this.idTransportadora = idTransportadora;
            return this;
        }

        public RelatorioAnaliticoCreditoD1Builder idModeloNegocio(Long idModeloNegocio) {
            this.idModeloNegocio = idModeloNegocio;
            return this;
        }


        public RelatorioAnaliticoCreditoD1 build() {
            return new RelatorioAnaliticoCreditoD1(this);
        }
    }

}