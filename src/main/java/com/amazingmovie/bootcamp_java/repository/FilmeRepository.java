package com.amazingmovie.bootcamp_java.repository;

import com.amazingmovie.bootcamp_java.entity.FilmeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FilmeRepository extends JpaRepository<FilmeEntity, Long> {

    List<FilmeEntity> findByEmCartazTrue();
    List<FilmeEntity> findByGeneroIgnoreCase(String genero);
    boolean existsByTituloAndDiretor(String titulo, String diretor);
}