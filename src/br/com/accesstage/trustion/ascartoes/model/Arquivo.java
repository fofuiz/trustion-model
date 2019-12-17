package br.com.accesstage.trustion.ascartoes.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "ARQUIVO")
@NamedQueries({
    @NamedQuery(name = "ARQUIVO.findAll", query = "select o from ARQUIVO o")})
@SequenceGenerator(name = "seqArquivo", sequenceName = "ARQUIVO_SEQ", allocationSize = 1, initialValue = 1)
@NamedNativeQueries({
    @NamedNativeQuery(name = "Arquivo.insertIniciaCargaControle", query = "insert into controle_carga(COD_CONTROLE, DTA_INICIO, STA_PROCESSAMENTO, COD_ARQUIVO) "
            + "values(controle_carga_seq.nextval, sysdate, 'A', ?)"),
    @NamedNativeQuery(name = "Arquivo.updateFinalizaCargaControle", query = "update controle_carga set DTA_FIM = sysdate, "
            + "QTD_REGISTROS_PROCESSADOS = nvl(?, QTD_REGISTROS_PROCESSADOS), "
            + "QTD_TOTAL_REGISTROS = nvl(?, QTD_TOTAL_REGISTROS), "
            + "STA_PROCESSAMENTO = ? "
            + "where cod_arquivo = ? and sta_processamento not in ('F', 'E')")})
public class Arquivo implements Serializable {

    private static final long serialVersionUID = 4922787304439426760L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqArquivo")
    @Column(name = "COD_ARQUIVO")
    private Long codArquivo;
    @Column(name = "NRO_SEQ_ARQUIVO")
    private Long nroSeqArquivo;
    @Column(name = "NME_ARQUIVO_ORIGEM")
    private String nmeArquivoOrigem;
    @Column(name = "DTA_CRIACAO")
    @Temporal(value = TemporalType.DATE)
    private Date dtaCriacao;
    @Column(name = "NME_ARQUIVO_PROCESSADO")
    private String nmeArquivoProcessado;
    @Column(name = "DTA_CRIACAO_ARQ")
    @Temporal(value = TemporalType.DATE)
    private Date dtaCriacaoArq;
    @Column(name = "EMPID")
    private Long empid;
    @Column(name = "COD_OPERADORA")
    private Long codOperadora;
    @Column(name = "TPO_ARQUIVO")
    private String tpoArquivo;

    public Arquivo() {
    }

    public void setCodArquivo(Long codArquivo) {
        this.codArquivo = codArquivo;
    }

    public Long getCodArquivo() {
        return codArquivo;
    }

    public void setNroSeqArquivo(Long nroSeqArquivo) {
        this.nroSeqArquivo = nroSeqArquivo;
    }

    public Long getNroSeqArquivo() {
        return nroSeqArquivo;
    }

    public void setNmeArquivoOrigem(String nmeArquivoOrigem) {
        this.nmeArquivoOrigem = nmeArquivoOrigem;
    }

    public String getNmeArquivoOrigem() {
        return nmeArquivoOrigem;
    }

    public void setDtaCriacao(Date dtaCriacao) {
        this.dtaCriacao = dtaCriacao;
    }

    public Date getDtaCriacao() {
        return dtaCriacao;
    }

    public void setNmeArquivoProcessado(String nmeArquivoProcessado) {
        this.nmeArquivoProcessado = nmeArquivoProcessado;
    }

    public String getNmeArquivoProcessado() {
        return nmeArquivoProcessado;
    }

    public void setDtaCriacaoArq(Date dtaCriacaoArq) {
        this.dtaCriacaoArq = dtaCriacaoArq;
    }

    public Date getDtaCriacaoArq() {
        return dtaCriacaoArq;
    }

    public void setEmpid(Long empid) {
        this.empid = empid;
    }

    public Long getEmpid() {
        return empid;
    }

    public void setCodOperadora(Long codOperadora) {
        this.codOperadora = codOperadora;
    }

    public Long getCodOperadora() {
        return codOperadora;
    }

    public void setTpoArquivo(String tpoArquivo) {
        this.tpoArquivo = tpoArquivo;
    }

    public String getTpoArquivo() {
        return tpoArquivo;
    }
}
