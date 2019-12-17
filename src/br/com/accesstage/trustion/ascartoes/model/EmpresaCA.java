package br.com.accesstage.trustion.ascartoes.model;

import br.com.accesstage.trustion.ascartoes.model.enums.StatusEnum;
import br.com.accesstage.trustion.ascartoes.model.enums.TipoArquivoRemessaEnum;
import br.com.accesstage.trustion.ascartoes.model.enums.TipoConciliacaoEnum;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;

@Entity
@FilterDef(name = EmpresaCA.FILTER_FILIAIS_ATIVAS)
@Table(name = "ADM_EMPRESA")
public class EmpresaCA implements Serializable {

    private static final long serialVersionUID = -9176038533883742981L;

    public static final String FILTER_FILIAIS_ATIVAS = "filiaisAtivas";

    @Id
    @Column(name = "EMPID")
    private Long id;

    @ManyToOne(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinColumn(name = "EMPID_MATRIZ")
    private EmpresaCA matriz;

    @OneToMany(mappedBy = "matriz", fetch = FetchType.LAZY)
    @Filter(name = "filiaisAtivas", condition = "1 = STA_EMPRESA")
    private Set<EmpresaCA> filiais;

    @Column(name = "CNPJ")
    private String cnpj;

    @Column(name = "DSC_RAZAO_SOCIAL")
    private String razaoSocial;

    @Column(name = "STA_EMPRESA")
    private Integer staEmpresa;

    @Column(name = "ULT_SEQ_ARQ_BAIXAS")
    private Integer ultSeqArqBaixas;

    @Column(name = "STA_EXPORTACAO")
    private boolean staExportacao;

    @Column(name = "SENDER_EXP", length = 12)
    private String senderExp;

    @Column(name = "RECEIVER_EXP", length = 12)
    private String receiverExp;

    @Column(name = "DOCTYPE_EXP", length = 100)
    private String docTypeExp;

    @Column(name = "HORA_EXEC")
    private Integer horaExec;

    @Column(name = "STA_CONCILIA_FLEX_DATA")
    private Boolean staConciliaFlexData;

    @Column(name = "NRO_DIAS_FLEX_DATA")
    private Integer nroDiasFlexData;

    @Column(name = "NRO_HORA_SALDO")
    private Integer nroHoraSaldo;

    @Column(name = "STA_SALDO_ABERTO ")
    private Boolean staSaldoAberto;

    @Column(name = "STA_IMPLANTACAO")
    private Boolean staImplantacao;

    @Column(name = "COD_SEMANAL_SALDO_ABERTO")
    private Integer codSemanalSaldoAberto;

    @Column(name = "COD_MENSAL_SALDO_ABERTO")
    private Integer codMensalSaldoAberto;

    @Column(name = "TPO_PERIODO_SALDO_ABERTO")
    private Integer tpoPeriodoSaldoAberto;

    @Column(name = " DSC_SENDER_SALDO")
    private String dscSenderSaldo;

    @Column(name = "DSC_RECEIVER_SALDO")
    private String dscReceiverSaldo;

    @Column(name = "DSC_DOCTYPE_SALDO")
    private String dscDocTypeSaldo;

    @Column(name = "TPO_CONCILIACAO")
    private Integer tpoConciliacao;

    @Column(name = "STA_RETORNO_REMESSA")
    private boolean staRetornoRemessa;

    @Column(name = "DSC_SENDER_RET_REM", length = 12)
    private String senderRetRem;

    @Column(name = "DSC_RECEIVER_RET_REM", length = 12)
    private String receiverRetRem;

    @Column(name = "DSC_DOCTYPE_RET_REM", length = 100)
    private String docTypeRetRem;

    @Column(name = "STA_EXPORT_VENDAS")
    private boolean staExportVendas;

    @Column(name = "NRO_HORA_VENDAS")
    private Integer nroHoraVendas;

    @Column(name = "DSC_SENDER_EXP_VENDAS", length = 12)
    private String senderExpVendas;

    @Column(name = "GERAR_HASH", length = 12)
    private Integer gerarHashVenda;

    @Column(name = "DSC_RECEIVER_EXP_VENDAS", length = 12)
    private String receiverExpVendas;

    @Column(name = "DSC_DOCTYPE_EXP_VENDAS", length = 100)
    private String docTypeExpVendas;

    @Column(name = "TPO_REMESSA")
    private Integer tpoRemessa;

    @Column(name = "NRO_DIAS_REL_CUST")
    private Integer nroDiasRelCust;

    @Column(name = "COD_SEGMENTO")
    private Integer codigoSegmento;

    @Column(name = "STA_CONCILIA", length = 10)
    private String staConciliacao;

    @Column(name = "STA_VENDAS_CONCI_MANUAL")
    private boolean staVendaConciliadaManual;

    @Column(name = "NRO_HRA_VENDAS_CONCI_MANUAL")
    private Integer nroHoraVendaConciliadaManual;

    @Column(name = "DSC_SEN_EXP_VENDAS_CONCI_MAN", length = 12)
    private String dscSenderVendaConciliadaManual;

    @Column(name = "DSC_REC_EXP_VENDAS_CONCI_MAN", length = 12)
    private String dscReceiverVendaConciliadaManual;

    @Column(name = "DSC_DOCT_EXP_VENDAS_CONCI_MAN", length = 20)
    private String dscDocTypeVendaConciliadaManual;

    @Column(name = "STA_EXP_RPT_VOL_VENDA")
    private Boolean staExportAutoRelatVolumetriaVenda;

    @Column(name = "NRO_HRA_EXP_RPT_VOL_VENDA")
    private Integer nroHoraExportAutoRelatVolumetriaVenda;

    @Column(name = "DSC_SEN_EXP_RPT_VOL_VENDA", length = 12)
    private String dscSenderExportAutoRelatVolumetriaVenda;

    @Column(name = "DSC_REC_EXP_RPT_VOL_VENDA", length = 12)
    private String dscReceiverExportAutoRelatVolumetriaVenda;

    @Column(name = "DSC_DOCT_EXP_RPT_VOL_VENDA", length = 20)
    private String dscDocTypeExportAutoRelatVolumetriaVenda;

    //getters e setters
    public boolean isStaExportacao() {
        return staExportacao;
    }

    public void setStaExportacao(boolean staExportacao) {
        this.staExportacao = staExportacao;
    }

    public String getSenderExp() {
        return senderExp;
    }

    public void setSenderExp(String senderExp) {
        this.senderExp = senderExp;
    }

    public String getReceiverExp() {
        return receiverExp;
    }

    public void setReceiverExp(String receiverExp) {
        this.receiverExp = receiverExp;
    }

    public String getDocTypeExp() {
        return docTypeExp;
    }

    public void setDocTypeExp(String docTypeExp) {
        this.docTypeExp = docTypeExp;
    }

    public Integer getHoraExec() {
        return horaExec;
    }

    public void setHoraExec(Integer horaExec) {
        this.horaExec = horaExec;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Integer getStaEmpresa() {
        return staEmpresa;
    }

    public void setStaEmpresa(Integer staEmpresa) {
        this.staEmpresa = staEmpresa;
    }

    public void setStaEmpresa(StatusEnum status) {
        this.staEmpresa = status.getCodStatus();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public EmpresaCA getMatriz() {
        return matriz;
    }

    public void setMatriz(EmpresaCA matriz) {
        this.matriz = matriz;
    }

    public Set<EmpresaCA> getFiliais() {
        return filiais;
    }

    public Set<EmpresaCA> getMatrizFiliais() {
        Set<EmpresaCA> matrizFiliais = filiais == null ? filiais = new HashSet<>() : new HashSet<>(filiais);

        matrizFiliais.add(this);

        return matrizFiliais;
    }

    public void setFiliais(Set<EmpresaCA> filiais) {
        this.filiais = filiais;
    }

    public Integer getUltSeqArqBaixas() {
        return ultSeqArqBaixas;
    }

    public void setUltSeqArqBaixas(Integer ultSeqArqBaixas) {
        this.ultSeqArqBaixas = ultSeqArqBaixas;
    }

    public void setNroDiasFlexData(Integer nroDiasFlexData) {
        this.nroDiasFlexData = nroDiasFlexData;
    }

    public Integer getNroDiasFlexData() {
        return nroDiasFlexData;
    }

    public void setStaConciliaFlexData(Boolean staConciliaFlexData) {
        this.staConciliaFlexData = staConciliaFlexData;
    }

    public Boolean getStaConciliaFlexData() {
        return staConciliaFlexData;
    }

    public Integer getNroHoraSaldo() {
        return nroHoraSaldo;
    }

    public void setNroHoraSaldo(Integer nroHoraSaldo) {
        this.nroHoraSaldo = nroHoraSaldo;
    }

    public Boolean getStaSaldoAberto() {
        return staSaldoAberto;
    }

    public void setStaSaldoAberto(Boolean staSaldoAberto) {
        this.staSaldoAberto = staSaldoAberto;
    }

    public String getDscSenderSaldo() {
        return dscSenderSaldo;
    }

    public void setDscSenderSaldo(String dscSenderSaldo) {
        this.dscSenderSaldo = dscSenderSaldo;
    }

    public String getDscReceiverSaldo() {
        return dscReceiverSaldo;
    }

    public void setDscReceiverSaldo(String dscReceiverSaldo) {
        this.dscReceiverSaldo = dscReceiverSaldo;
    }

    public String getDscDocTypeSaldo() {
        return dscDocTypeSaldo;
    }

    public void setDscDocTypeSaldo(String dscDocTypeSaldo) {
        this.dscDocTypeSaldo = dscDocTypeSaldo;
    }

    public Integer getTpoConciliacao() {
        return tpoConciliacao;
    }

    public void setTpoConciliacao(Integer tpoConciliacao) {
        this.tpoConciliacao = tpoConciliacao;
    }

    public void setTpoConciliacao(TipoConciliacaoEnum conciliacaoEnum) {
        this.tpoConciliacao = conciliacaoEnum.getValue();
    }

    public boolean isStaRetornoRemessa() {
        return staRetornoRemessa;
    }

    public void setStaRetornoRemessa(boolean staRetornoRemessa) {
        this.staRetornoRemessa = staRetornoRemessa;
    }

    public String getSenderRetRem() {
        return senderRetRem;
    }

    public void setSenderRetRem(String senderRetRem) {
        this.senderRetRem = senderRetRem;
    }

    public String getReceiverRetRem() {
        return receiverRetRem;
    }

    public void setReceiverRetRem(String receiverRetRem) {
        this.receiverRetRem = receiverRetRem;
    }

    public String getDocTypeRetRem() {
        return docTypeRetRem;
    }

    public void setDocTypeRetRem(String docTypeRetRem) {
        this.docTypeRetRem = docTypeRetRem;
    }

    public boolean isStaExportVendas() {
        return staExportVendas;
    }

    public void setStaExportVendas(boolean staExportVendas) {
        this.staExportVendas = staExportVendas;
    }

    public String getSenderExpVendas() {
        return senderExpVendas;
    }

    public void setSenderExpVendas(String senderExpVendas) {
        this.senderExpVendas = senderExpVendas;
    }

    public String getReceiverExpVendas() {
        return receiverExpVendas;
    }

    public void setReceiverExpVendas(String receiverExpVendas) {
        this.receiverExpVendas = receiverExpVendas;
    }

    public String getDocTypeExpVendas() {
        return docTypeExpVendas;
    }

    public void setDocTypeExpVendas(String docTypeExpVendas) {
        this.docTypeExpVendas = docTypeExpVendas;
    }

    public Integer getTpoRemessa() {
        return tpoRemessa;
    }

    public void setTpoRemessa(Integer tpoRemessa) {
        this.tpoRemessa = tpoRemessa;
    }

    public void setTpoRemessa(TipoArquivoRemessaEnum arquivoRemessaEnum) {
        this.tpoRemessa = arquivoRemessaEnum.getValue();
    }

    public Integer getNroHoraVendas() {
        return nroHoraVendas;
    }

    public Integer getCodigoSegmento() {
        return codigoSegmento;
    }

    public void setCodigoSegmento(Integer codigoSegmento) {
        this.codigoSegmento = codigoSegmento;
    }

    public void setNroHoraVendas(Integer nroHoraVendas) {
        this.nroHoraVendas = nroHoraVendas;
    }

    public void setCodSemanalSaldoAberto(Integer codSemanalSaldoAberto) {
        this.codSemanalSaldoAberto = codSemanalSaldoAberto;
    }

    public Integer getCodSemanalSaldoAberto() {
        return codSemanalSaldoAberto;
    }

    public void setCodMensalSaldoAberto(Integer codMensalSaldoAberto) {
        this.codMensalSaldoAberto = codMensalSaldoAberto;
    }

    public Integer getCodMensalSaldoAberto() {
        return codMensalSaldoAberto;
    }

    public void setTpoPeriodoSaldoAberto(Integer tpoPeriodoSaldoAberto) {
        this.tpoPeriodoSaldoAberto = tpoPeriodoSaldoAberto;
    }

    public Integer getTpoPeriodoSaldoAberto() {
        return tpoPeriodoSaldoAberto;
    }

    public void setStaImplantacao(Boolean staImplantacao) {
        this.staImplantacao = staImplantacao;
    }

    public Boolean getStaImplantacao() {
        return staImplantacao;
    }

    public Integer getNroDiasRelCust() {
        return nroDiasRelCust;
    }

    public void setNroDiasRelCust(Integer nroDiasRelCust) {
        this.nroDiasRelCust = nroDiasRelCust;
    }

    public String getStaConciliacao() {
        return staConciliacao;
    }

    public void setStaConciliacao(String staConciliacao) {
        this.staConciliacao = staConciliacao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        EmpresaCA other = (EmpresaCA) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

    public Integer getGerarHashVenda() {
        return gerarHashVenda;
    }

    public void setGerarHashVenda(Integer gerarHashVenda) {
        this.gerarHashVenda = gerarHashVenda;
    }

    public boolean isStaVendaConciliadaManual() {
        return staVendaConciliadaManual;
    }

    public void setStaVendaConciliadaManual(boolean staVendaConciliadaManual) {
        this.staVendaConciliadaManual = staVendaConciliadaManual;
    }

    public Integer getNroHoraVendaConciliadaManual() {
        return nroHoraVendaConciliadaManual;
    }

    public void setNroHoraVendaConciliadaManual(Integer nroHoraVendaConciliadaManual) {
        this.nroHoraVendaConciliadaManual = nroHoraVendaConciliadaManual;
    }

    public String getDscSenderVendaConciliadaManual() {
        return dscSenderVendaConciliadaManual;
    }

    public void setDscSenderVendaConciliadaManual(String dscSenderVendaConciliadaManual) {
        this.dscSenderVendaConciliadaManual = dscSenderVendaConciliadaManual;
    }

    public String getDscReceiverVendaConciliadaManual() {
        return dscReceiverVendaConciliadaManual;
    }

    public void setDscReceiverVendaConciliadaManual(String dscReceiverVendaConciliadaManual) {
        this.dscReceiverVendaConciliadaManual = dscReceiverVendaConciliadaManual;
    }

    public String getDscDocTypeVendaConciliadaManual() {
        return dscDocTypeVendaConciliadaManual;
    }

    public void setDscDocTypeVendaConciliadaManual(String dscDocTypeVendaConciliadaManual) {
        this.dscDocTypeVendaConciliadaManual = dscDocTypeVendaConciliadaManual;
    }

    public Boolean getStaExportAutoRelatVolumetriaVenda() {
        return staExportAutoRelatVolumetriaVenda;
    }

    public void setStaExportAutoRelatVolumetriaVenda(Boolean staExportAutoRelatVolumetriaVenda) {
        this.staExportAutoRelatVolumetriaVenda = staExportAutoRelatVolumetriaVenda;
    }

    public Integer getNroHoraExportAutoRelatVolumetriaVenda() {
        return nroHoraExportAutoRelatVolumetriaVenda;
    }

    public void setNroHoraExportAutoRelatVolumetriaVenda(Integer nroHoraExportAutoRelatVolumetriaVenda) {
        this.nroHoraExportAutoRelatVolumetriaVenda = nroHoraExportAutoRelatVolumetriaVenda;
    }

    public String getDscSenderExportAutoRelatVolumetriaVenda() {
        return dscSenderExportAutoRelatVolumetriaVenda;
    }

    public void setDscSenderExportAutoRelatVolumetriaVenda(String dscSenderExportAutoRelatVolumetriaVenda) {
        this.dscSenderExportAutoRelatVolumetriaVenda = dscSenderExportAutoRelatVolumetriaVenda;
    }

    public String getDscReceiverExportAutoRelatVolumetriaVenda() {
        return dscReceiverExportAutoRelatVolumetriaVenda;
    }

    public void setDscReceiverExportAutoRelatVolumetriaVenda(String dscReceiverExportAutoRelatVolumetriaVenda) {
        this.dscReceiverExportAutoRelatVolumetriaVenda = dscReceiverExportAutoRelatVolumetriaVenda;
    }

    public String getDscDocTypeExportAutoRelatVolumetriaVenda() {
        return dscDocTypeExportAutoRelatVolumetriaVenda;
    }

    public void setDscDocTypeExportAutoRelatVolumetriaVenda(String dscDocTypeExportAutoRelatVolumetriaVenda) {
        this.dscDocTypeExportAutoRelatVolumetriaVenda = dscDocTypeExportAutoRelatVolumetriaVenda;
    }
}
