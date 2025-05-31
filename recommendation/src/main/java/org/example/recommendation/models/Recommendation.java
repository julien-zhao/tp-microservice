package org.example.recommendation.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "recommendations")
public class Recommendation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long recommendationId;
    private Long productId;
    private String author;
    private int rate;
    private String content;

    public Recommendation(Long productId, String author, int rate, String content) {
        this.productId = productId;
        this.author = author;
        this.rate = rate;
        this.content = content;
    }

}