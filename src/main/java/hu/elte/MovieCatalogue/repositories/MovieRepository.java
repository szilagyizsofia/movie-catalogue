/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.MovieCatalogue.repositories;

import hu.elte.MovieCatalogue.model.Actor;
import hu.elte.MovieCatalogue.model.Director;
import hu.elte.MovieCatalogue.model.Genre;
import hu.elte.MovieCatalogue.model.Movie;
import java.util.List;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author saghi
 */
public interface MovieRepository extends CrudRepository<Movie, Long> {
    
    
    
    List<Movie>findAll();
    
    List<Movie>findAllByGenres(Genre genre);
    
    List<Movie> getMoviesByGenresNameIn(List<String> names);
    
    List<Movie>findAllByDirector(Director director);
    
    List<Movie>findAllByActors(Actor actor);
    
    List<Movie>findAllByActorsOrDirectorOrGenres(Actor actor, Director director,Genre genre);

    Movie findByTitle(String name);
    
    @Query("select m from Movie m where lower(m.title) like %?1%")
    List<Movie> findAllByTitleLike(String substr);
    
    @Query("select m from Movie m where lower(m.title) like ?1%")
    List<Movie> findAllByTitleStartsWith(String substr);
    
   
   
    
    
    
    
    
}
