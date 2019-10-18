
package hu.elte.MovieCatalogue.repositories;

import hu.elte.MovieCatalogue.model.Actor;
import hu.elte.MovieCatalogue.model.Movie;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface ActorRepository extends CrudRepository<Actor, Long>{
    
    List<Actor>findAll();
    List<Actor> findAllByMovies(Movie movie);
}
