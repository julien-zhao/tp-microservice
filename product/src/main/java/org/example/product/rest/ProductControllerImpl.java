package org.example.product.rest;

import org.example.product.dtos.ProductDto;
import org.example.product.services.ProductService;
import org.example.product.services.ServiceUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductControllerImpl{

    @Autowired
    private ProductService productService;
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductControllerImpl.class);
    private ServiceUtil serviceUtil;

    public ProductControllerImpl(ProductService productService, ServiceUtil serviceUtil) {
        this.productService = productService;
        this.serviceUtil = serviceUtil;
    }

    @GetMapping("/{productId}")
    public ProductDto getProduct(@PathVariable Long productId) {
        //LOGGER.info("find product, service address {}", serviceUtil.getServiceAddress());
        return productService.getProduct(productId);
    }


    @PostMapping
    public ProductDto createProduct(@RequestBody ProductDto productDto) {
        return productService.saveProduct(productDto);
    }
}
