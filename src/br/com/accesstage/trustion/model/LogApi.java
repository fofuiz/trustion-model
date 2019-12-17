package br.com.accesstage.trustion.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "t_log_api")
public class LogApi implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tLogAPISeq")
    @SequenceGenerator(name = "tLogAPISeq", sequenceName = "t_log_api_seq", allocationSize = 1)
    @Column(name = "id_log_api")
    private Long IdLogAPI;

    @Column(name = "id_grupo_economico")
    private Long idGrupoEconomico;

    @Column(name = "id_empresa")
    private Long idEmpresa;

    @Column(name = "id_cofre")
    private Long idCofre;

    @Column(name = "api")
    private String api;

    @Column(name = "status_consulta")
    private String statusConsulta;

    @Column(name = "data_log")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataLog;

    @Column(name = "mensagem")
    private String mensagem;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Column(name = "data_alteracao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAlteracao;

    public LogApi() {
    }

    public Long getIdLogAPI() {
        return IdLogAPI;
    }

    public void setIdLogAPI(Long idLogAPI) {
        IdLogAPI = idLogAPI;
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

    public Long getIdCofre() {
        return idCofre;
    }

    public void setIdCofre(Long idCofre) {
        this.idCofre = idCofre;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getStatusConsulta() {
        return statusConsulta;
    }

    public void setStatusConsulta(String statusConsulta) {
        this.statusConsulta = statusConsulta;
    }

    public Date getDataLog() {
        return dataLog;
    }

    public void setDataLog(Date dataLog) {
        this.dataLog = dataLog;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }
}
