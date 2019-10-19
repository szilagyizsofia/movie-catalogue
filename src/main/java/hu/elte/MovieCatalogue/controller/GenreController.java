
package hu.elte.MovieCatalogue.controller;

import hu.elte.MovieCatalogue.model.Genre;
import hu.elte.MovieCatalogue.repositories.GenreRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genres")
public class GenreController {
    
    @Autowired
    GenreRepository genreRepository;
    
    @GetMapping("")
    public Iterable<Genre> getAll() {
        return this.genreRepository.findAll();
    }

    @GetMapping("/name/{name}")
    public Genre getByName(@PathVariable String name) {
	return genreRepository.findByName(name);
    }
    //  Alapmuveletek id alpján
    @GetMapping("/{id}")
    public Optional<Genre> get(@PathVariable Long id) {
	return genreRepository.findById(id);
    }
    
    
    @DeleteMapping("/{id}")
    void deleteGenre(@PathVariable Long id) {
          genreRepository.deleteById(id);
    }

    @PostMapping("")
    Genre newGenre(@RequestBody Genre genre) {
        return genreRepository.save(genre);
  }
}
