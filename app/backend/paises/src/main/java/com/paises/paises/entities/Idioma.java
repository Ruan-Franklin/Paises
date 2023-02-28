package com.paises.paises.entities;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // Indica que essa classe é uma entidade mapeada em uma tabela do banco de dados
public class Idioma {

    @Id // Indica que o atributo abaixo é a chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que o valor da chave primária será gerado automaticamente pelo banco de dados
    private Long id;

    private String nome; // Nome do idioma

    private String sigla; // Sigla do idioma

    // Construtor padrão
    public Idioma() {
    }

    // Construtor com parâmetros
    public Idioma(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }

    // Getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Idioma [id=" + id + ", nome=" + nome + ", sigla=" + sigla + "]";
    }
}
