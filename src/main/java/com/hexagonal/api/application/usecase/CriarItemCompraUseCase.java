package com.hexagonal.api.application.usecase;

public class CriarItemCompraUseCase {

    private final ItemCompraRepositoryPort repository;

    public CriarItemCompraUseCase(ItemCompraRepositoryPort repository) {
        this.repository = repository;
    }

    public ItemCompra criar(String nome, Integer quantidade) {

    }
}
