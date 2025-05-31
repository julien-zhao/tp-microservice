package org.example.recommendation.repository;


import org.example.recommendation.models.Recommendation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecommendationRepository extends JpaRepository<Recommendation, Long> {
    List<Recommendation> findByProductId(Long productId);
    void deleteByProductId(Long productId);
}