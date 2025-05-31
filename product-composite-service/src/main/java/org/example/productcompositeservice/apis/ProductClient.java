package org.example.productcompositeservice.apis;


import org.example.productcompositeservice.dtos.ProductDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product", url = "http://localhost:8081")
public interface ProductClient {

    @GetMapping("products/{productId}")
    ProductDto getProduct(@PathVariable("productId") Long productId);

}
