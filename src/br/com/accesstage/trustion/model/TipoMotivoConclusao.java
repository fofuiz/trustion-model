package br.com.accesstage.trustion.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "t_motivo_conclusao")
public class TipoMotivoConclusao implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tMotivoConclusaoSeq")
    @SequenceGenerator(name = "tMotivoConclusaoSeq", sequenceName = "t_motivo_conclusao_seq", allocationSize = 1)
    @Column(name = "id_motivo")
    private Long idMotivo;

    @Column(name = "descricao")
    private String descricao;

    public TipoMotivoConclusao() {
        super();
    }

    public Long getIdMotivo() {
        return idMotivo;
    }

    public void setIdMotivo(Long idMotivo) {
        this.idMotivo = idMotivo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
