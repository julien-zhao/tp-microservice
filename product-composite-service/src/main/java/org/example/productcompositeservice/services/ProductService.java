package org.example.productcompositeservice.services;

import org.example.productcompositeservice.apis.ProductClient;
import org.example.productcompositeservice.apis.RecommendationClient;
import org.example.productcompositeservice.apis.ReviewsClient;
import org.example.productcompositeservice.dtos.ProductAggregateDto;
import org.example.productcompositeservice.dtos.ProductDto;
import org.example.productcompositeservice.dtos.RecommendationDto;
import org.example.productcompositeservice.dtos.ReviewDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductClient productClient;
    @Autowired
    private ReviewsClient reviewsClient;
    @Autowired
    private RecommendationClient recommendationClient;

    public ProductAggregateDto getProductAggregate(Long productId){
        ProductDto productDto = productClient.getProduct(productId);
        List<ReviewDto> reviews = reviewsClient.getReview(productId);
        List<RecommendationDto> recommendations = recommendationClient.getByProductId(productId);
        return new ProductAggregateDto(productDto, reviews, recommendations);
    }
}
