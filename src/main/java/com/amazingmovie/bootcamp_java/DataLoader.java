package com.amazingmovie.bootcamp_java;

import com.amazingmovie.bootcamp_java.entity.FilmeEntity;
import com.amazingmovie.bootcamp_java.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private FilmeRepository filmeRepository;

    @Override
    public void run(String... args) throws Exception {

        FilmeEntity filme = new FilmeEntity(
                "Avengers End Game",
                "Anthony Russo e Joe Russo",
                2019,
                "Ação",
                181.0,  // 181 minutos
                "12",
                30.0,
                false
        );

        filmeRepository.save(filme);
        System.out.println("✅ Filme inicial adicionado ao banco!");
    }
}