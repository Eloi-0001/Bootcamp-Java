package com.amazingmovie.bootcamp_java.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "filmes")  // Nome da tabela
public class FilmeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String diretor;
    private Integer anoPublicacao;
    private String genero;
    private Double duracao;
    private String classificacao;
    private Double preco;
    private Boolean emCartaz;


    private LocalDateTime dataCadastro;


    public FilmeEntity() {}


    public FilmeEntity(String titulo, String diretor, Integer anoPublicacao,
                       String genero, Double duracao, String classificacao,
                       Double preco, Boolean emCartaz) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoPublicacao = anoPublicacao;
        this.genero = genero;
        this.duracao = duracao;
        this.classificacao = classificacao;
        this.preco = preco;
        this.emCartaz = emCartaz;
        this.dataCadastro = LocalDateTime.now();
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDiretor() { return diretor; }
    public void setDiretor(String diretor) { this.diretor = diretor; }

    public Integer getAnoPublicacao() { return anoPublicacao; }
    public void setAnoPublicacao(Integer anoPublicacao) { this.anoPublicacao = anoPublicacao; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public Double getDuracao() { return duracao; }
    public void setDuracao(Double duracao) { this.duracao = duracao; }

    public String getClassificacao() { return classificacao; }
    public void setClassificacao(String classificacao) { this.classificacao = classificacao; }

    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }

    public Boolean getEmCartaz() { return emCartaz; }
    public void setEmCartaz(Boolean emCartaz) { this.emCartaz = emCartaz; }

    public LocalDateTime getDataCadastro() { return dataCadastro; }
    public void setDataCadastro(LocalDateTime dataCadastro) { this.dataCadastro = dataCadastro; }
}