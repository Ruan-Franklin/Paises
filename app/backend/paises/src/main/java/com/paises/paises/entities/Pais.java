package com.paises.paises.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String moedaLocal;

    private String presidente;

    private String sistemaGoverno;

    private Long populacao;

    private String capital;

    public Pais() {}

    public Pais(String nome, String moedaLocal, String presidente, String sistemaGoverno, Long populacao, String capital) {
        this.nome = nome;
        this.moedaLocal = moedaLocal;
        this.presidente = presidente;
        this.sistemaGoverno = sistemaGoverno;
        this.populacao = populacao;
        this.capital = capital;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMoedaLocal() {
        return moedaLocal;
    }

    public void setMoedaLocal(String moedaLocal) {
        this.moedaLocal = moedaLocal;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getSistemaGoverno() {
        return sistemaGoverno;
    }

    public void setSistemaGoverno(String sistemaGoverno) {
        this.sistemaGoverno = sistemaGoverno;
    }

    public Long getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Long populacao) {
        this.populacao = populacao;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Pais [id=" + id + ", nome=" + nome + ", moedaLocal=" + moedaLocal + ", presidente=" + presidente
                + ", sistemaGoverno=" + sistemaGoverno + ", populacao=" + populacao + ", capital=" + capital + "]";
    }
}

