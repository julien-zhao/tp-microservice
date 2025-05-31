package org.example.recommendation.controller;


import org.example.recommendation.models.Recommendation;
import org.example.recommendation.services.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recommendations")
public class RecommendationController {

    @Autowired
    private RecommendationService service;


    @GetMapping("/products/{productId}")
    public List<Recommendation> getByProductId(@PathVariable Long productId) {
        return service.getRecommendationsByProductId(productId);
    }

    @PostMapping
    public Recommendation createRecommendation(@RequestBody Recommendation recommendation) {
        return service.saveRecommendation(recommendation);
    }

    @DeleteMapping("/{productId}")
    public void deleteByProductId(@PathVariable Long productId) {
        service.deleteByProductId(productId);
    }
}
