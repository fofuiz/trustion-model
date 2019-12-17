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

@Entity(name = "t_relatorio_analitico_credito")
public class RelatorioAnaliticoCredito implements Serializable {

    
    public RelatorioAnaliticoCredito() {
    }

    public RelatorioAnaliticoCredito(RelatorioAnaliticoCreditoBuilder builder) {
        this.idGrupoEconomico = builder.idGrupoEconomico;
        this.idEmpresa = builder.idEmpresa;
        this.dataCorte = builder.dataCorte;
        this.codigoFechamento = builder.codigoFechamento;
        this.idOcorrencia = builder.idOcorrencia;
        this.valorTotal = builder.valorTotal;
        this.valorQuestionado = builder.valorQuestionado;
        this.dataStatusOcorrencia = builder.dataStatusOcorrencia;
        this.statusOcorrencia = builder.statusOcorrencia;
        this.dataCriacao = builder.dataCriacao;
        this.cnpjCliente = builder.cnpjCliente;
        this.dataCredito = builder.dataCredito;
        this.valorCredito = builder.valorCredito;
        this.statusConciliacao = builder.statusConciliacao;
        this.idEquipamento = builder.idEquipamento;
        this.numSerie = builder.numSerie;
        this.siglaLoja = builder.siglaLoja;
        this.idTransportadora = builder.idTransportadora;
        this.idModeloNegocio = builder.idModeloNegocio;
        this.responsavel = builder.responsavel;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tRelatorioAnaliticoCreditoSeq")
    @SequenceGenerator(name = "tRelatorioAnaliticoCreditoSeq", sequenceName = "t_relatorio_analitico_credito_seq", allocationSize = 1)
    @Column(name = "id_relatorio_analitico")
    private Long idRelatorioAnalitico;

    @Column(name = "id_grupo_economico")
    private Long idGrupoEconomico;

    @Column(name = "id_equipamento")
    private Long idEquipamento;

    @Column(name = "num_serie_equipamento")
    private String numSerie;

    @Column(name = "id_empresa")
    private Long idEmpresa;

    @Column(name = "cnpj_cliente")
    private String cnpjCliente;

    @Column(name = "corte_dt")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCorte;

    @Column(name = "codigo_fechamento")
    private Long codigoFechamento;

    @Column(name = "id_ocorrencia")
    private Long idOcorrencia;

    @Column(name = "valor_total")
    private BigDecimal valorTotal;

    @Column(name = "valor_questionado")
    private BigDecimal valorQuestionado;

    @Column(name = "data_status_ocorrencia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataStatusOcorrencia;

    @Column(name = "status_ocorrencia")
    private String statusOcorrencia;

    @Column(name = "data_credito")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCredito;

    @Column(name = "valor_credito")
    private BigDecimal valorCredito;

    @Column(name = "status_conciliacao")
    private String statusConciliacao;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Column(name = "ID_CONCILIACAO")
    private Long idConciliacao;

    @Column(name = "sigla_loja")
    private String siglaLoja;
    
    @Column(name = "id_transportadora")
    private Long idTransportadora;
    
    @Column(name = "id_modelo_negocio")
    private Long idModeloNegocio;

    @Column(name = "responsavel")
    private String responsavel;


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

    public Date getDataCorte() {
        return dataCorte;
    }

    public void setDataCorte(Date dataCorte) {
        this.dataCorte = dataCorte;
    }

    public Long getIdOcorrencia() {
        return idOcorrencia;
    }

    public void setIdOcorrencia(Long idOcorrencia) {
        this.idOcorrencia = idOcorrencia;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
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

    public Long getCodigoFechamento() {
        return codigoFechamento;
    }

    public void setCodigoFechamento(Long codigoFechamento) {
        this.codigoFechamento = codigoFechamento;
    }

    public Long getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(Long idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public String getCnpjCliente() {
        return cnpjCliente;
    }

    public void setCnpjCliente(String cnpjCliente) {
        this.cnpjCliente = cnpjCliente;
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

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }


    public static class RelatorioAnaliticoCreditoBuilder {

        private Long idGrupoEconomico;
        private Long idEmpresa;
        private Date dataCorte;
        private Long codigoFechamento;
        private Long idOcorrencia;
        private BigDecimal valorTotal;
        private BigDecimal valorQuestionado;
        private Date dataStatusOcorrencia;
        private String statusOcorrencia;
        private Date dataCriacao;
        private String cnpjCliente;
        private Date dataCredito;
        private BigDecimal valorCredito;
        private String statusConciliacao;
        private Long idEquipamento;
        private String numSerie;
        private String siglaLoja;
        private Long idTransportadora;
        private Long idModeloNegocio;
        private String responsavel;

        public RelatorioAnaliticoCreditoBuilder(Long idGrupoEconomico, Long idEmpresa) {
            this.idGrupoEconomico = idGrupoEconomico;
            this.idEmpresa = idEmpresa;
        }

        public RelatorioAnaliticoCreditoBuilder DataCorte(Date dataCorte) {
            this.dataCorte = dataCorte;
            return this;
        }

        public RelatorioAnaliticoCreditoBuilder codigoFechamento(Long codigoFechamento) {
            this.codigoFechamento = codigoFechamento;
            return this;
        }

        public RelatorioAnaliticoCreditoBuilder idOcorrencia(Long idOcorrencia) {
            this.idOcorrencia = idOcorrencia;
            return this;
        }

        public RelatorioAnaliticoCreditoBuilder valorTotal(BigDecimal valorTotal) {
            this.valorTotal = valorTotal;
            return this;
        }

        public RelatorioAnaliticoCreditoBuilder valorQuestionado(BigDecimal valorQuestionado) {
            this.valorQuestionado = valorQuestionado;
            return this;
        }

        public RelatorioAnaliticoCreditoBuilder dataStatusOcorrencia(Date dataStatusOcorrencia) {
            this.dataStatusOcorrencia = dataStatusOcorrencia;
            return this;
        }

        public RelatorioAnaliticoCreditoBuilder statusOcorrencia(String statusOcorrencia) {
            this.statusOcorrencia = statusOcorrencia;
            return this;
        }

        public RelatorioAnaliticoCreditoBuilder dataCriacao() {
            this.dataCriacao = Calendar.getInstance().getTime();
            return this;
        }

        public RelatorioAnaliticoCreditoBuilder cnpjCliente(String cnpjCliente) {
            this.cnpjCliente = cnpjCliente;
            return this;
        }

        public RelatorioAnaliticoCreditoBuilder dataCredito(Date dataCredito) {
            this.dataCredito = dataCredito;
            return this;
        }

        public RelatorioAnaliticoCreditoBuilder valorCredito(BigDecimal valorCredito) {
            this.valorCredito = valorCredito;
            return this;
        }

        public RelatorioAnaliticoCreditoBuilder statusConciliacao(String statusConciliacao) {
            this.statusConciliacao = statusConciliacao;
            return this;
        }

        public RelatorioAnaliticoCreditoBuilder numSerie(String numSerie) {
            this.numSerie = numSerie;
            return this;
        }

        public RelatorioAnaliticoCreditoBuilder idEquipamento(Long idEquipamento) {
            this.idEquipamento = idEquipamento;
            return this;
        }

        public RelatorioAnaliticoCreditoBuilder siglaLoja(String siglaLoja) {
            this.siglaLoja = siglaLoja;
            return this;
        }
        
        public RelatorioAnaliticoCreditoBuilder idTransportadora(Long idTransportadora) {
            this.idTransportadora = idTransportadora;
            return this;
        }
        
        public RelatorioAnaliticoCreditoBuilder idModeloNegocio(Long idModeloNegocio) {
            this.idModeloNegocio = idModeloNegocio;
            return this;
        }
        public RelatorioAnaliticoCreditoBuilder responsavel(String responsavel) {
            this.responsavel = responsavel;
            return this;
        }

        public RelatorioAnaliticoCredito build() {
            return new RelatorioAnaliticoCredito(this);
        }

    }

}