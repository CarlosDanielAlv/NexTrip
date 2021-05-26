package br.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Carlos Daniel
 */

@Entity
@Table(name = "Paises")
public class PaisModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Incremento
    private int id_pais;
    
    @Column(name = "NOME")
    private String nome_pais;
    
    @Column(name = "LOCAL_PAIS")
    private String local_pais;
    
    @Column(name = "MOEDA")
    private String moeda_pais;
    
    @Column(name = "POPULACAO")
    private String populacao_pais;
    
    @Column(name = "FUSO_HORARIO")
    private String fusoHorario_pais;
    
    @Column(name = "PASSAPORTE")
    private boolean passaporte_pais;
    
    @Column(name = "VISTO")
    private boolean visto_pais;
    
    @ManyToOne
    @JoinColumn(name = "FK_IMAGEM")
    private ImagemModel imagemModel;

    
    public int getId_pais() {
        return id_pais;
    }

    public void setId_pais(int id_pais) {
        this.id_pais = id_pais;
    }

    public String getNome_pais() {
        return nome_pais;
    }

    public void setNome_pais(String nome_pais) {
        this.nome_pais = nome_pais;
    }

    public String getLocal_pais() {
        return local_pais;
    }

    public void setLocal_pais(String local_pais) {
        this.local_pais = local_pais;
    }

    public String getMoeda_pais() {
        return moeda_pais;
    }

    public void setMoeda_pais(String moeda_pais) {
        this.moeda_pais = moeda_pais;
    }

    public String getPopulacao_pais() {
        return populacao_pais;
    }

    public void setPopulacao_pais(String populacao_pais) {
        this.populacao_pais = populacao_pais;
    }

    public String getFusoHorario_pais() {
        return fusoHorario_pais;
    }

    public void setFusoHorario_pais(String fusoHorario_pais) {
        this.fusoHorario_pais = fusoHorario_pais;
    }

    public boolean isPassaporte_pais() {
        return passaporte_pais;
    }

    public void setPassaporte_pais(boolean passaporte_pais) {
        this.passaporte_pais = passaporte_pais;
    }

    public boolean isVisto_pais() {
        return visto_pais;
    }

    public void setVisto_pais(boolean visto_pais) {
        this.visto_pais = visto_pais;
    }
    
    
    
}
