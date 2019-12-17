package br.com.accesstage.trustion.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "ConciliacaoVendasPacEntity")
@Table(name = "t_conci_vendas_pac", schema="sch_trustion")
public class ConciliacaoVendasPac {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tConciliacaoVendasPac")
    @SequenceGenerator(name = "tConciliacaoVendasPac", sequenceName = "t_concil_vendas_pac_seq", allocationSize = 1)
    @Column(name = "id")
    private int id;

    @Column(name = "data_conciliacao")
    private LocalDate dataConciliacao;

    @Column(name = "data_inicio_conciliacao")
    private LocalDate dataInicioConciliacao;

    @Column(name = "data_fim_conciliacao")
    private LocalDate dataFimConciliacao;

    @Column(name = "conciliado_com_sucesso")
    private boolean conciliadoComSucesso;

    @Column(name = "id_loja")
    private int idLoja;

    @Column(name = "numero_gtv")
    private Long numeroGtv;

    @Column(name = "somatoria_vendas")
    private double somatoriaVendas;

    @Column(name = "soma_pac_vlr_declarado")
    private double pacVlrDeclarado;

    @Column(name = "diferenca")
    private double diferenca;

    @Column(name = "sigla_loja")
    private String siglaLoja;

    @Column(name = "data_gtv")
    private LocalDate datagtv;

    @Column(name = "qtd_col_semana")
    private int qtdColSemana;

    @Column(name = "razao_social")
    private String razaoSocial;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "soma_pac_vlr_conferido")
    private double pacVlrConferido;

}
