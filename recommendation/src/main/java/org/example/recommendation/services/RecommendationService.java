package org.example.recommendation.services;


import org.example.recommendation.models.Recommendation;
import org.example.recommendation.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommendationService {
    @Autowired
    private RecommendationRepository repository;


    public List<Recommendation> getRecommendationsByProductId(Long productId) {
        return repository.findByProductId(productId);
    }

    public Recommendation saveRecommendation(Recommendation recommendation) {
        return repository.save(recommendation);
    }

    public void deleteByProductId(Long productId) {
        repository.deleteByProductId(productId);
    }
}
