package br.com.accesstage.trustion.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "PacEntity")
@Table(name = "t_carga_pac", schema="sch_trustion")
public class Pac implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tPac")
    @SequenceGenerator(name = "tPac", sequenceName = "t_carga_pac_seq", allocationSize = 1)
    @Column(name = "id")
    private int id;

    @Column(name = "num_pack")
    private BigInteger numeroPack;

    @Column(name = "vlr_declarado")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private double vlrDeclarado;

    @Column(name = "vlr_conferido")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private double vlrConferido;

    @Column(name = "diferenca")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private double diferenca;

    @Column(name = "cedula_falsa")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private double cedulaFalsa;

    @Column(name = "numero")
    private int numero;

    @Column(name = "sigla")
    private String sigla;

    @Column(name = "data_coleta")
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", locale = "pt-BR", timezone = "Brazil/East")
    private Date dataColeta;

    @Column(name = "gtv")
    private int gtv;

    @Column(name = "vlr_declarado_gtv")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private double vlrDeclaradoGtv;

    @Column(name = "vlr_conferido_gtv")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private double vlrConferidoGtv;

    @Column(name = "diferenca_gtv")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private double diferencaGtv;

    @Column(name = "vlr_declarado_soma")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private double vlrDeclaradoSoma;

    @Column(name = "vlr_conferido_soma")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private double vlrConferidoSoma;

    @Column(name = "vlr_diferenca_soma")
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private double vlrDiferencaSoma;

    @Column(name = "pack_declarada")
    private int packDeclarada;

    @Column(name = "pack_processada")
    private int packProcessada;

}
