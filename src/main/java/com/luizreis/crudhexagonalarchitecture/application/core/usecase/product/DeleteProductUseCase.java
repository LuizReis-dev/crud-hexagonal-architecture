package com.luizreis.crudhexagonalarchitecture.application.core.usecase.product;

import com.luizreis.crudhexagonalarchitecture.application.ports.product.in.DeleteProductInputPort;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.out.DeleteProductOutputPort;
import org.hibernate.sql.Delete;

public class DeleteProductUseCase  implements DeleteProductInputPort {

    private final DeleteProductOutputPort deleteProductOutputPort;

    public DeleteProductUseCase(DeleteProductOutputPort deleteProductOutputPort) {
        this.deleteProductOutputPort = deleteProductOutputPort;
    }
    @Override
    public void delete(Long id){
        deleteProductOutputPort.delete(id);
    }
}
