package com.luizreis.crudhexagonalarchitecture.adapters.out.repository.mapper;

import com.luizreis.crudhexagonalarchitecture.adapters.out.repository.entity.ProductEntity;
import com.luizreis.crudhexagonalarchitecture.application.core.domain.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductEntityMapper {
    public ProductEntity toProductEntity(Product product){
        return new ProductEntity(product.getId(), product.getDescription(), product.getValue(), product.getCreatedAt());
    }

    public Product toProduct(ProductEntity entity){
        return new Product(entity.getId(), entity.getDescription(), entity.getValue(), entity.getCreatedAt());
    }
}
