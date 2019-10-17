
package hu.elte.MovieCatalogue.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "USERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class User extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false, unique = true)
    private Role role;

    @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Review> reviews;
    
   /* @JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Movie> createdMovies;*/
    
    /*@JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Actor> createdActors;*/
    
    /*@JsonIgnore
    @OneToMany(mappedBy = "user")
    private List<Director> createdDirectors;*/
    
    
    public enum Role {
        GUEST, USER, MODERATOR,ADMINISTRATOR
    }
}