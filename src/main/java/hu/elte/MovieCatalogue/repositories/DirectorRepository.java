
package hu.elte.MovieCatalogue.repositories;

import hu.elte.MovieCatalogue.model.Actor;
import hu.elte.MovieCatalogue.model.Director;
import hu.elte.MovieCatalogue.model.Movie;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface DirectorRepository extends CrudRepository<Director, Long>{
    
    
    List<Director>findAll();
    List<Actor> findAllByMovies(Movie movie);
}

