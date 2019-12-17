package br.com.accesstage.trustion.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "t_empresa_segmento")
public class EmpresaSegmento implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tEmpresaSegmentoSeq")
    @SequenceGenerator(name = "tEmpresaSegmentoSeq", sequenceName = "t_empresa_segmento_seq", allocationSize = 1)
    @Column(name = "id_empresa_segmento")
    private Long idEmpresaSegmento;

    @Column(name = "descricao")
    private String descricao;

    public EmpresaSegmento() {
        super();
    }

    public Long getIdEmpresaSegmento() {
        return idEmpresaSegmento;
    }

    public void setIdEmpresaSegmento(Long idEmpresaSegmento) {
        this.idEmpresaSegmento = idEmpresaSegmento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
