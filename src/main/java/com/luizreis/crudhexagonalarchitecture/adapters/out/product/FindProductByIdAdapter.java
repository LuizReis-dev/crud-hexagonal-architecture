package com.luizreis.crudhexagonalarchitecture.adapters.out.product;

import com.luizreis.crudhexagonalarchitecture.adapters.out.repository.ProductRepository;
import com.luizreis.crudhexagonalarchitecture.adapters.out.repository.entity.ProductEntity;
import com.luizreis.crudhexagonalarchitecture.adapters.out.repository.mapper.ProductEntityMapper;
import com.luizreis.crudhexagonalarchitecture.application.core.domain.Product;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.out.FindProductByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindProductByIdAdapter implements FindProductByIdOutputPort {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ProductEntityMapper productEntityMapper;

    @Override
    public Product findById(Long id) {
        ProductEntity entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found!"));

        return productEntityMapper.toProduct(entity);
    }
}
