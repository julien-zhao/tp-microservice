package org.example.review.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "reviews")
public class Review {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "review_id")
    private long reviewId;

    @Column(name = "author")
    private String author;
    @Column(name = "content")
    private String content;

    @Column(name = "product_id")
    private long productId;

    @Column(name = "subject")
    private String subject;

}



