
package hu.elte.MovieCatalogue.controller;

import hu.elte.MovieCatalogue.model.Actor;
import hu.elte.MovieCatalogue.model.Director;
import hu.elte.MovieCatalogue.repositories.DirectorRepository;
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
@RequestMapping("/directors")
public class DirectorController {
    
    @Autowired
    DirectorRepository directorRepository;
    
    @GetMapping("")
    public List<Director> getAll() {
        return this.directorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Director> get(@PathVariable Long id) {
	return directorRepository.findById(id);
    }
    @DeleteMapping("/{id}")
    void deleteDirector(@PathVariable Long id) {
          directorRepository.deleteById(id);
    }

    @PostMapping("")
    Director newDirector(@RequestBody Director director) {
        return directorRepository.save(director);
  }
}