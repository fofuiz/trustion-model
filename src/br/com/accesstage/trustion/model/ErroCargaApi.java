package br.com.accesstage.trustion.model;



import javax.persistence.*;
import java.time.LocalDateTime;


@Entity(name = "t_erro_carga_api")
public class ErroCargaApi {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tErroCargaApiSeq")
    @SequenceGenerator(name = "tErroCargaApiSeq", sequenceName = "t_erro_carga_api_seq", allocationSize = 1)
    @Column(name = "id_erro_carga_api")
    private Long idErroCargaApi;

    @Column(name = "id_controle_carga_api")
    private Long idControleCargaApi;

    @Column(name = "id_grupo_economico")
    private Long idGrupoEconomico;

    @Column(name = "id_empresa")
    private Long idEmpresa;

    @Column(name = "id_cofre")
    private Long idCofre;

    @Column(name = "id_seleciona_fechamento")
    private Long idSelecionaFechamento;

    @Column(name = "api")
    private String api;

    @Column(name = "status")
    private String status;

    @Column(name = "descricao_erro")
    private String descricaoErro;

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @Column(name = "data_reprocesso")
    private LocalDateTime dataReprocesso;

    public Long getIdErroCargaApi() {
        return idErroCargaApi;
    }

    public void setIdErroCargaApi(Long idErroCargaApi) {
        this.idErroCargaApi = idErroCargaApi;
    }

    public Long getIdControleCargaApi() {
        return idControleCargaApi;
    }

    public void setIdControleCargaApi(Long idControleCargaApi) {
        this.idControleCargaApi = idControleCargaApi;
    }

    public Long getIdGrupoEconomico() {
        return idGrupoEconomico;
    }

    public void setIdGrupoEconomico(Long idGrupoEconomico) {
        this.idGrupoEconomico = idGrupoEconomico;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Long getIdCofre() {
        return idCofre;
    }

    public void setIdCofre(Long idCofre) {
        this.idCofre = idCofre;
    }

    public Long getIdSelecionaFechamento() {
        return idSelecionaFechamento;
    }

    public void setIdSelecionaFechamento(Long idSelecionaFechamento) {
        this.idSelecionaFechamento = idSelecionaFechamento;
    }

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescricaoErro() {
        return descricaoErro;
    }

    public void setDescricaoErro(String descricaoErro) {
        this.descricaoErro = descricaoErro;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataReprocesso() {
        return dataReprocesso;
    }

    public void setDataReprocesso(LocalDateTime dataReprocesso) {
        this.dataReprocesso = dataReprocesso;
    }
}
