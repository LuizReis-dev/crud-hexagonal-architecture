package com.luizreis.crudhexagonalarchitecture.application.core.usecase.product;

import com.luizreis.crudhexagonalarchitecture.application.core.domain.Product;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.in.UpdateProductInputPort;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.out.UpdateProductOutputPort;

public class UpdateProductUseCase implements UpdateProductInputPort {

    private final UpdateProductOutputPort updateProductOutputPort;

    public UpdateProductUseCase(UpdateProductOutputPort updateProductOutputPort) {
        this.updateProductOutputPort = updateProductOutputPort;
    }

    @Override
    public Product update(Product product, Long id){
        return updateProductOutputPort.update(product, id);
    }
}
