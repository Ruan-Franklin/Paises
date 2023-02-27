package com.paises.paises.controllers;

import com.paises.paises.entities.Pais;
import com.paises.paises.repositories.PaisRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // Indica que esta classe é um controlador do Spring
@RequestMapping("/pais") // Mapeia todas as requisições que iniciam com "/pais" para esta classe
public class PaisController {

    @Autowired // Injeção de dependência automática do Spring para o repositório de Países
    private PaisRepository paisRepository;

    @GetMapping("/{id}") // Mapeia requisições GET que possuem um ID no final da URL para o método getPaisById()
    public ResponseEntity<Pais> getPaisById(@PathVariable Long id) {
        // Busca o país com o ID especificado no banco de dados
        Pais pais = paisRepository.findById(id).orElse(null);
        if (pais == null) {
            // Se não encontrar o país, retorna um status HTTP 404 (Not Found)
            return ResponseEntity.notFound().build();
        }
        // Se encontrar o país, retorna um status HTTP 200 (OK) e o país encontrado
        return ResponseEntity.ok(pais);
    }

    @PostMapping // Mapeia requisições POST para o método createPais()
    public ResponseEntity<Pais> createPais(@RequestBody Pais pais) {
        // Salva o novo país no banco de dados
        Pais novoPais = paisRepository.save(pais);
        // Retorna um status HTTP 200 (OK) e o país criado
        return ResponseEntity.ok(novoPais);
    }
    @PutMapping("/{id}") // Mapeia requisições PUT que possuem um ID no final da URL para o método atualizarPais()
public ResponseEntity<Pais> atualizarPais(@PathVariable Long id, @RequestBody Pais paisAtualizado) {
    Optional<Pais> paisExistenteOptional = paisRepository.findById(id);
    if (paisExistenteOptional.isPresent()) {
        Pais paisExistente = paisExistenteOptional.get();
        paisExistente.setNome(paisAtualizado.getNome());
        paisExistente.setMoedaLocal(paisAtualizado.getMoedaLocal());
        paisExistente.setPresidente(paisAtualizado.getPresidente());
        paisExistente.setSistemaGoverno(paisAtualizado.getSistemaGoverno());
        paisExistente.setPopulacao(paisAtualizado.getPopulacao());
        paisExistente.setCapital(paisAtualizado.getCapital());
        Pais paisAtualizadoSalvo = paisRepository.save(paisExistente);
        return ResponseEntity.ok(paisAtualizadoSalvo);
    } else {
        return ResponseEntity.notFound().build();
    }
}
@GetMapping
public ResponseEntity<List<Pais>> getAllPaises() {
    List<Pais> paises = new ArrayList<>();
    //Busca todos os países no banco de dados
    paisRepository.findAll().forEach(p -> paises.add(p));
    //Se a lista de países estiver vazia, retorna um código 404 (not found)
    if (paises.isEmpty()) {
        return ResponseEntity.notFound().build();
        }
    return ResponseEntity.ok(paises);


    }


}
