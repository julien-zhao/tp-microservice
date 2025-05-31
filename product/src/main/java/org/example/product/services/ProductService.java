package org.example.product.services;

import org.example.product.dtos.ProductDto;

public interface ProductService {
    ProductDto getProduct(Long productId);

    ProductDto saveProduct(ProductDto productDto);
}
