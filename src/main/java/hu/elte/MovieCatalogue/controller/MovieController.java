/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.MovieCatalogue.controller;

import hu.elte.MovieCatalogue.model.Movie;
import hu.elte.MovieCatalogue.repositories.MovieRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    @GetMapping("")
    public List<Movie> getAll() {
        return this.movieRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Movie> get(@PathVariable Long id) {
	return movieRepository.findById(id);
    }
    
    @PostMapping("")
    Movie newMovie(@RequestBody Movie newMovie) {
        return movieRepository.save(newMovie);
  }
    
    
    
   
    }
