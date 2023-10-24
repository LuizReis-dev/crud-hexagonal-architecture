package com.luizreis.crudhexagonalarchitecture.application.core.usecase.product;

import com.luizreis.crudhexagonalarchitecture.application.core.domain.Product;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.in.InsertProductInputPort;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.out.InsertProductOutputPort;

public class InsertProductUseCase implements InsertProductInputPort {

    private final InsertProductOutputPort insertProductOutputPort;

    public InsertProductUseCase(InsertProductOutputPort insertProductOutputPort) {
        this.insertProductOutputPort = insertProductOutputPort;
    }
    @Override
    public void insert(Product product){
        insertProductOutputPort.insert(product);
    }
}
