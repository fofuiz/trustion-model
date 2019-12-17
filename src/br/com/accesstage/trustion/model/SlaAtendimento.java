package br.com.accesstage.trustion.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "t_sla_atendimento")
public class SlaAtendimento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tSlaAtendimentoSeq")
    @SequenceGenerator(name = "tSlaAtendimentoSeq", sequenceName = "t_sla_atendimento_seq", allocationSize = 1)
    @Column(name = "id_sla_atendimento")
    private Long idSlaAtendimento;

    @Column(name = "id_modelo_negocio")
    private Long idModeloNegocio;

    @Column(name = "dias_analise_solicitada")
    private Integer qtdDiasAnaliseSolicitada;

    @Column(name = "is_dia_util_analise_solicitada")
    private boolean analiseSolDiaUtil;

    @Column(name = "dias_analise_andamento")
    private Integer qtdDiasAnaliseAndamento;

    @Column(name = "is_dia_util_analise_andamento")
    private boolean analiseAndDiaUtil;

    @Column(name = "dias_analise_aguardando")
    private Integer qtdDiasAnaliseAguarde;

    @Column(name = "is_dia_util_analise_aguardando")
    private boolean analiseAguarDiaUtil;

    public Long getIdSlaAtendimento() {
        return idSlaAtendimento;
    }

    public void setIdSlaAtendimento(Long idSlaAtendimento) {
        this.idSlaAtendimento = idSlaAtendimento;
    }

    public Integer getQtdDiasAnaliseSolicitada() {
        return qtdDiasAnaliseSolicitada;
    }

    public void setQtdDiasAnaliseSolicitada(Integer qtdDiasAnaliseSolicitada) {
        this.qtdDiasAnaliseSolicitada = qtdDiasAnaliseSolicitada;
    }

    public boolean isAnaliseSolDiaUtil() {
        return analiseSolDiaUtil;
    }

    public void setAnaliseSolDiaUtil(boolean analiseSolDiaUtil) {
        this.analiseSolDiaUtil = analiseSolDiaUtil;
    }

    public Integer getQtdDiasAnaliseAndamento() {
        return qtdDiasAnaliseAndamento;
    }

    public void setQtdDiasAnaliseAndamento(Integer qtdDiasAnaliseAndamento) {
        this.qtdDiasAnaliseAndamento = qtdDiasAnaliseAndamento;
    }

    public boolean isAnaliseAndDiaUtil() {
        return analiseAndDiaUtil;
    }

    public void setAnaliseAndDiaUtil(boolean analiseAndDiaUtil) {
        this.analiseAndDiaUtil = analiseAndDiaUtil;
    }

    public Integer getQtdDiasAnaliseAguarde() {
        return qtdDiasAnaliseAguarde;
    }

    public void setQtdDiasAnaliseAguarde(Integer qtdDiasAnaliseAguarde) {
        this.qtdDiasAnaliseAguarde = qtdDiasAnaliseAguarde;
    }

    public boolean isAnaliseAguarDiaUtil() {
        return analiseAguarDiaUtil;
    }

    public void setAnaliseAguarDiaUtil(boolean analiseAguarDiaUtil) {
        this.analiseAguarDiaUtil = analiseAguarDiaUtil;
    }

    public Long getIdModeloNegocio() {
        return idModeloNegocio;
    }

    public void setIdModeloNegocio(Long idModeloNegocio) {
        this.idModeloNegocio = idModeloNegocio;
    }

}
