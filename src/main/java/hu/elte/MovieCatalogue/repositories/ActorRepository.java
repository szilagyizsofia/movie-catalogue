
package hu.elte.MovieCatalogue.repositories;

import hu.elte.MovieCatalogue.model.Actor;
import hu.elte.MovieCatalogue.model.Genre;
import hu.elte.MovieCatalogue.model.Movie;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface ActorRepository extends CrudRepository<Actor, Long>{
    
    List<Actor>findAll();
    List<Actor> findAllByMovies(Movie movie);
    Actor findByName(String name);
    
    @Query("select a from Actor a where lower(a.name) like %?1%")
    List<Actor> findAllByNameLike(String substr);
    
    @Query("select a from Actor a where lower(a.name) like ?1%")
    List<Actor> findAllByNameStartsWith(String substr);
}
