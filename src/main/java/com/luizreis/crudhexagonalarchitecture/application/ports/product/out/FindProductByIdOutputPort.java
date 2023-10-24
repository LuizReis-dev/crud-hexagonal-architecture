package com.luizreis.crudhexagonalarchitecture.application.ports.product.out;

import com.luizreis.crudhexagonalarchitecture.application.core.domain.Product;

public interface FindProductByIdOutputPort {
    Product findById(Long id);
}
