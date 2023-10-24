package com.luizreis.crudhexagonalarchitecture.adapters.out.repository;

import com.luizreis.crudhexagonalarchitecture.adapters.out.repository.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}
