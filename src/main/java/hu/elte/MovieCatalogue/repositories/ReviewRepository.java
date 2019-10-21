
package hu.elte.MovieCatalogue.repositories;

import hu.elte.MovieCatalogue.model.Movie;
import hu.elte.MovieCatalogue.model.Review;
import hu.elte.MovieCatalogue.model.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface ReviewRepository extends CrudRepository<Review, Long> {
    
    List<Review>findAll();
    List<Review> getAllByUser(User user);
    List<Review> getAllByMovie(Movie movie);
    
    List<Review> findAllByOrderByCreatedAtDesc();
}
