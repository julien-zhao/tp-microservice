package org.example.review.services;

import org.example.review.dtos.ReviewDto;

import java.util.List;

public interface ReviewService {
    ReviewDto saveReview(ReviewDto dto);
    ReviewDto getReview(Long id);

    List<ReviewDto> getReviewsByProductId(Long productId);
}
