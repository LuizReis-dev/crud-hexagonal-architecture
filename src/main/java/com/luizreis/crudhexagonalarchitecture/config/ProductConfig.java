package com.luizreis.crudhexagonalarchitecture.config;

import com.luizreis.crudhexagonalarchitecture.application.core.usecase.product.DeleteProductUseCase;
import com.luizreis.crudhexagonalarchitecture.application.core.usecase.product.FindProductByIdUseCase;
import com.luizreis.crudhexagonalarchitecture.application.core.usecase.product.InsertProductUseCase;
import com.luizreis.crudhexagonalarchitecture.application.core.usecase.product.UpdateProductUseCase;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.in.DeleteProductInputPort;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.in.FindProductByIdInputPort;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.in.InsertProductInputPort;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.in.UpdateProductInputPort;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.out.DeleteProductOutputPort;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.out.FindProductByIdOutputPort;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.out.InsertProductOutputPort;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.out.UpdateProductOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    @Bean
    public InsertProductInputPort insertProductInputPort(InsertProductOutputPort insertProductOutputPort){
        return new InsertProductUseCase(insertProductOutputPort);
    }

    @Bean
    public DeleteProductInputPort deleteProductInputPort(DeleteProductOutputPort deleteProductOutputPort){
        return new DeleteProductUseCase(deleteProductOutputPort);
    }

    @Bean
    public FindProductByIdInputPort findProductByIdInputPort(FindProductByIdOutputPort findProductByIdOutputPort){
        return new FindProductByIdUseCase(findProductByIdOutputPort);
    }

    @Bean
    public UpdateProductInputPort updateProductInputPort(UpdateProductOutputPort updateProductOutputPort){
        return new UpdateProductUseCase(updateProductOutputPort);
    }

}
