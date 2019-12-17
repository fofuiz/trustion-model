package br.com.accesstage.trustion.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name="t_controle_carga_api")
public class ControleCargaApi {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tControleCargaApiSeq")
    @SequenceGenerator(name = "tControleCargaApiSeq", sequenceName = "t_controle_carga_api_seq", allocationSize = 1)
    @Column(name="id_controle_carga_api")
    private Long idControleCargaApi;

    @Column(name="status_carga")
    private String statusCarga;

    @Column(name="status_processo")
    private String statusProcesso;


    @Column(name="data_inicio_carga")
    private LocalDateTime dataInicioCarga;

    @Column(name="data_fim_carga")
    private LocalDateTime dataFimCarga;

    @Column(name="data_inicio_processo")
    private LocalDateTime dataInicioProcesso;

    @Column(name="data_fim_processo")
    private LocalDateTime dataFimProcesso;

    public Long getIdControleCargaApi() {
        return idControleCargaApi;
    }

    public void setIdControleCargaApi(Long idControleCargaApi) {
        this.idControleCargaApi = idControleCargaApi;
    }

    public String getStatusCarga() {
        return statusCarga;
    }

    public void setStatusCarga(String statusCarga) {
        this.statusCarga = statusCarga;
    }

    public String getStatusProcesso() {
        return statusProcesso;
    }

    public void setStatusProcesso(String statusProcesso) {
        this.statusProcesso = statusProcesso;
    }

    public LocalDateTime getDataInicioCarga() {
        return dataInicioCarga;
    }

    public void setDataInicioCarga(LocalDateTime dataInicioCarga) {
        this.dataInicioCarga = dataInicioCarga;
    }

    public LocalDateTime getDataFimCarga() {
        return dataFimCarga;
    }

    public void setDataFimCarga(LocalDateTime dataFimCarga) {
        this.dataFimCarga = dataFimCarga;
    }

    public LocalDateTime getDataInicioProcesso() {
        return dataInicioProcesso;
    }

    public void setDataInicioProcesso(LocalDateTime dataInicioProcesso) {
        this.dataInicioProcesso = dataInicioProcesso;
    }

    public LocalDateTime getDataFimProcesso() {
        return dataFimProcesso;
    }

    public void setDataFimProcesso(LocalDateTime dataFimProcesso) {
        this.dataFimProcesso = dataFimProcesso;
    }
}
