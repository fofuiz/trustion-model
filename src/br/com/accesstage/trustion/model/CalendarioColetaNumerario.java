package br.com.accesstage.trustion.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "CalendarioColetaNumerarioEntity")
@Table(name = "t_calend_col_numerario", schema="sch_trustion")
public class CalendarioColetaNumerario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tCalendColNumerario")
    @SequenceGenerator(name = "tCalendColNumerario", sequenceName = "t_calend_col_numerario_seq", allocationSize = 1)
    @Column(name = "id")
    private int id;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "monday")
    private boolean monday;

    @Column(name = "tuesday")
    private boolean tuesday;

    @Column(name = "wednesday")
    private boolean wednesday;

    @Column(name = "thursday")
    private boolean thursday;

    @Column(name = "friday")
    private boolean friday;

    @Column(name = "saturday")
    private boolean saturday;

    @Column(name = "sunday")
    private boolean sunday;

    @Column(name = "ult_dia_conciliado")
    private LocalDate ultDiaConciliado;

    @Column(name = "qtd_coleta_semana")
    private int qtdColetaSemana;

    @Column(name = "id_loja")
    private int idloja;


}

