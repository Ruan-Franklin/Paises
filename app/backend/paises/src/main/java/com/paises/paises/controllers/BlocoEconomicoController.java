package com.paises.paises.controllers;
import com.paises.paises.entities.BlocoEconomico;
import com.paises.paises.repositories.BlocoEconomicoRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

@RestController //Indica que a classe é um controlador do spring
@RequestMapping("/bloco") //Mapeia todas as requisições que iniciam com "/bloco" para essa classe.
public class BlocoEconomicoController {
    //Injeção de dependência automática para o repositório Spring
    //Uma classe recebe as dependências necessárias para executar suas tarefas como parâmetros do construtor
    @Autowired
    private BlocoEconomicoRepository blocoEconomicoRepository;

    @GetMapping("/{id}") //Mapeia as requisições de get que possuem um ID no final da url
    public ResponseEntity<BlocoEconomico>getBlocoEconomicoById(@PathVariable Long id){
        //Busca o bloco econômico com o ID esecificado no banco de dados
        BlocoEconomico blocoeconomico = blocoEconomicoRepository.findById(id).orElse(null);
        if(blocoeconomico==null){
            //Se não encontrar um bloco econômico, retorna 404 (not found)
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(blocoeconomico);

    }

    @GetMapping //Mapeamento para listar todos os blocos econômicos
    public ResponseEntity<List<BlocoEconomico>> getAllBlocoEconomicos(){
        List<BlocoEconomico> blocoseconomicos = new ArrayList();
        //Busca todos os blocos econômicos no banco de dados
        blocoEconomicoRepository.findAll().forEach(i -> blocoseconomicos.add(i));
        //Se a lista estiver vazia, retorna um código 404 (not found)
        if(blocoseconomicos.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(blocoseconomicos);
    }

    @PostMapping  //Mapeia requisições de POST para a classe de BlocoEconomico
    public ResponseEntity<BlocoEconomico>createBlocoEconomico(@RequestBody BlocoEconomico blocoeconomico){
        //Salva o novo bloco economico no banco de dados
        BlocoEconomico novoBlocoEconomico = blocoEconomicoRepository.save(blocoeconomico);
        //Retorna um status 200 (ok) e o bloco economico criado
        return ResponseEntity.ok(novoBlocoEconomico);
    }
    
}
