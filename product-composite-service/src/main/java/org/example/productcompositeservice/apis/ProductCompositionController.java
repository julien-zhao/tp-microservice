package org.example.productcompositeservice.apis;


import org.example.productcompositeservice.dtos.ProductAggregateDto;
import org.example.productcompositeservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/composition")

public class ProductCompositionController {
    @Autowired
    private ProductService productService;

    @GetMapping("/productDetails/{id}")
    public ResponseEntity<ProductAggregateDto> getProductDetails(@PathVariable("id") Long id){
        ProductAggregateDto productAggregateDto = productService.getProductAggregate(id);
        return ResponseEntity.ok(productAggregateDto);
    }
}
