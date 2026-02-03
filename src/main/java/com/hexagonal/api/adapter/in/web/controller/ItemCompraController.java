package com.hexagonal.api.adapter.in.web.controller;

import com.hexagonal.api.adapter.in.web.dto.ItemCompraResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/item-compra")
public class ItemCompraController {

    private final CriarItemCompraUseCase useCase;

    public ItemCompraController(CriarItemCompraUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping(value = "/criar-item-compra")
    public ResponseEntity<ItemCompraResponseDTO> criarItemCompra() {
        try {
            // Implementar....
            return ResponseEntity.ok(null);
        } catch (Exception e) {
            return ResponseEntity.internalServerError().body(null);
        }
    }
}
