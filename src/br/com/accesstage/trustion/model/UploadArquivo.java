package br.com.accesstage.trustion.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name = "t_upload_arquivo")
public class UploadArquivo implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tUploadArquivoSeq")
    @SequenceGenerator(name = "tUploadArquivoSeq", sequenceName = "t_upload_arquivo_seq", allocationSize = 1)
    @Column(name = "id_upload_arquivo")
    private Long idUploadArquivo;

    @Column(name = "id_atividade")
    private Long idAtividade;

    @Column(name = "nome_arquivo")
    private String nomeArquivo;

    @Column(name = "arquivo")
    private byte[] arquivo;

    public Long getIdUploadArquivo() {
        return idUploadArquivo;
    }

    public void setIdUploadArquivo(Long idUploadArquivo) {
        this.idUploadArquivo = idUploadArquivo;
    }

    public Long getIdAtividade() {
        return idAtividade;
    }

    public void setIdAtividade(Long idAtividade) {
        this.idAtividade = idAtividade;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public byte[] getArquivo() {
        return arquivo;
    }

    public void setArquivo(byte[] arquivo) {
        this.arquivo = arquivo;
    }
}
