package com.amazingmovie.bootcamp_java.service;

import com.amazingmovie.bootcamp_java.entity.FilmeEntity;
import com.amazingmovie.bootcamp_java.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;


    public FilmeEntity adicionar(FilmeEntity filme) {

        if (filmeRepository.existsByTituloAndDiretor(filme.getTitulo(), filme.getDiretor())) {
            throw new RuntimeException("Filme já cadastrado!");
        }
        return filmeRepository.save(filme);
    }


    public List<FilmeEntity> listarTodos() {
        return filmeRepository.findAll();
    }


    public FilmeEntity buscarPorId(Long id) {
        Optional<FilmeEntity> filme = filmeRepository.findById(id);
        if (filme.isPresent()) {
            return filme.get();
        } else {
            throw new RuntimeException("Filme não encontrado com ID: " + id);
        }
    }


    public FilmeEntity atualizar(Long id, FilmeEntity filmeAtualizado) {

        if (!filmeRepository.existsById(id)) {
            throw new RuntimeException("Filme não encontrado!");
        }


        filmeAtualizado.setId(id);


        return filmeRepository.save(filmeAtualizado);
    }


    public void deletar(Long id) {
        if (!filmeRepository.existsById(id)) {
            throw new RuntimeException("Filme não encontrado!");
        }
        filmeRepository.deleteById(id);
    }


    public List<FilmeEntity> listarEmCartaz() {
        return filmeRepository.findByEmCartazTrue();
    }
}