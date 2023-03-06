package com.paises.paises.entities;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity // Indica que essa classe é uma entidade mapeada em uma tabela do banco de dados
@Table(name="blocos_economicos")
public class BlocoEconomico {
    @Id //Indica que o atributo é a chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que o valor da chave primária será gerado automaticamente pelo banco de dados
    private Long id;
    private String nome;

    //Construtor padrão

    public BlocoEconomico(){}

    //Construtor com parâmetros

    public BlocoEconomico(String nome){
        this.nome=nome;
    }

    //Getters e setters

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id=id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    
}
