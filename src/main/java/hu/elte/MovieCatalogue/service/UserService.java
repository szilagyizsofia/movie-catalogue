
package hu.elte.MovieCatalogue.service;


import hu.elte.MovieCatalogue.exception.UserNotValidException;
import hu.elte.MovieCatalogue.model.User;
import hu.elte.MovieCatalogue.repositories.UserRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;



@Service
@SessionScope
@Data
public class UserService {
    @Autowired
    private UserRepository userRepository;

    private User user;
        
    public User login(User user) throws UserNotValidException {
        if (isValid(user)) {
            return this.user = userRepository.findByUsername(user.getUsername()).get();
        }
        throw new UserNotValidException();
    }

    public void logout() { 
        user = null; 
    } 

    public User register(User user) {
        return this.user = userRepository.save(user);
    }

    public boolean isValid(User user) {
        return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword()).isPresent();
    }
    
    public boolean isLoggedIn() {
        return user != null;
    }
    
    public User getLoggedInUser() { 
        return user; 
    } 

}
