package org.example.review.rest;

import org.example.review.dtos.ReviewDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface ReviewController {
    //@GetMapping(value = "/review", produces = "application/json")
    //List<ReviewDto> getReviews(@RequestParam(value = "productId", required = true) long productId);
}
