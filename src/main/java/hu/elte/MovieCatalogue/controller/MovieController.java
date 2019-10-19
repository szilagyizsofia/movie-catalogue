/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.MovieCatalogue.controller;

import hu.elte.MovieCatalogue.model.Actor;
import hu.elte.MovieCatalogue.model.BaseEntity;
import hu.elte.MovieCatalogue.model.Director;
import hu.elte.MovieCatalogue.model.Genre;
import hu.elte.MovieCatalogue.model.Movie;
import hu.elte.MovieCatalogue.repositories.ActorRepository;
import hu.elte.MovieCatalogue.repositories.DirectorRepository;
import hu.elte.MovieCatalogue.repositories.GenreRepository;
import hu.elte.MovieCatalogue.repositories.MovieRepository;
import hu.elte.MovieCatalogue.repositories.UserRepository;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {
    
    
    @Autowired
    private MovieRepository movieRepository;
    
    @Autowired
    private GenreRepository genreRepository;
    
    @Autowired
    private ActorRepository actorRepository;
    
    @Autowired
    private DirectorRepository directorRepository;
    
    @GetMapping("")
    public List<Movie> getAll() {
        return this.movieRepository.findAll();
    }
    
    @GetMapping("/name/{name}")
    public Movie getByName(@PathVariable String name) {
        return this.movieRepository.findByTitle(name);  
    }
    
    // Összetett keresés cym alapján
    @GetMapping("/search/{substr}")
    public List<Movie> getAllByTitleSubstrName(@PathVariable String substr) {
       List<Movie> all = new ArrayList<Movie>();
       
       // Adott stringel kezdodik
       List<Movie> movies1 = movieRepository.findAllByTitleStartsWith(substr.toLowerCase());
       // The + adott stringgel kezdodik
       List<Movie> movies2 = movieRepository.findAllByTitleStartsWith("the " + substr.toLowerCase());
       //Benne van az adott string
       List<Movie> movies3 = movieRepository.findAllByTitleLike(substr.toLowerCase());
       
       movies2.removeAll(movies1);
       movies3.removeAll(movies1);
       movies3.removeAll(movies2);
       
       all.addAll(movies1);
       all.addAll(movies2);
       all.addAll(movies3);
       return all;
       
    }
   
    // Keresés egy, vagy több típus alapján (Bármelyik típusnak megegező filmet leléri, nem kell az összesnek megfelelnie)
    @GetMapping("/genres/{names}")
    public List<Movie> getAllByGenreName(@PathVariable List<String> names) {
        return  this.movieRepository.getMoviesByGenresNameIn(names);  
        
    }
    
    //  Keresés színész neve alapján
    @GetMapping("actor/search/{substr}")
    public List<Movie> getAllByActorSubstrName(@PathVariable String substr) {
       List<Movie> all = new ArrayList<Movie>();
       
       
       List<Actor> actors1 = actorRepository.findAllByNameStartsWith(substr.toLowerCase());
       
       List<Movie> movies1 = new ArrayList<>();
     
       for (Actor actor : actors1){
           movies1.addAll(actor.getMovies());
       }
       
       List<Actor> actors2 = actorRepository.findAllByNameLike(substr.toLowerCase());
       actors2.removeAll(actors1);
       Set<Movie> movies2 = new HashSet<>();
       for (Actor actor : actors1){
           movies2.addAll(actor.getMovies());
       }
       movies2.removeAll(movies1);
       
       
       all.addAll(movies1);
       all.addAll(movies2);
       return all;
       
    }
    
   //  Keresés rendező neve alapján
    @GetMapping("director/search/{substr}")
    public List<Movie> getAllByDirectorSubstrName(@PathVariable String substr) {
       List<Movie> all = new ArrayList<Movie>();
       
       
       List<Director> directors1 = directorRepository.findAllByNameStartsWith(substr.toLowerCase());
       
       List<Movie> movies1 = new ArrayList<>();
     
       for (Director director : directors1){
           movies1.addAll(director.getMovies());
       }
       
       List<Director> directors2 = directorRepository.findAllByNameLike(substr.toLowerCase());
       directors2.removeAll(directors1);
       Set<Movie> movies2 = new HashSet<>();
       for (Director director : directors2){
           movies2.addAll(director.getMovies());
       }
       movies2.removeAll(movies1);
       
       
       all.addAll(movies1);
       all.addAll(movies2);
       return all;
       
    }
    
    //Keresés id alapján
    @GetMapping("/{id}")
    public Optional<Movie> get(@PathVariable Long id) {
	return movieRepository.findById(id);
    }
    // Törlés id alapján
    @DeleteMapping("/{id}")
    void deleteMovie(@PathVariable Long id) {
          movieRepository.deleteById(id);
    }
    //Feltöltés id alapján
    @PostMapping("")
    Movie newMovie(@RequestBody Movie newMovie) {
        return movieRepository.save(newMovie);
  }
    
    
    
   
    }
