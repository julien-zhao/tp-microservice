package org.example.productcompositeservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ProductAggregateDto {
    private ProductDto productDto;
    private List<ReviewDto> reviews;
    private List<RecommendationDto> recommendationDtos;
}
