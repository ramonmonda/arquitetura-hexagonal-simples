package com.hexagonal.api.domain.port.out;

import com.hexagonal.api.domain.model.ItemCompra;

public interface ItemCompraRepositoryPort {

    ItemCompra salvar(ItemCompra itemCompra);
}
