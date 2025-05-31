package org.example.product.rest;

import org.example.product.dtos.ProductDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductController {
    ProductDto getProduct(@PathVariable Long productId);
}
