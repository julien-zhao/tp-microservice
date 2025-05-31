package org.example.review.services.impl;

import org.example.review.dtos.ReviewDto;
import org.example.review.models.Review;
import org.example.review.repository.ReviewRepository;
import org.example.review.services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public ReviewDto getReview(Long id) {
        Review review = reviewRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Avis non trouvé avec id : " + id));

        return ReviewDto.builder()
                .reviewId(review.getReviewId())
                .productId(review.getProductId())
                .author(review.getAuthor())
                .subject(review.getSubject())
                .content(review.getContent())
                .build();
    }

    @Override
    public ReviewDto saveReview(ReviewDto dto) {
        Review entity = Review.builder()
                .productId(dto.getProductId())
                .author(dto.getAuthor())
                .subject(dto.getSubject())
                .content(dto.getContent())
                .build();

        Review saved = reviewRepository.save(entity);

        return ReviewDto.builder()
                .reviewId(saved.getReviewId())
                .productId(saved.getProductId())
                .author(saved.getAuthor())
                .subject(saved.getSubject())
                .content(saved.getContent())
                .build();
    }
    //@Override
    public List<ReviewDto> getReviewsByProductId(Long productId) {
        List<Review> reviews = reviewRepository.findByProductId(productId);

        return reviews.stream().map(review -> ReviewDto.builder()
                        .reviewId(review.getReviewId())
                        .productId(review.getProductId())
                        .author(review.getAuthor())
                        .subject(review.getSubject())
                        .content(review.getContent())
                        .build())
                .toList();
    }

}
