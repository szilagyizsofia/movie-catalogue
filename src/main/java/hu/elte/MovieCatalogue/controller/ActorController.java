
package hu.elte.MovieCatalogue.controller;

import hu.elte.MovieCatalogue.model.Actor;
import hu.elte.MovieCatalogue.model.Genre;
import hu.elte.MovieCatalogue.repositories.ActorRepository;
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
@RequestMapping("/actors")
public class ActorController {
    
    @Autowired
    ActorRepository actorRepository;
    
    @GetMapping("")
    public List<Actor> getAll() {
        return this.actorRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Actor> get(@PathVariable Long id) {
	return actorRepository.findById(id);
    }
    
   
    
    
    @DeleteMapping("/{id}")
    void deleteActor(@PathVariable Long id) {
          actorRepository.deleteById(id);
    }

    @PostMapping("")
    Actor newActor(@RequestBody Actor actor) {
        return actorRepository.save(actor);
  }
}
