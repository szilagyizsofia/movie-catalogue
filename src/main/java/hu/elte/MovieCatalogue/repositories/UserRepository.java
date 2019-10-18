
package hu.elte.MovieCatalogue.repositories;


import hu.elte.MovieCatalogue.model.Review;
import hu.elte.MovieCatalogue.model.User;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;



@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    
    List<User>findAll();
    
    Optional<User> findByEmail(String email);

    Optional<User> findByUsername(String username);

    Optional<User> findByUsernameAndPassword(String username, String password);
    
    User findByReviews(Review review);
}

