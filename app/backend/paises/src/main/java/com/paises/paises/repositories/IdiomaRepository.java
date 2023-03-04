package com.paises.paises.repositories;
import com.paises.paises.entities.Idioma;
import org.springframework.data.jpa.repository.JpaRepository;

//JpaRepository fornece a implementação padrão para as operações CRUD de emtidades
//Além disso, define o tipo da entidade (idioma) e o tipo de identificador (Long)
//Por conta disso, não é necessário definir nenhuma outra implementação desse repositório
public interface IdiomaRepository extends JpaRepository <Idioma, Long>{

}
