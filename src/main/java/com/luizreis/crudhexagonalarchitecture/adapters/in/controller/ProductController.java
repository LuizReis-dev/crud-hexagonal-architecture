package com.luizreis.crudhexagonalarchitecture.adapters.in.controller;

import com.luizreis.crudhexagonalarchitecture.adapters.in.controller.request.ProductRequest;
import com.luizreis.crudhexagonalarchitecture.adapters.in.controller.response.ProductResponse;
import com.luizreis.crudhexagonalarchitecture.application.core.domain.Product;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.in.DeleteProductInputPort;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.in.FindProductByIdInputPort;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.in.InsertProductInputPort;
import com.luizreis.crudhexagonalarchitecture.application.ports.product.in.UpdateProductInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;

@RestController
@RequestMapping(value = "/api/product")
public class ProductController {

    @Autowired
    private InsertProductInputPort insertProductInputPort;

    @Autowired
    private DeleteProductInputPort deleteProductInputPort;

    @Autowired
    private FindProductByIdInputPort findProductByIdInputPort;

    @Autowired
    private UpdateProductInputPort updateProductInputPort;

    @PostMapping
    public ResponseEntity<Void> insert(@RequestBody ProductRequest productRequest){
        Product product = new Product();
        product.setDescription(productRequest.getDescription());
        product.setValue(productRequest.getValue());
        product.setCreatedAt(Instant.now());
        insertProductInputPort.insert(product);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        deleteProductInputPort.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProductResponse> findById(@PathVariable Long id){
        Product product = findProductByIdInputPort.findById(id);
        ProductResponse response = new ProductResponse(product);
        return ResponseEntity.ok(response);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<ProductResponse> update(@PathVariable Long id, @RequestBody ProductRequest productRequest){
        Product product = new Product();
        product.setValue(productRequest.getValue());
        product.setDescription(productRequest.getDescription());

        product = updateProductInputPort.update(product, id);

        return ResponseEntity.ok(new ProductResponse(product));
    }
}
