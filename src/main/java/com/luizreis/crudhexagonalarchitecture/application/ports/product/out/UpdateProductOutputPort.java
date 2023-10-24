package com.luizreis.crudhexagonalarchitecture.application.ports.product.out;

import com.luizreis.crudhexagonalarchitecture.application.core.domain.Product;

public interface UpdateProductOutputPort {
    Product update(Product product, Long id);
}
