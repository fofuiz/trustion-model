package br.com.accesstage.trustion.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "t_tipo_notificacao")
public class TipoNotificacao implements Serializable {

    @Id
    @Column(name = "id_tipo_notificacao")
    private Long idTipoNotificacao;

    @Column(name = "desc_notificacao")
    private String descNotificacao;

    public Long getIdTipoNotificacao() {
        return idTipoNotificacao;
    }

    public String getDescNotificacao() {
        return descNotificacao;
    }

    public void setIdTipoNotificacao(Long idTipoNotificacao) {
        this.idTipoNotificacao = idTipoNotificacao;
    }

    public void setDescNotificacao(String descNotificacao) {
        this.descNotificacao = descNotificacao;
    }

}
