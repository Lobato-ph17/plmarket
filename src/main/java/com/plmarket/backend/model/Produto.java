package com.plmarket.backend.model;

public class Produto {
    
    private Long id;
    private String nome;
    private String descricao;
    private Double preco;
    private String imagemUrl;

    public Produto() {
    }

    public Produto(Long id, String nome, String descricao, Double preco, String imagemUrl) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.imagemUrl = imagemUrl;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String description) { this.descricao = description; }

    public Double getPreco() { return preco; }
    public void setPreco(Double preco) { this.preco = preco; }

    public String getImagemUrl() { return imagemUrl; }
    public void setImagemUrl(String imagemUrl) { this.imagemUrl = imagemUrl; }
}