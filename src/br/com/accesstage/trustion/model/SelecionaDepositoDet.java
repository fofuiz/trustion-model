/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.accesstage.trustion.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author elaine.querido
 */
@Entity(name = "t_seleciona_deposito_det")
public class SelecionaDepositoDet implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tSelecionaDepositoDetSeq")
    @SequenceGenerator(name = "tSelecionaDepositoDetSeq", sequenceName = "t_seleciona_deposito_det_seq", allocationSize = 1)
    @Column(name = "id_seleciona_deposito_det")
    private Integer idSelecionaDepositoDet;

    @Column(name = "id_cliente")
    private int idCliente;
    
    @Column(name = "cliente_compusafe")
    private String clienteCompusafe;
    
    @Column(name = "cnpj_cliente")
    private String cnpjCliente;
    
    @Column(name = "id_equipamento")
    private Long idEquipamento;
    
    @Column(name = "num_serie_equipamento")
    private String numSerieEquipamento;
    
    @Column(name = "cod_movimento")
    private Integer codMovimento;
    
    @Column(name = "sequencia")
    private Integer sequencia;
    
    @Column(name = "depositante")
    private String depositante;
    
    @Column(name = "tipo_deposito")
    private String tipoDeposito;
    
    @Column(name = "deposito_dt")
    private LocalDateTime depositoDt;
    
    @Column(name = "tipo_moeda")
    private String tipoMoeda;
    
    @Column(name = "id_fechamento")
    private Integer idFechamento;
    
    @Column(name = "nota_001")
    private Long nota001;
    
    @Column(name = "nota_002")
    private Long nota002;
    
    @Column(name = "nota_005")
    private Long nota005;
    
    @Column(name = "nota_010")
    private Long nota010;
    
    @Column(name = "nota_020")
    private Long nota020;
    
    @Column(name = "nota_050")
    private Long nota050;
    
    @Column(name = "nota_100")
    private Long nota100;
    
    @Column(name = "valor_total")
    private BigDecimal valorTotal;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    public SelecionaDepositoDet() {
    }

    public SelecionaDepositoDet(Integer idSelecionaDepositoDet) {
        this.idSelecionaDepositoDet = idSelecionaDepositoDet;
    }

    public Integer getIdSelecionaDepositoDet() {
        return idSelecionaDepositoDet;
    }

    public void setIdSelecionaDepositoDet(Integer idSelecionaDepositoDet) {
        this.idSelecionaDepositoDet = idSelecionaDepositoDet;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getClienteCompusafe() {
        return clienteCompusafe;
    }

    public void setClienteCompusafe(String clienteCompusafe) {
        this.clienteCompusafe = clienteCompusafe;
    }

    public String getCnpjCliente() {
        return cnpjCliente;
    }

    public void setCnpjCliente(String cnpjCliente) {
        this.cnpjCliente = cnpjCliente;
    }

    public Long getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(Long idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public String getNumSerieEquipamento() {
        return numSerieEquipamento;
    }

    public void setNumSerieEquipamento(String numSerieEquipamento) {
        this.numSerieEquipamento = numSerieEquipamento;
    }

    public Integer getCodMovimento() {
        return codMovimento;
    }

    public void setCodMovimento(Integer codMovimento) {
        this.codMovimento = codMovimento;
    }

    public Integer getSequencia() {
        return sequencia;
    }

    public void setSequencia(Integer sequencia) {
        this.sequencia = sequencia;
    }

    public String getDepositante() {
        return depositante;
    }

    public void setDepositante(String depositante) {
        this.depositante = depositante;
    }

    public String getTipoDeposito() {
        return tipoDeposito;
    }

    public void setTipoDeposito(String tipoDeposito) {
        this.tipoDeposito = tipoDeposito;
    }

    public LocalDateTime getDepositoDt() {
        return depositoDt;
    }

    public void setDepositoDt(LocalDateTime depositoDt) {
        this.depositoDt = depositoDt;
    }

    public String getTipoMoeda() {
        return tipoMoeda;
    }

    public void setTipoMoeda(String tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
    }

    public Integer getIdFechamento() {
        return idFechamento;
    }

    public void setIdFechamento(Integer idFechamento) {
        this.idFechamento = idFechamento;
    }

    public Long getNota001() {
        return nota001;
    }

    public void setNota001(Long nota001) {
        this.nota001 = nota001;
    }

    public Long getNota002() {
        return nota002;
    }

    public void setNota002(Long nota002) {
        this.nota002 = nota002;
    }

    public Long getNota005() {
        return nota005;
    }

    public void setNota005(Long nota005) {
        this.nota005 = nota005;
    }

    public Long getNota010() {
        return nota010;
    }

    public void setNota010(Long nota010) {
        this.nota010 = nota010;
    }

    public Long getNota020() {
        return nota020;
    }

    public void setNota020(Long nota020) {
        this.nota020 = nota020;
    }

    public Long getNota050() {
        return nota050;
    }

    public void setNota050(Long nota050) {
        this.nota050 = nota050;
    }

    public Long getNota100() {
        return nota100;
    }

    public void setNota100(Long nota100) {
        this.nota100 = nota100;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSelecionaDepositoDet != null ? idSelecionaDepositoDet.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SelecionaDepositoDet)) {
            return false;
        }
        SelecionaDepositoDet other = (SelecionaDepositoDet) object;
        if ((this.idSelecionaDepositoDet == null && other.idSelecionaDepositoDet != null) || (this.idSelecionaDepositoDet != null && !this.idSelecionaDepositoDet.equals(other.idSelecionaDepositoDet))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.accesstage.trustion.model.SelecionaDepositoDet[ idSelecionaDepositoDet=" + idSelecionaDepositoDet + " ]";
    }
    
}
