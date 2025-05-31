package org.example.product.repository;

import org.example.product.dtos.ProductDto;
import org.example.product.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long>{
    //ProductDto findById(Long id);
}
