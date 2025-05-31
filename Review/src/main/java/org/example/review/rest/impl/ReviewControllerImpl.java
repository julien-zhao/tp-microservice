package org.example.review.rest.impl;

import org.example.review.dtos.ReviewDto;
import org.example.review.rest.ReviewController;
import org.example.review.services.ReviewService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewControllerImpl implements ReviewController {
    private static final Logger LOG = LoggerFactory.getLogger(ReviewControllerImpl.class);
    @Autowired
    private ReviewService reviewService;


    @GetMapping("/{reviewId}")
    public ReviewDto getProduct(@PathVariable Long reviewId) {
        //LOGGER.info("find product, service address {}", serviceUtil.getServiceAddress());
        return reviewService.getReview(reviewId);
    }


    @PostMapping
    public ReviewDto createProduct(@RequestBody ReviewDto reviewDto) {
        return reviewService.saveReview(reviewDto);
    }

    @GetMapping("/products/{productId}")
    public List<ReviewDto> getReviewsByProductId(@PathVariable Long productId) {
        return reviewService.getReviewsByProductId(productId);
    }
}
