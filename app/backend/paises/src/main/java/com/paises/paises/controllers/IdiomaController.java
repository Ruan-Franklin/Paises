package com.paises.paises.controllers;
import com.paises.paises.entities.Idioma;
import com.paises.paises.repositories.IdiomaRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

@RestController //Indica que essa classe é um controlador do Spring
@RequestMapping("/idioma") //Mapeia todas as requisições que iniciam com "/idioma" para esta classe
public class IdiomaController {

    @Autowired //Injeção de dependência automática para o repositório Spring
    private IdiomaRepository idiomaRepository;

    @GetMapping("/{id}") //Mapeia requisições GET que possuem um ID no final da URL, para o método getIdiomaById()
    public ResponseEntity<Idioma> getIdiomaById(@PathVariable Long id){
        //Busca o idioma com o ID especificado no banco de dados
        Idioma idioma = idiomaRepository.findById(id).orElse(null);
        if(idioma == null){
            //Se não encontrar o idioma retorna um status de 404 Not Found
            return ResponseEntity.notFound().build();
        }
        //Se encontrar o Idioma, retorna um status 200 (ok)
        return ResponseEntity.ok(idioma);

    }

    
}
