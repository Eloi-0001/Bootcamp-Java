package com.amazingmovie.bootcamp_java.controller;

import com.amazingmovie.bootcamp_java.entity.FilmeEntity;
import com.amazingmovie.bootcamp_java.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/filmes")  // URL base: http://localhost:8080/filmes
public class FilmeController {

    @Autowired
    private FilmeService filmeService;


    @PostMapping
    public ResponseEntity<FilmeEntity> criar(@RequestBody FilmeEntity filme) {
        FilmeEntity novoFilme = filmeService.adicionar(filme);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoFilme);
    }


    @GetMapping
    public ResponseEntity<List<FilmeEntity>> listarTodos() {
        List<FilmeEntity> filmes = filmeService.listarTodos();
        return ResponseEntity.ok(filmes);
    }


    @GetMapping("/{id}")
    public ResponseEntity<FilmeEntity> buscarPorId(@PathVariable Long id) {
        FilmeEntity filme = filmeService.buscarPorId(id);
        return ResponseEntity.ok(filme);
    }


    @PutMapping("/{id}")
    public ResponseEntity<FilmeEntity> atualizar(
            @PathVariable Long id,
            @RequestBody FilmeEntity filme) {
        FilmeEntity filmeAtualizado = filmeService.atualizar(id, filme);
        return ResponseEntity.ok(filmeAtualizado);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        filmeService.deletar(id);
        return ResponseEntity.noContent().build();  // HTTP 204 No Content
    }


    @GetMapping("/em-cartaz")
    public ResponseEntity<List<FilmeEntity>> listarEmCartaz() {
        List<FilmeEntity> filmes = filmeService.listarEmCartaz();
        return ResponseEntity.ok(filmes);
    }
}