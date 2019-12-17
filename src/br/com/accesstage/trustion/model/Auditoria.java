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

@Entity(name = "t_auditoria")
public class Auditoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tAuditoriaSeq")
    @SequenceGenerator(name = "tAuditoriaSeq", sequenceName = "t_auditoria_seq", allocationSize = 1)
    @Column(name = "id_auditoria")
    private Long idAuditoria;

    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "usuario")
    private String usuario;

    @Column(name = "id_grupo_economico")
    private Long idGrupoEconomico;

    @Column(name = "grupo_economico")
    private String grupoEconomico;

    @Column(name = "id_empresa")
    private Long idEmpresa;

    @Column(name = "empresa")
    private String empresa;

    @Column(name = "data_acao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAcao;

    @Column(name = "acao")
    private String acao;

    @Column(name = "nro_ocorrencia")
    private String nroOcorrencia;

    public Auditoria() {
        super();
    }

    public Long getIdAuditoria() {
        return idAuditoria;
    }

    public void setIdAuditoria(Long idAuditoria) {
        this.idAuditoria = idAuditoria;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Long getIdGrupoEconomico() {
        return idGrupoEconomico;
    }

    public void setIdGrupoEconomico(Long idGrupoEconomico) {
        this.idGrupoEconomico = idGrupoEconomico;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Date getDataAcao() {
        return dataAcao;
    }

    public void setDataAcao(Date dataAcao) {
        this.dataAcao = dataAcao;
    }

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getGrupoEconomico() {
        return grupoEconomico;
    }

    public void setGrupoEconomico(String grupoEconomico) {
        this.grupoEconomico = grupoEconomico;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNroOcorrencia() {
        return nroOcorrencia;
    }

    public void setNroOcorrencia(String nroOcorrencia) {
        this.nroOcorrencia = nroOcorrencia;
    }

}
