package com.hexagonal.api.application.usecase;

import com.hexagonal.api.application.usecase.input.CriarItemCompraInput;
import com.hexagonal.api.domain.model.ItemCompra;
import com.hexagonal.api.domain.port.out.ItemCompraRepositoryPort;

public class CriarItemCompraUseCase {

    private final ItemCompraRepositoryPort repository;

    public CriarItemCompraUseCase(ItemCompraRepositoryPort repository) {
        this.repository = repository;
    }

    public ItemCompra criar(CriarItemCompraInput input) {

        ItemCompra itemCompra = new ItemCompra(
                null,
                input.nome(),
                input.quantidade(),
                false
        );

        return repository.salvar(itemCompra);
    }
}
