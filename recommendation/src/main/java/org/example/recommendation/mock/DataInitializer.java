package org.example.recommendation.mock;


import org.example.recommendation.models.Recommendation;
import org.example.recommendation.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private RecommendationRepository recommendationRepository;



    @Override
    public void run(String... args) throws Exception {
        if (recommendationRepository.count() == 0) {
            recommendationRepository.save(new Recommendation( 1L, "Alice", 5, "Excellent produit !"));
            recommendationRepository.save(new Recommendation(1L, "Bob", 4, "Très bon mais un peu cher."));
            recommendationRepository.save(new Recommendation(2L, "Charlie", 3, "Correct pour le prix."));

            System.out.println("✅ Recommendations initialized.");
        }
    }

}
