
package hu.elte.MovieCatalogue.controller;


import hu.elte.MovieCatalogue.exception.UserNotValidException;
import hu.elte.MovieCatalogue.model.Review;
import hu.elte.MovieCatalogue.model.User;
import static hu.elte.MovieCatalogue.model.User.Role.USER;
import hu.elte.MovieCatalogue.repositories.UserRepository;
import hu.elte.MovieCatalogue.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/user")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private UserRepository userRepository;
    
    @GetMapping("")
    public List<User> getAll() {
        return this.userRepository.findAll();
    }
    
    @GetMapping("/greet")
    public String greeting(@RequestParam(value = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }
    
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute(new User());
        return "login";
    }
    
    @GetMapping("/logout")
    public String logout(Model model) {
        userService.logout();
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute User user, Model model) {
        try { 
            userService.login(user); 
            return redirectToGreeting(user);
        } 
        catch (UserNotValidException e) { 
            model.addAttribute("error", true); 
            return "login"; 
        } 
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute User user) {
        user.setRole(USER);
        userService.register(user);

        return redirectToGreeting(user);
    }

    private String redirectToGreeting(@ModelAttribute User user) {
        return "redirect:/user/greet?name=" + user.getUsername();
    }

}
