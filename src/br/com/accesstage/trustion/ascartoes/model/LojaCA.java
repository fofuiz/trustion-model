package br.com.accesstage.trustion.ascartoes.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ADM_LOJA")
public class LojaCA implements Serializable {

    private static final long serialVersionUID = -5575147484908310004L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqLojaCA")
    @SequenceGenerator(name = "seqLojaCA", sequenceName = "ADM_LOJA_SEQ", allocationSize = 1)
    @Column(name = "COD_LOJA")
    private Long id;

    @Column(name = "EMPID")
    private Long idEmpresa;

    @Column(name = "NME_LOJA")
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
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
        LojaCA other = (LojaCA) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

    public void setIdEmpresa(Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Long getIdEmpresa() {
        return idEmpresa;
    }
}
