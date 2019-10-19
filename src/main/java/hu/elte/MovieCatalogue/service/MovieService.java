
package hu.elte.MovieCatalogue.service;

import hu.elte.MovieCatalogue.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class MovieService {
    
    @Autowired
    MovieRepository movieRepository;
}
