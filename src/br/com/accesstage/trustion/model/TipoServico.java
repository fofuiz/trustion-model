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

@Entity(name = "t_tipo_servico")
public class TipoServico implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tTipoServicoSeq")
    @SequenceGenerator(name = "tTipoServicoSeq", sequenceName = "t_tipo_servico_seq", allocationSize = 1)
    @Column(name = "id_tipo_servico")
    private Long idTipoServico;

    @Column(name = "nome_servico")
    private String nomeServico;

    @Column(name = "id_grupo_economico")
    private Long idGrupoEconomico;

    @Column(name = "desc_servico")
    private String descServico;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Column(name = "id_usuario_criacao")
    private Long idUsuarioCriacao;

    @Column(name = "data_alteracao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAlteracao;

    @Column(name = "id_usuario_alteracao")
    private Long idUsuarioAlteracao;

    public Long getIdTipoServico() {
        return idTipoServico;
    }

    public String getNomeServico() {
        return nomeServico;
    }

    public Long getIdGrupoEconomico() {
        return idGrupoEconomico;
    }

    public String getDescServico() {
        return descServico;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public Long getIdUsuarioCriacao() {
        return idUsuarioCriacao;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public Long getIdUsuarioAlteracao() {
        return idUsuarioAlteracao;
    }

    public void setIdTipoServico(Long idTipoServico) {
        this.idTipoServico = idTipoServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public void setIdGrupoEconomico(Long idGrupoEconomico) {
        this.idGrupoEconomico = idGrupoEconomico;
    }

    public void setDescServico(String descServico) {
        this.descServico = descServico;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setIdUsuarioCriacao(Long idUsuarioCriacao) {
        this.idUsuarioCriacao = idUsuarioCriacao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public void setIdUsuarioAlteracao(Long idUsuarioAlteracao) {
        this.idUsuarioAlteracao = idUsuarioAlteracao;
    }

}
