package com.hexagonal.api.adapter.in.web.dto;

public record ItemCompraResponseDTO(
        Long id,
        String nome,
        Integer quantidade) {
}
