package com.nossaloja.model;

public record Product(
        Long id,
        String name,
        String description,
        Double price
) {
}