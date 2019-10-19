
package hu.elte.MovieCatalogue.repositories;

import hu.elte.MovieCatalogue.model.Actor;
import hu.elte.MovieCatalogue.model.Director;
import hu.elte.MovieCatalogue.model.Movie;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface DirectorRepository extends CrudRepository<Director, Long>{
    
    
    List<Director>findAll();
    List<Director> findAllByMovies(Movie movie);
    Director findByName(String name);
    Director findByNameContaining(String substr);
    
    @Query("select d from Director d where lower(d.name) like %?1%")
    List<Director> findAllByNameLike(String substr);
    
    @Query("select d from Director d where lower(d.name) like ?1%")
    List<Director> findAllByNameStartsWith(String substr);
}

