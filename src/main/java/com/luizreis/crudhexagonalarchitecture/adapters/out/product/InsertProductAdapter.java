package com.luizreis.crudhexagonalarchitecture.adapters.out.product;

import com.luizreis.crudhexagonalarchitecture.adapters.out.repository.ProductRepository;
import com.luizreis.crudhexagonalarchitecture.adapters.out.repository.mapper.ProductEntityMapper;
import com.luizreis.crudhexagonalarchitecture.application.core.domain.Product;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.out.InsertProductOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertProductAdapter implements InsertProductOutputPort {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ProductEntityMapper productEntityMapper;
    @Override
    public void insert(Product product) {
        repository.save(productEntityMapper.toProductEntity(product));
    }
}
