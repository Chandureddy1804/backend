package com.ammas.kitchen.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.ammas.kitchen.model.Review;
import com.ammas.kitchen.repository.ReviewRepository;


@RestController
@CrossOrigin("*")
public class ReviewController {

    private final ReviewRepository reviewRepository;

    public ReviewController(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    @PostMapping("/submit-review")
    public Review submitReview(@RequestBody Review review) {
        return reviewRepository.save(review);
    }

    @GetMapping("/reviews")
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }
}
