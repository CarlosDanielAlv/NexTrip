package br.com.model;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Carlo
 */
public class VotoModel {
    
    
    @ManyToOne
    @JoinColumn(name = "PK_IMAGEM")
    private PaisModel paisModel;
    
    @Column(name = "qnt_votos")
    private int qnt_votos;

    public PaisModel getPaisModel() {
        return paisModel;
    }

    public void setPaisModel(PaisModel paisModel) {
        this.paisModel = paisModel;
    }

    public int getQnt_votos() {
        return qnt_votos;
    }

    public void setQnt_votos(int qnt_votos) {
        this.qnt_votos = qnt_votos;
    }
    
    
    
}
