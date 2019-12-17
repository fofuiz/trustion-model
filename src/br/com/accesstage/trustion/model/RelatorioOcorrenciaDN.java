package br.com.accesstage.trustion.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "t_relatorio_ocorrencia_dn_view")
public class RelatorioOcorrenciaDN implements Serializable {

    @Id
    @Column(name = "row_number")
    private Long row_number;

    @Column(name = "id_grupo_economico")
    private Long idGrupoEconomico;

    @Column(name = "gtv")
    private String gtv;

    @Column(name = "id_empresa")
    private Long idEmpresa;

    @Column(name = "cnpj")
    private String cnpjCliente;

    @Column(name = "razao_social")
    private String razaoSocial;

    @Column(name = "id_ocorrencia")
    private Long idOcorrencia;

    @Column(name = "status_ocorrencia")
    private String statusOcorrencia;

    @Column(name = "dt_status_ocorrencia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataStatusOcorrencia;

    @Column(name = "id_modelo_negocio")
    private Long idModeloNegocio;

    @Column(name = "qtd_dias_conferencia_credito")
    private Integer quantidadeDiasConfCredito;

    @Column(name = "id_sla_atendimento")
    private Long id_sla_atendimento;

    // criacao ocorrencia
    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Column(name = "responsavel")
    private String responsavel;

    @Column(name = "id_grupo_economico_outras_empresas")
    private Long idGrupoEconomicoOutrasEmpresas;

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

    public String getCnpjCliente() {
        return cnpjCliente;
    }

    public void setCnpjCliente(String cnpjCliente) {
        this.cnpjCliente = cnpjCliente;
    }

    public Long getIdOcorrencia() {
        return idOcorrencia;
    }

    public void setIdOcorrencia(Long idOcorrencia) {
        this.idOcorrencia = idOcorrencia;
    }

    public String getStatusOcorrencia() {
        return statusOcorrencia;
    }

    public void setStatusOcorrencia(String statusOcorrencia) {
        this.statusOcorrencia = statusOcorrencia;
    }

    public Date getDataStatusOcorrencia() {
        return dataStatusOcorrencia;
    }

    public void setDataStatusOcorrencia(Date dataStatusOcorrencia) {
        this.dataStatusOcorrencia = dataStatusOcorrencia;
    }

    public Long getIdModeloNegocio() {
        return idModeloNegocio;
    }

    public void setIdModeloNegocio(Long idModeloNegocio) {
        this.idModeloNegocio = idModeloNegocio;
    }

    public Integer getQuantidadeDiasConfCredito() {
        return quantidadeDiasConfCredito;
    }

    public void setQuantidadeDiasConfCredito(Integer quantidadeDiasConfCredito) {
        this.quantidadeDiasConfCredito = quantidadeDiasConfCredito;
    }

    public Long getId_sla_atendimento() {
        return id_sla_atendimento;
    }

    public void setId_sla_atendimento(Long id_sla_atendimento) {
        this.id_sla_atendimento = id_sla_atendimento;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getGtv() {
        return gtv;
    }

    public void setGtv(String gtv) {
        this.gtv = gtv;
    }

    public Long getRow_number() {
        return row_number;
    }

    public void setRow_number(Long row_number) {
        this.row_number = row_number;
    }

    public Long getIdGrupoEconomicoOutrasEmpresas() {
        return idGrupoEconomicoOutrasEmpresas;
    }

    public void setIdGrupoEconomicoOutrasEmpresas(Long idGrupoEconomicoOutrasEmpresas) {
        this.idGrupoEconomicoOutrasEmpresas = idGrupoEconomicoOutrasEmpresas;
    }

}
