package br.com.accesstage.trustion.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "t_usuario")
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tUsuarioSeq")
    @SequenceGenerator(name = "tUsuarioSeq", sequenceName = "t_usuario_seq", allocationSize = 1)
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "login")
    private String login;

    @Column(name = "senha")
    private String senha;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "status")
    private String status;

    @Column(name = "primeiro_acesso")
    private boolean primeiroAcesso;

    @Column(name = "id_perfil")
    private Long idPerfil;

    @Column(name = "id_usuario_criacao")
    private Long idUsuarioCriacao;

    @Column(name = "data_criacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    @Column(name = "data_alteracao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAlteracao;

    @Column(name = "id_usuario_alteracao")
    private Long idUsuarioAlteracao;

    @Column(name = "data_login")
    private LocalDate dataLogin;

    @Column(name = "nro_telefone")
    private String nroTelefone;

    @JoinTable(name = "t_usuario_empresa", joinColumns = {
        @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")}, inverseJoinColumns = {
        @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa")})
    @ManyToMany
    private List<Empresa> empresaList;

    @JoinTable(name = "t_usuario_transportadora", joinColumns = {
        @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")}, inverseJoinColumns = {
        @JoinColumn(name = "id_transportadora", referencedColumnName = "id_transportadora")})
    @ManyToMany
    private List<Transportadora> transportadoraList;

    @Column(name = "usuario_tableu")
    private String usuarioTableau;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isPrimeiroAcesso() {
        return primeiroAcesso;
    }

    public void setPrimeiroAcesso(boolean primeiroAcesso) {
        this.primeiroAcesso = primeiroAcesso;
    }

    public Long getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(Long idPerfil) {
        this.idPerfil = idPerfil;
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

    public LocalDate getDataLogin() {
        return dataLogin;
    }

    public void setDataLogin(LocalDate dataLogin) {
        this.dataLogin = dataLogin;
    }

    public String getNroTelefone() {
        return nroTelefone;
    }

    public void setNroTelefone(String nroTelefone) {
        this.nroTelefone = nroTelefone;
    }

    public List<Empresa> getEmpresaList() {
        return empresaList;
    }

    public void setEmpresaList(List<Empresa> empresaList) {
        this.empresaList = empresaList;
    }

    public List<Transportadora> getTransportadoraList() {
        return transportadoraList;
    }

    public void setTransportadoraList(List<Transportadora> transportadoraList) {
        this.transportadoraList = transportadoraList;
    }

    public String getUsuarioTableau() {
        return usuarioTableau;
    }

    public void setUsuarioTableau(String usuarioTableau) {
        this.usuarioTableau = usuarioTableau;
    }

}
