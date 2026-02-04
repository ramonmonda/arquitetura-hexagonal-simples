package com.hexagonal.api.domain.model;

public class ItemCompra {

    private Long id;
    private String nome;
    private Integer quantidade;
    private Boolean comprado;

    public ItemCompra() { }

    public ItemCompra(Long id, String nome, Integer quantidade, Boolean comprado) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.comprado = comprado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Boolean getComprado() {
        return comprado;
    }

    public void setComprado(Boolean comprado) {
        this.comprado = comprado;
    }
}
