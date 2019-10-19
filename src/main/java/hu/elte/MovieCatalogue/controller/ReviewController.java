
package hu.elte.MovieCatalogue.controller;

import hu.elte.MovieCatalogue.model.Actor;
import hu.elte.MovieCatalogue.model.Review;
import hu.elte.MovieCatalogue.repositories.ReviewRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/reviews")
public class ReviewController {
    
    @Autowired
    ReviewRepository reviewRepository;
    
    @GetMapping("")
    public List<Review> getAll() {
        return this.reviewRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Review> get(@PathVariable Long id) {
	return reviewRepository.findById(id);
    }
    @DeleteMapping("/{id}")
    void deleteReview(@PathVariable Long id) {
          reviewRepository.deleteById(id);
    }

    @PostMapping("")
    Review newReview(@RequestBody Review review) {
        return reviewRepository.save(review);
  }

    
}
