package br.com.accesstage.trustion.ascartoes.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADM_AGRUPADOR")
public class AgrupadorCA implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "COD_AGRUPADOR")
    private Long id;

    @Column(name = "DSC_AGRUPADOR")
    private String nomeAgrupador;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeAgrupador() {
        return nomeAgrupador;
    }

    public void setNomeAgrupador(String nomeAgrupador) {
        this.nomeAgrupador = nomeAgrupador;
    }
}
