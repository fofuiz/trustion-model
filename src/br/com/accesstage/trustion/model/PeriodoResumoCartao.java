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

@Entity(name = "t_periodo_resumo_cartao")
public class PeriodoResumoCartao implements Serializable {

    @Id
    @SequenceGenerator(name = "tPeriodoResumoCartaoSeq", allocationSize = 1, sequenceName = "t_periodo_resumo_cartao_seq")
    @GeneratedValue(generator = "tPeriodoResumoCartaoSeq", strategy = GenerationType.SEQUENCE)
    @Column(name = "id_periodo_resumo")
    private Long idPeriodoResumo;

    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "periodo_venda")
    private Long periodoVenda;

    @Column(name = "periodo_recebimento")
    private Long periodoRecebimento;

    @Column(name = "periodo_recebimento_futuro")
    private Long periodoRecebimentoFuturo;

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

    public PeriodoResumoCartao() {
    }

    public Long getIdPeriodoResumo() {
        return idPeriodoResumo;
    }

    public void setIdPeriodoResumo(Long idPeriodoResumo) {
        this.idPeriodoResumo = idPeriodoResumo;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Long getPeriodoVenda() {
        return periodoVenda;
    }

    public void setPeriodoVenda(Long periodoVenda) {
        this.periodoVenda = periodoVenda;
    }

    public Long getPeriodoRecebimento() {
        return periodoRecebimento;
    }

    public void setPeriodoRecebimento(Long periodoRecebimento) {
        this.periodoRecebimento = periodoRecebimento;
    }

    public Long getPeriodoRecebimentoFuturo() {
        return periodoRecebimentoFuturo;
    }

    public void setPeriodoRecebimentoFuturo(Long periodoRecebimentoFuturo) {
        this.periodoRecebimentoFuturo = periodoRecebimentoFuturo;
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
}
