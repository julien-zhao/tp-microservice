package org.example.productcompositeservice.apis;

import org.example.productcompositeservice.dtos.ReviewDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "Review", url = "http://localhost:8082")
public interface ReviewsClient {
    @GetMapping("/reviews/products/{productId}")
    List<ReviewDto> getReview(@PathVariable("productId") Long productId);
}
