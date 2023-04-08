package com.paises.paises.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@IdClass(PaisBlocoEconomicoId.class)
@Table(name="pais_bloco_economico")

public class PaisBlocoEconomico {

    @Id
    //ManyToOne mapeia chaves estrangeiras nas tabelas dos bancos de dados
    @ManyToOne
    @JoinColumn(name="pais_id")
    private Pais pais;

    @Id
    @ManyToOne
    @JoinColumn(name="bloco_economico_id")
    private BlocoEconomico blocoEconomico; 

    public PaisBlocoEconomico(){}

    public PaisBlocoEconomico(Pais pais, BlocoEconomico blocoEconomico){
        this.pais = pais;
        this.blocoEconomico = blocoEconomico;
    }

    public Pais getPais(){
        return pais;
    }

    public void setPais(Pais pais){
        this.pais=pais;
    }

    public BlocoEconomico getBlocoEconomico(){
        return blocoEconomico;
    }

    public void setBlocoEconomico(BlocoEconomico blocoEconomico){
        this.blocoEconomico = blocoEconomico;
    }
    
    
}
