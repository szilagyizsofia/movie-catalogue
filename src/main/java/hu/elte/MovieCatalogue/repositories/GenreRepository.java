
package hu.elte.MovieCatalogue.repositories;

import hu.elte.MovieCatalogue.model.Genre;
import org.springframework.data.repository.CrudRepository;


public interface GenreRepository extends CrudRepository<Genre, Long>{
    Genre findByName(String name);
    
    Genre findByNameContaining(String substr);
}
