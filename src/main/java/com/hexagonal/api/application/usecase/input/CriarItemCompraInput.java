package com.hexagonal.api.application.usecase.input;

public record CriarItemCompraInput(
        String nome,
        Integer quantidade) {
}
