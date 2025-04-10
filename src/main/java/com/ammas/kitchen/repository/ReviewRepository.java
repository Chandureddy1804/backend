package com.ammas.kitchen.repository;

import com.ammas.kitchen.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
