package com.luizreis.crudhexagonalarchitecture.application.ports.product.in;

import com.luizreis.crudhexagonalarchitecture.application.core.domain.Product;

public interface FindProductByIdInputPort {
    Product findById(Long id);
}
