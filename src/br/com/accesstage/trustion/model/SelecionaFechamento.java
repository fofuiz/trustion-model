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
@Entity(name = "t_seleciona_fechamento")
public class SelecionaFechamento implements Serializable {

    private static final long serialVersionUID = 3037235274689408574L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tSelecionaFechamentoSeq")
    @SequenceGenerator(name = "tSelecionaFechamentoSeq", sequenceName = "t_seleciona_fechamento_seq", allocationSize = 1)
    @Column(name = "id_seleciona_fechamento")
    private Long idSelecionaFechamento;

    @Column(name = "id_fechamento")
    private Long idFechamento;

    @Column(name = "id_cliente")
    private Long idCliente;

    @Column(name = "id_equipamento")
    private Long idEquipamento;

    @Column(name = "banco_cliente")
    private String bancoCliente;

    @Column(name = "cliente_compusafe")
    private String clienteCompusafe;

    @Column(name = "cnpj_cliente")
    private String cnpjCliente;

    @Column(name = "num_serie_equipamento")
    private String numSerieEquipamento;

    @Column(name = "corte_dt")
    private LocalDateTime corteDt;

    @Column(name = "agencia_cliente")
    private String agenciaCliente;

    @Column(name = "conta_cliente")
    private String contaCliente;

    @Column(name = "valor_creditar")
    private BigDecimal valorCreditar;

    @Column(name = "tipo_moeda")
    private String tipoMoeda;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    public SelecionaFechamento() {
    }

    public SelecionaFechamento(Long idSelecionaFechamento) {
        this.idSelecionaFechamento = idSelecionaFechamento;
    }

    public Long getIdSelecionaFechamento() {
        return idSelecionaFechamento;
    }

    public void setIdSelecionaFechamento(Long idSelecionaFechamento) {
        this.idSelecionaFechamento = idSelecionaFechamento;
    }

    public Long getIdFechamento() {
        return idFechamento;
    }

    public void setIdFechamento(Long idFechamento) {
        this.idFechamento = idFechamento;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Long getIdEquipamento() {
        return idEquipamento;
    }

    public void setIdEquipamento(Long idEquipamento) {
        this.idEquipamento = idEquipamento;
    }

    public String getBancoCliente() {
        return bancoCliente;
    }

    public void setBancoCliente(String bancoCliente) {
        this.bancoCliente = bancoCliente;
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

    public String getNumSerieEquipamento() {
        return numSerieEquipamento;
    }

    public void setNumSerieEquipamento(String numSerieEquipamento) {
        this.numSerieEquipamento = numSerieEquipamento;
    }

    public LocalDateTime getCorteDt() {
        return corteDt;
    }

    public void setCorteDt(LocalDateTime corteDt) {
        this.corteDt = corteDt;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    

    public String getAgenciaCliente() {
        return agenciaCliente;
    }

    public void setAgenciaCliente(String agenciaCliente) {
        this.agenciaCliente = agenciaCliente;
    }

    public String getContaCliente() {
        return contaCliente;
    }

    public void setContaCliente(String contaCliente) {
        this.contaCliente = contaCliente;
    }

    public BigDecimal getValorCreditar() {
        return valorCreditar;
    }

    public void setValorCreditar(BigDecimal valorCreditar) {
        this.valorCreditar = valorCreditar;
    }

    public String getTipoMoeda() {
        return tipoMoeda;
    }

    public void setTipoMoeda(String tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSelecionaFechamento != null ? idSelecionaFechamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SelecionaFechamento)) {
            return false;
        }
        SelecionaFechamento other = (SelecionaFechamento) object;
        if ((this.idSelecionaFechamento == null && other.idSelecionaFechamento != null) || (this.idSelecionaFechamento != null && !this.idSelecionaFechamento.equals(other.idSelecionaFechamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.accesstage.trustion.model.SelecionaFechamento[ idSelecionaFechamento=" + idSelecionaFechamento + " ]";
    }

}
