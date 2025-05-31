package org.example.productcompositeservice.dtos;

import lombok.Data;

@Data
public class ProductDto {
    private Long productId;
    private String name;
    private int weight;
    private String serviceAddress;
}
