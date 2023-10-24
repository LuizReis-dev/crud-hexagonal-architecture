package com.luizreis.crudhexagonalarchitecture.application.ports.product.out;

import com.luizreis.crudhexagonalarchitecture.application.core.domain.Product;

public interface InsertProductOutputPort {

    void insert(Product product);
}
