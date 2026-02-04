package com.hexagonal.api.adapter.in.web.dto;

public record CriarItemCompraResponseDTO(
        Long id,
        String nome,
        Integer quantidade) {
}
