package br.com.accesstage.trustion.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "t_seleciona_conferencia")
public class SelecionaConferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tSelecionaConferenciaSeq")
    @SequenceGenerator(name = "tSelecionaConferenciaSeq", sequenceName = "t_seleciona_conferencia_seq", allocationSize = 1)
    @Column(name = "id_seleciona_conferencia")
    private Long idSelecionaConferencia;

    @Column(name = "id_equipamento")
    private Long idEquipamento;

    @Column(name = "num_serie_equipamento")
    private String equipamentoNumeroSerial;

    @Column(name = "gtv")
    private String gtv;

    @Column(name = "compartimento")
    private String compartimento;

    @Column(name = "selo")
    private String selo;

    @Column(name = "periodo_inicio_dt")
    private LocalDateTime peridioInicioDT;

    @Column(name = "periodo_fim_dt")
    private LocalDateTime peridioFimDT;

    @Column(name = "cnpj_cliente")
    private String cnpjCliente;

    @Column(name = "dt_coleta_equipamento")
    private LocalDateTime dtColetaEquipamento;

    @Column(name = "dt_conferencia_gtv")
    private LocalDateTime dtConferenciaGTV;

    @Column(name = "cliente_compusafe")
    private String clienteCompusafe;

    @Column(name = "valor_tot_conf")
    private BigDecimal valor_tot_conf;

    @Column(name = "valor_tot_env")
    private BigDecimal valor_tot_env;

    @Column(name = "tipo_moeda")
    private String tipoMoeda;

    @Column(name = "tipo_registro")
    private String tipoRegistro;

    @Column(name = "nota_001")
    private Long notas_001;

    @Column(name = "nota_002")
    private Long notas_002;

    @Column(name = "nota_005")
    private Long notas_005;

    @Column(name = "nota_010")
    private Long notas_010;

    @Column(name = "nota_020")
    private Long notas_020;

    @Column(name = "nota_050")
    private Long notas_050;

    @Column(name = "nota_100")
    private Long notas_100;

    @Column(name = "declara_cofre")
    private BigDecimal declaraCofre;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    public long getIdSelecionaConferencia() {
        return idSelecionaConferencia;
    }

    public void setIdSelecionaConferencia(Long idSelecionaConferencia) {
        this.idSelecionaConferencia = idSelecionaConferencia;
    }

    public long getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(Long idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public String getEquipamentoNumeroSerial() {
        return equipamentoNumeroSerial;
    }

    public void setEquipamentoNumeroSerial(String equipamentoNumeroSerial) {
        this.equipamentoNumeroSerial = equipamentoNumeroSerial;
    }

    public String getGtv() {
        return gtv;
    }

    public void setGtv(String gtv) {
        this.gtv = gtv;
    }

    public LocalDateTime getPeridioInicioDT() {
        return peridioInicioDT;
    }

    public void setPeridioInicioDT(LocalDateTime peridioInicioDT) {
        this.peridioInicioDT = peridioInicioDT;
    }

    public LocalDateTime getPeridioFimDT() {
        return peridioFimDT;
    }

    public void setPeridioFimDT(LocalDateTime peridioFimDT) {
        this.peridioFimDT = peridioFimDT;
    }

    public String getCnpjCliente() {
        return cnpjCliente;
    }

    public void setCnpjCliente(String cnpjCliente) {
        this.cnpjCliente = cnpjCliente;
    }

    public LocalDateTime getDtColetaEquipamento() {
        return dtColetaEquipamento;
    }

    public void setDtColetaEquipamento(LocalDateTime dtColetaEquipamento) {
        this.dtColetaEquipamento = dtColetaEquipamento;
    }

    public LocalDateTime getDtConferenciaGTV() {
        return dtConferenciaGTV;
    }

    public void setDtConferenciaGTV(LocalDateTime dtConferenciaGTV) {
        this.dtConferenciaGTV = dtConferenciaGTV;
    }

    public String getClienteCompusafe() {
        return clienteCompusafe;
    }

    public void setClienteCompusafe(String clienteCompusafe) {
        this.clienteCompusafe = clienteCompusafe;
    }

    public BigDecimal getValor_tot_conf() {
        return valor_tot_conf;
    }

    public void setValor_tot_conf(BigDecimal valor_tot_conf) {
        this.valor_tot_conf = valor_tot_conf;
    }

    public BigDecimal getValor_tot_env() {
        return valor_tot_env;
    }

    public void setValor_tot_env(BigDecimal valor_tot_env) {
        this.valor_tot_env = valor_tot_env;
    }

    public String getTipoMoeda() {
        return tipoMoeda;
    }

    public void setTipoMoeda(String tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
    }

    public String getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(String tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public Long getNotas_001() {
        return notas_001;
    }

    public void setNotas_001(Long notas_001) {
        this.notas_001 = notas_001;
    }

    public Long getNotas_002() {
        return notas_002;
    }

    public void setNotas_002(Long notas_002) {
        this.notas_002 = notas_002;
    }

    public Long getNotas_005() {
        return notas_005;
    }

    public void setNotas_005(Long notas_005) {
        this.notas_005 = notas_005;
    }

    public Long getNotas_010() {
        return notas_010;
    }

    public void setNotas_010(Long notas_010) {
        this.notas_010 = notas_010;
    }

    public Long getNotas_020() {
        return notas_020;
    }

    public void setNotas_020(Long notas_020) {
        this.notas_020 = notas_020;
    }

    public Long getNotas_050() {
        return notas_050;
    }

    public void setNotas_050(Long notas_050) {
        this.notas_050 = notas_050;
    }

    public Long getNotas_100() {
        return notas_100;
    }

    public void setNotas_100(Long notas_100) {
        this.notas_100 = notas_100;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public BigDecimal getDeclaraCofre() {
        return declaraCofre;
    }

    public void setDeclaraCofre(BigDecimal declaraCofre) {
        this.declaraCofre = declaraCofre;
    }

    public String getCompartimento() {
        return compartimento;
    }

    public void setCompartimento(String compartimento) {
        this.compartimento = compartimento;
    }

    public String getSelo() {
        return selo;
    }

    public void setSelo(String selo) {
        this.selo = selo;
    }

}
