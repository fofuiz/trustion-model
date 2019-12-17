package br.com.accesstage.trustion.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "t_empresa")
public class Empresa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tEmpresaSeq")
    @SequenceGenerator(name = "tEmpresaSeq", sequenceName = "t_empresa_seq", allocationSize = 1)
    @Column(name = "id_empresa")
    private Long idEmpresa;

    @Column(name = "razao_social")
    private String razaoSocial;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "id_grupo_economico")
    private Long idGrupoEconomico;

    @Column(name = "segmento_mercado")
    private String segmentoMercado;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private String estado;

    @Column(name = "cep")
    private String cep;

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

    @Column(name = "status")
    private String status;

    @Column(name = "sigla_loja")
    private String siglaLoja;

    @OneToMany(mappedBy = "empresa")
    private List<EmpresaModeloNegocio> empresaModeloNegocioList;

    @Column(name = "id_empresa_segmento")
    private Long idEmpresaSegmento;

    @ManyToMany(mappedBy = "empresaList")
    private List<Usuario> usuarioList;

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Long getIdGrupoEconomico() {
        return idGrupoEconomico;
    }

    public String getSegmentoMercado() {
        return segmentoMercado;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
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

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setIdGrupoEconomico(Long idGrupoEconomico) {
        this.idGrupoEconomico = idGrupoEconomico;
    }

    public void setSegmentoMercado(String segmentoMercado) {
        this.segmentoMercado = segmentoMercado;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCep(String cep) {
        this.cep = cep;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSiglaLoja() {
        return siglaLoja;
    }

    public void setSiglaLoja(String siglaLoja) {
        this.siglaLoja = siglaLoja;
    }

    public Long getIdEmpresaSegmento() {
        return idEmpresaSegmento;
    }

    public void setIdEmpresaSegmento(Long idEmpresaSegmento) {
        this.idEmpresaSegmento = idEmpresaSegmento;
    }

    public List<EmpresaModeloNegocio> getEmpresaModeloNegocioList() {
        return empresaModeloNegocioList;
    }

    public void setEmpresaModeloNegocioList(List<EmpresaModeloNegocio> empresaModeloNegocioList) {
        this.empresaModeloNegocioList = empresaModeloNegocioList;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

}
