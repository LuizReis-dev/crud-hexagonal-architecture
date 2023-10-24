package com.luizreis.crudhexagonalarchitecture.application.ports.product.in;

import com.luizreis.crudhexagonalarchitecture.application.core.domain.Product;

public interface UpdateProductInputPort {
    Product update(Product product, Long id);
}
