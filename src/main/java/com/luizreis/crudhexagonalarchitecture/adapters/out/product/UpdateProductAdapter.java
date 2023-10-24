package com.luizreis.crudhexagonalarchitecture.adapters.out.product;

import com.luizreis.crudhexagonalarchitecture.adapters.out.repository.ProductRepository;
import com.luizreis.crudhexagonalarchitecture.adapters.out.repository.entity.ProductEntity;
import com.luizreis.crudhexagonalarchitecture.adapters.out.repository.mapper.ProductEntityMapper;
import com.luizreis.crudhexagonalarchitecture.application.core.domain.Product;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.out.UpdateProductOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateProductAdapter implements UpdateProductOutputPort {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ProductEntityMapper productEntityMapper;

    @Override
    public Product update(Product product, Long id) {
        ProductEntity entity = repository.getReferenceById(id);
        entity.setValue(product.getValue());
        entity.setDescription(product.getDescription());

        ProductEntity savedEntity = repository.save(entity);
        return productEntityMapper.toProduct(savedEntity);
    }
}
