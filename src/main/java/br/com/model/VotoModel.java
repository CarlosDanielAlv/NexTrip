package br.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Carlos Daniel
 */

@Entity
@Table(name = "votos")
public class VotoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Incremento
    private int voto_id;
    
    @Column(name = "pais")
    private int pais;

    public int getVoto_id() {
        return voto_id;
    }

    public VotoModel(int pais) {
        this.pais = pais;
    }
    
    public void setVoto_id(int voto_id) {
        this.voto_id = voto_id;
    }

    public int getPais() {
        return pais;
    }

    public void setPais(int pais) {
        this.pais = pais;
    }    
}
