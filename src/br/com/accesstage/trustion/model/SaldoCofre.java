package br.com.accesstage.trustion.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author gabriel
 *
 */
@Entity(name = "t_saldo_cofre")
public class SaldoCofre {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tSaldoCofreSeq")
    @SequenceGenerator(name = "tSaldoCofreSeq", sequenceName = "t_saldo_cofre_seq", allocationSize = 1)
    @Column(name = "id_saldo_cofre")
    private Long idSaldoCofre;

    @Column(name = "id_cliente")
    private long clienteID;

    @Column(name = "cliente_compusafe")
    private String clienteCompusafe;

    @Column(name = "cnpj_cliente")
    private String cnpjCliente;

    @Column(name = "id_equipamento")
    private long id_equipamento;

    @Column(name = "num_serie_equipamento")
    private String equipamentoNumeroSerial;

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

    @Column(name = "valor_total")
    private Long valorTotal;

    @Column(name = "tipo_deposito")
    private String tipoDeposito;

    @Column(name = "saldo_credita")
    private Long saldoCreditar;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    public Long getIdSaldoCofre() {
        return idSaldoCofre;
    }

    public long getClienteID() {
        return clienteID;
    }

    public String getClienteCompusafe() {
        return clienteCompusafe;
    }

    public String getEquipamentoNumeroSerial() {
        return equipamentoNumeroSerial;
    }

    public Long getNotas_001() {
        return notas_001;
    }

    public Long getNotas_002() {
        return notas_002;
    }

    public Long getNotas_005() {
        return notas_005;
    }

    public Long getNotas_010() {
        return notas_010;
    }

    public Long getNotas_020() {
        return notas_020;
    }

    public Long getNotas_050() {
        return notas_050;
    }

    public Long getNotas_100() {
        return notas_100;
    }

    public Long getValorTotal() {
        return valorTotal;
    }

    public String getTipoDeposito() {
        return tipoDeposito;
    }

    public void setIdSaldoCofre(Long idSaldoCofre) {
        this.idSaldoCofre = idSaldoCofre;
    }

    public void setClienteID(long clienteID) {
        this.clienteID = clienteID;
    }

    public void setClienteCompusafe(String clienteCompusafe) {
        this.clienteCompusafe = clienteCompusafe;
    }

    public void setEquipamentoNumeroSerial(String equipamentoNumeroSerial) {
        this.equipamentoNumeroSerial = equipamentoNumeroSerial;
    }

    public void setNotas_001(Long notas_001) {
        this.notas_001 = notas_001;
    }

    public void setNotas_002(Long notas_002) {
        this.notas_002 = notas_002;
    }

    public void setNotas_005(Long notas_005) {
        this.notas_005 = notas_005;
    }

    public void setNotas_010(Long notas_010) {
        this.notas_010 = notas_010;
    }

    public void setNotas_020(Long notas_020) {
        this.notas_020 = notas_020;
    }

    public void setNotas_050(Long notas_050) {
        this.notas_050 = notas_050;
    }

    public void setNotas_100(Long notas_100) {
        this.notas_100 = notas_100;
    }

    public void setValorTotal(Long valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setTipoDeposito(String tipoDeposito) {
        this.tipoDeposito = tipoDeposito;
    }

    public String getCnpjCliente() {
        return cnpjCliente;
    }

    public long getId_equipamento() {
        return id_equipamento;
    }

    public void setCnpjCliente(String cnpjCliente) {
        this.cnpjCliente = cnpjCliente;
    }

    public void setId_equipamento(long id_equipamento) {
        this.id_equipamento = id_equipamento;
    }

    public Long getSaldoCreditar() {
        return saldoCreditar;
    }

    public void setSaldoCreditar(Long saldoCreditar) {
        this.saldoCreditar = saldoCreditar;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

}
