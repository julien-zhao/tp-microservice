package org.example.productcompositeservice.apis;

import org.example.productcompositeservice.dtos.RecommendationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name = "recommendation", url = "http://localhost:8083")
public interface RecommendationClient {

    @GetMapping("/recommendations/products/{productId}")
    List<RecommendationDto> getByProductId(@PathVariable("productId") Long productId);
}
