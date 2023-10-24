package com.luizreis.crudhexagonalarchitecture.application.core.usecase.product;

import com.luizreis.crudhexagonalarchitecture.application.core.domain.Product;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.in.FindProductByIdInputPort;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.out.FindProductByIdOutputPort;

import java.util.List;

public class FindProductByIdUseCase implements FindProductByIdInputPort {

    private final FindProductByIdOutputPort findProductByIdOutputPort;

    public FindProductByIdUseCase(FindProductByIdOutputPort findProductByIdOutputPort) {
        this.findProductByIdOutputPort = findProductByIdOutputPort;
    }

    @Override
    public Product findById(Long id){
        return findProductByIdOutputPort.findById(id);
    }
}
