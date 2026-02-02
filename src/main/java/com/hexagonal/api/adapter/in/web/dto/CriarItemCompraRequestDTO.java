package com.hexagonal.api.adapter.in.web.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public record CriarItemCompraRequestDTO(
        @NotBlank String nome,
        @Min(1) Integer quantidade) {
}
