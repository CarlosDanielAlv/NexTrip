package br.com.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Carlos Daniel
 */
public class ImagemModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increment
    private int id_imagem;
    
    @Column(name = "DESCRICAO")
    private String descricao_imagem;
    
    @Column(name = "NOME_IMG")
    private String nome_imagem;
    
    @Column(name = "TAMANHO_IMG")
    private String tamanho_imagem;
    
    @Column(name = "TIPO_IMG")
    private String tipo_imagem;
    
    @Column(name = "IMAGEM")
    private String imagem;
    

    public int getId_imagem() {
        return id_imagem;
    }

    public void setId_imagem(int id_imagem) {
        this.id_imagem = id_imagem;
    }

    public String getDescricao_imagem() {
        return descricao_imagem;
    }

    public void setDescricao_imagem(String descricao_imagem) {
        this.descricao_imagem = descricao_imagem;
    }

    public String getNome_imagem() {
        return nome_imagem;
    }

    public void setNome_imagem(String nome_imagem) {
        this.nome_imagem = nome_imagem;
    }

    public String getTamanho_imagem() {
        return tamanho_imagem;
    }

    public void setTamanho_imagem(String tamanho_imagem) {
        this.tamanho_imagem = tamanho_imagem;
    }

    public String getTipo_imagem() {
        return tipo_imagem;
    }

    public void setTipo_imagem(String tipo_imagem) {
        this.tipo_imagem = tipo_imagem;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem_imagem) {
        this.imagem = imagem_imagem;
    }
    
    
    
    
}
