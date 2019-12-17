package br.com.accesstage.trustion.ascartoes.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@NamedQueries({
    @NamedQuery(name = "RemessaConciliacaoHeader.findAll", query = "select o from RemessaConciliacaoHeader o"),
    @NamedQuery(name = "RemessaConciliacaoHeader.findUsrEmp", query = "select o from RemessaConciliacaoHeader o where o.codUsuario=:codUsuario and o.empId=:empId and o.staConciliacao=:staConciliacao order by o.codHeader desc")})
@Table(name = "REMESSA_CONCILIACAO_HEADER")
public class RemessaConciliacaoHeader implements Serializable {

    private static final long serialVersionUID = 6471345373085700554L;

    @Column(name = "COD_ARQUIVO")
    private Long codArquivo;
    @Column(name = "COD_CLIENTE", length = 10)
    private String codCliente;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqRemessaHeader")
    @SequenceGenerator(name = "seqRemessaHeader", sequenceName = "REMESSA_CONC_HEADER_SEQ", allocationSize = 1)
    @Column(name = "COD_HEADER", nullable = false)
    private Long codHeader;
    @Column(name = "COD_TIPO_CARGA", length = 2)
    private String codTipoCarga;
    @Column(name = "DSC_ARQUIVO", length = 25)
    private String dscArquivo;
    @Column(name = "DTA_FINAL_VENDA")
    private Timestamp dtaFinalVenda;
    @Column(name = "DTA_GERACAO_ARQUIVO")
    private Timestamp dtaGeracaoArquivo;
    @Column(name = "DTA_INICIO_VENDA")
    private Timestamp dtaInicioVenda;
    @Column(name = "NME_SISTEMA_DESTINO", length = 13)
    private String nmeSistemaDestino;
    @Column(name = "NME_SISTEMA_ORIGEM", length = 13)
    private String nmeSistemaOrigem;
    @Column(name = "NRO_CNPJ")
    private Long nroCnpj;
    @Column(name = "NRO_SEQ_ARQUIVO")
    private Long nroSeqArquivo;
    @Column(name = "NRO_SEQ_REGISTRO")
    private Long nroSeqRegistro;
    @Column(name = "NRO_VERSAO_LAYOUT")
    private Long nroVersaoLayout;
    @OneToMany(mappedBy = "remessaConciliacaoHeader")
    private List<RemessaConciliacaoDetalhe> remessaConciliacaoDetalheList;
    @Column(name = "EMPID")
    private Long empId;
    @Column(name = "COD_USUARIO")
    private Long codUsuario;
    @Column(name = "STA_CONCILIACAO")
    private String staConciliacao;

    public RemessaConciliacaoHeader() {
    }

    public RemessaConciliacaoHeader(Long codArquivo, String codCliente,
            Long codHeader, String codTipoCarga, String dscArquivo,
            Timestamp dtaFinalVenda, Timestamp dtaGeracaoArquivo,
            Timestamp dtaInicioVenda, String nmeSistemaDestino,
            String nmeSistemaOrigem, Long nroCnpj, Long nroSeqArquivo,
            Long nroSeqRegistro, Long nroVersaoLayout) {
        this.codArquivo = codArquivo;
        this.codCliente = codCliente;
        this.codHeader = codHeader;
        this.codTipoCarga = codTipoCarga;
        this.dscArquivo = dscArquivo;
        this.dtaFinalVenda = dtaFinalVenda;
        this.dtaGeracaoArquivo = dtaGeracaoArquivo;
        this.dtaInicioVenda = dtaInicioVenda;
        this.nmeSistemaDestino = nmeSistemaDestino;
        this.nmeSistemaOrigem = nmeSistemaOrigem;
        this.nroCnpj = nroCnpj;
        this.nroSeqArquivo = nroSeqArquivo;
        this.nroSeqRegistro = nroSeqRegistro;
        this.nroVersaoLayout = nroVersaoLayout;
    }

    public Long getCodArquivo() {
        return codArquivo;
    }

    public void setCodArquivo(Long codArquivo) {
        this.codArquivo = codArquivo;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public Long getCodHeader() {
        return codHeader;
    }

    public void setCodHeader(Long codHeader) {
        this.codHeader = codHeader;
    }

    public String getCodTipoCarga() {
        return codTipoCarga;
    }

    public void setCodTipoCarga(String codTipoCarga) {
        this.codTipoCarga = codTipoCarga;
    }

    public String getDscArquivo() {
        return dscArquivo;
    }

    public void setDscArquivo(String dscArquivo) {
        this.dscArquivo = dscArquivo;
    }

    public Timestamp getDtaFinalVenda() {
        return dtaFinalVenda;
    }

    public void setDtaFinalVenda(Timestamp dtaFinalVenda) {
        this.dtaFinalVenda = dtaFinalVenda;
    }

    public Timestamp getDtaGeracaoArquivo() {
        return dtaGeracaoArquivo;
    }

    public void setDtaGeracaoArquivo(Timestamp dtaGeracaoArquivo) {
        this.dtaGeracaoArquivo = dtaGeracaoArquivo;
    }

    public Timestamp getDtaInicioVenda() {
        return dtaInicioVenda;
    }

    public void setDtaInicioVenda(Timestamp dtaInicioVenda) {
        this.dtaInicioVenda = dtaInicioVenda;
    }

    public String getNmeSistemaDestino() {
        return nmeSistemaDestino;
    }

    public void setNmeSistemaDestino(String nmeSistemaDestino) {
        this.nmeSistemaDestino = nmeSistemaDestino;
    }

    public String getNmeSistemaOrigem() {
        return nmeSistemaOrigem;
    }

    public void setNmeSistemaOrigem(String nmeSistemaOrigem) {
        this.nmeSistemaOrigem = nmeSistemaOrigem;
    }

    public Long getNroCnpj() {
        return nroCnpj;
    }

    public void setNroCnpj(Long nroCnpj) {
        this.nroCnpj = nroCnpj;
    }

    public Long getNroSeqArquivo() {
        return nroSeqArquivo;
    }

    public void setNroSeqArquivo(Long nroSeqArquivo) {
        this.nroSeqArquivo = nroSeqArquivo;
    }

    public Long getNroSeqRegistro() {
        return nroSeqRegistro;
    }

    public void setNroSeqRegistro(Long nroSeqRegistro) {
        this.nroSeqRegistro = nroSeqRegistro;
    }

    public Long getNroVersaoLayout() {
        return nroVersaoLayout;
    }

    public void setNroVersaoLayout(Long nroVersaoLayout) {
        this.nroVersaoLayout = nroVersaoLayout;
    }

    public List<RemessaConciliacaoDetalhe> getRemessaConciliacaoDetalheList() {
        return remessaConciliacaoDetalheList;
    }

    public void setRemessaConciliacaoDetalheList(
            List<RemessaConciliacaoDetalhe> remessaConciliacaoDetalheList) {
        this.remessaConciliacaoDetalheList = remessaConciliacaoDetalheList;
    }

    public RemessaConciliacaoDetalhe addRemessaConciliacaoDetalhe(
            RemessaConciliacaoDetalhe remessaConciliacaoDetalhe) {
        getRemessaConciliacaoDetalheList().add(remessaConciliacaoDetalhe);
        remessaConciliacaoDetalhe.setRemessaConciliacaoHeader(this);
        return remessaConciliacaoDetalhe;
    }

    public RemessaConciliacaoDetalhe removeRemessaConciliacaoDetalhe(
            RemessaConciliacaoDetalhe remessaConciliacaoDetalhe) {
        getRemessaConciliacaoDetalheList().remove(remessaConciliacaoDetalhe);
        remessaConciliacaoDetalhe.setRemessaConciliacaoHeader(null);
        return remessaConciliacaoDetalhe;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    public Long getEmpId() {
        return empId;
    }

    public void setCodUsuario(Long codUsuario) {
        this.codUsuario = codUsuario;
    }

    public Long getCodUsuario() {
        return codUsuario;
    }

    public void setStaConciliacao(String staConciliacao) {
        this.staConciliacao = staConciliacao;
    }

    public String getStaConciliacao() {
        return staConciliacao;
    }
}
