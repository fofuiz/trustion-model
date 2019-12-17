package br.com.accesstage.trustion.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author elaine.querido
 */
@Entity
@Table(name = "t_tipo_categoria")
public class TipoCategoria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tTipoCategoriaSeq")
    @SequenceGenerator(name = "tTipoCategoriaSeq", sequenceName = "t_tipo_categoria_seq", allocationSize = 1)
    @Column(name = "id_tipo_categoria")
    private Integer idTipoCategoria;

    @Column(name = "descricao")
    private String descricao;

    public TipoCategoria() {
    }

    public TipoCategoria(Integer idTipoCategoria) {
        this.idTipoCategoria = idTipoCategoria;
    }

    public TipoCategoria(Integer idTipoCategoria, String descricao) {
        this.idTipoCategoria = idTipoCategoria;
        this.descricao = descricao;
    }

    public Integer getIdTipoCategoria() {
        return idTipoCategoria;
    }

    public void setIdTipoCategoria(Integer idTipoCategoria) {
        this.idTipoCategoria = idTipoCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoCategoria != null ? idTipoCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoCategoria)) {
            return false;
        }
        TipoCategoria other = (TipoCategoria) object;
        if ((this.idTipoCategoria == null && other.idTipoCategoria != null) || (this.idTipoCategoria != null && !this.idTipoCategoria.equals(other.idTipoCategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.accesstage.trustion.model.TipoCategoria[ idTipoCategoria=" + idTipoCategoria + " ]";
    }

}
