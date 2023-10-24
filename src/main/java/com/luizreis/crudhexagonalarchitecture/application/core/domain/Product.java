package com.luizreis.crudhexagonalarchitecture.application.core.domain;

import java.time.Instant;

public class Product {

    private Long id;
    private String description;
    private Double value;
    private Instant createdAt;

    public Product() {
    }

    public Product(Long id, String description, Double value, Instant createdAt) {
        this.id = id;
        this.description = description;
        this.value = value;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
