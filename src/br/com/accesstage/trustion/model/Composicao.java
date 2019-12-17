package br.com.accesstage.trustion.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "T_COMPOSICAO")
public class Composicao implements Serializable {

    public Composicao() {
    }

    public Composicao(ComposicaoBuilder composicaoBuilder) {
        this.numeroGVT = composicaoBuilder.numeroGVT;
        this.compartimento = composicaoBuilder.compartimento;
        this.selo = composicaoBuilder.selo;
        this.notas_001 = composicaoBuilder.notas_001;
        this.notas_002 = composicaoBuilder.notas_002;
        this.notas_005 = composicaoBuilder.notas_005;
        this.notas_010 = composicaoBuilder.notas_010;
        this.notas_020 = composicaoBuilder.notas_020;
        this.notas_050 = composicaoBuilder.notas_050;
        this.notas_100 = composicaoBuilder.notas_100;
        this.dataCriacao = composicaoBuilder.dataCriacao;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tcomposicaoSeq")
    @SequenceGenerator(name = "tcomposicaoSeq", sequenceName = "T_COMPOSICAO_SEQ", allocationSize = 1)
    @Column(name = "id_composicao")
    private Long idComposicao;

    @Column(name = "numero_gvt")
    private String numeroGVT;

    @Column(name = "compartimento")
    private String compartimento;

    @Column(name = "selo")
    private String selo;

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

    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    public Long getIdComposicao() {
        return idComposicao;
    }

    public void setIdComposicao(Long idComposicao) {
        this.idComposicao = idComposicao;
    }

    public String getNumeroGVT() {
        return numeroGVT;
    }

    public void setNumeroGVT(String numeroGVT) {
        this.numeroGVT = numeroGVT;
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

    public static class ComposicaoBuilder {

        private String numeroGVT;
        private String compartimento;
        private String selo;
        private Long notas_001;
        private Long notas_002;
        private Long notas_005;
        private Long notas_010;
        private Long notas_020;
        private Long notas_050;
        private Long notas_100;
        private LocalDateTime dataCriacao;

        public ComposicaoBuilder numeroGVT(String numeroGVT) {
            this.numeroGVT = numeroGVT;
            return this;
        }

        public ComposicaoBuilder compartimento(String compartimento) {
            this.compartimento = compartimento;
            return this;
        }

        public ComposicaoBuilder selo(String selo) {
            this.selo = selo;
            return this;
        }

        public ComposicaoBuilder notas(Long notas_001, Long notas_002, Long notas_005, Long notas_010, Long notas_020, Long notas_050, Long notas_100) {
            this.notas_001 = notas_001;
            this.notas_002 = notas_002;
            this.notas_005 = notas_005;
            this.notas_010 = notas_010;
            this.notas_020 = notas_020;
            this.notas_050 = notas_050;
            this.notas_100 = notas_100;
            return this;
        }

        public ComposicaoBuilder dataCriacao() {
            this.dataCriacao = LocalDateTime.now();
            return this;
        }

        public Composicao builder() {
            return new Composicao(this);
        }

    }

}
