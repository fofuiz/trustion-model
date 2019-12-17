package br.com.accesstage.trustion.ascartoes.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ADM_OPERADORA")
public class OperadoraCA implements Serializable {

    private static final long serialVersionUID = 2431397298123452502L;

    @Id
    @GeneratedValue(generator = "seqOperadoraCA")
    @SequenceGenerator(name = "seqOperadoraCA", sequenceName = "ADM_OPERADORA_SEQ")
    @Column(name = "COD_OPERADORA")
    private Long id;

    @Column(name = "NME_OPERADORA")
    private String nmeOperadora;

    @Column(name = "NME_EXIBICAO_PORTAL")
    private String nmeExibicaoPortal;

    @Column(name = "NME_PATH_ARQUIVO")
    private String nmePathArquivo;

    @Column(name = "SGL_OPERADORA")
    private String sglOperadora;

    @Column(name = "IDT_OPERADORA")
    private String idtOperadora;

    @Column(name = "FLG_FILTRO_PORTAL")
    private boolean flgFiltroPortal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNmeOperadora() {
        return nmeOperadora;
    }

    public void setNmeOperadora(String nmeOperadora) {
        this.nmeOperadora = nmeOperadora;
    }

    public String getNmePathArquivo() {
        return nmePathArquivo;
    }

    public void setNmePathArquivo(String nmePathArquivo) {
        this.nmePathArquivo = nmePathArquivo;
    }

    public String getSglOperadora() {
        return sglOperadora;
    }

    public void setSglOperadora(String sglOperadora) {
        this.sglOperadora = sglOperadora;
    }

    public String getIdtOperadora() {
        return idtOperadora;
    }

    public void setIdtOperadora(String idtOperadora) {
        this.idtOperadora = idtOperadora;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((id == null) ? 0 : id.hashCode());
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
        OperadoraCA other = (OperadoraCA) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

    public boolean isFlgFiltroPortal() {
        return flgFiltroPortal;
    }

    public void setFlgFiltroPortal(boolean flgFiltroPortal) {
        this.flgFiltroPortal = flgFiltroPortal;
    }

    public void setNmeExibicaoPortal(String nmeExibicaoPortal) {
        this.nmeExibicaoPortal = nmeExibicaoPortal;
    }

    public String getNmeExibicaoPortal() {
        return nmeExibicaoPortal;
    }
}
