package com.luizreis.crudhexagonalarchitecture.adapters.in.controller.request;

import java.time.Instant;


public class ProductRequest {
    private String description;
    private Double value;
    private Instant createdAt;

    public ProductRequest(String description, Double value, Instant createdAt) {
        this.description = description;
        this.value = value;
        this.createdAt = createdAt;
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
