package com.hexagonal.api.adapter.in.web.mapper;

import com.hexagonal.api.adapter.in.web.dto.CriarItemCompraRequestDTO;
import com.hexagonal.api.adapter.in.web.dto.CriarItemCompraResponseDTO;
import com.hexagonal.api.application.usecase.input.CriarItemCompraInput;
import com.hexagonal.api.domain.model.ItemCompra;
import org.springframework.stereotype.Component;

@Component
public class ItemCompraMapper {

    public CriarItemCompraInput toCriarItemCompraInput(CriarItemCompraRequestDTO requestDTO) {
        return new CriarItemCompraInput(
                requestDTO.nome(),
                requestDTO.quantidade()
        );
    }

    public CriarItemCompraResponseDTO toCriarItemCompraResponseDTO(ItemCompra itemCompra) {
        return new CriarItemCompraResponseDTO(
                itemCompra.getId(),
                itemCompra.getNome(),
                itemCompra.getQuantidade()
        );
    }
}
