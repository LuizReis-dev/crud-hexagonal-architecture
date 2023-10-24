package com.luizreis.crudhexagonalarchitecture.adapters.in.controller.response;

import com.luizreis.crudhexagonalarchitecture.application.core.domain.Product;

import java.time.Instant;

public class ProductResponse {
    private Long id;
    private String description;
    private Double value;
    private Instant createdAt;

    public ProductResponse(Long id, String description, Double value, Instant createdAt) {
        this.id = id;
        this.description = description;
        this.value = value;
        this.createdAt = createdAt;
    }
    public ProductResponse(Product product) {
        this.id = product.getId();
        this.description = product.getDescription();
        this.value = product.getValue();
        this.createdAt = product.getCreatedAt();
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Double getValue() {
        return value;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }
}
