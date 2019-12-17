package br.com.accesstage.trustion.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity(name = "t_transportadora")
public class Transportadora implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tTransportadoraSeq")
    @SequenceGenerator(name = "tTransportadoraSeq", sequenceName = "t_transportadora_seq", allocationSize = 1)
    @Column(name = "id_transportadora")
    private Long idTransportadora;

    @Column(name = "razao_social")
    private String razaoSocial;

    @Column(name = "cnpj")
    private String cnpj;

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

    @Column(name = "nro_telefone")
    private String nroTelefone;

    @Column(name = "email")
    private String email;

    @Column(name = "envio_informacao")
    private String envioInformacao;

    @Column(name = "status")
    private String status;

    @ManyToMany(mappedBy = "transportadoraList")
    private List<Usuario> usuarioList;

    @OneToMany(mappedBy = "transportadora")
    private List<ModeloNegocio> modeloNegocioList;

    @Column(name = "responsavel")
    private String responsavel;

    public Long getIdTransportadora() {
        return idTransportadora;
    }

    public void setIdTransportadora(Long idTransportadora) {
        this.idTransportadora = idTransportadora;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Long getIdUsuarioCriacao() {
        return idUsuarioCriacao;
    }

    public void setIdUsuarioCriacao(Long idUsuarioCriacao) {
        this.idUsuarioCriacao = idUsuarioCriacao;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public Long getIdUsuarioAlteracao() {
        return idUsuarioAlteracao;
    }

    public void setIdUsuarioAlteracao(Long idUsuarioAlteracao) {
        this.idUsuarioAlteracao = idUsuarioAlteracao;
    }

    public String getNroTelefone() {
        return nroTelefone;
    }

    public void setNroTelefone(String nroTelefone) {
        this.nroTelefone = nroTelefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnvioInformacao() {
        return envioInformacao;
    }

    public void setEnvioInformacao(String envioInformacao) {
        this.envioInformacao = envioInformacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void setUsuarioList(List<Usuario> usuarioList) {
        this.usuarioList = usuarioList;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public List<ModeloNegocio> getModeloNegocioList() {
        return modeloNegocioList;
    }

    public void setModeloNegocioList(List<ModeloNegocio> modeloNegocioList) {
        this.modeloNegocioList = modeloNegocioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTransportadora != null ? idTransportadora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Transportadora)) {
            return false;
        }
        Transportadora other = (Transportadora) object;
        if ((this.idTransportadora == null && other.idTransportadora != null) || (this.idTransportadora != null && !this.idTransportadora.equals(other.idTransportadora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.accesstage.trustion.model.Transportadora[ idTransportadora=" + idTransportadora + " ]";
    }

}
