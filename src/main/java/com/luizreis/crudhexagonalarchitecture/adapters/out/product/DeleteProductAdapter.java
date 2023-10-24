package com.luizreis.crudhexagonalarchitecture.adapters.out.product;

import com.luizreis.crudhexagonalarchitecture.adapters.out.repository.ProductRepository;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.out.DeleteProductOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeleteProductAdapter implements DeleteProductOutputPort {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
