
package hu.elte.MovieCatalogue.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Entity
@Table(name = "MOVIES")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Movie extends BaseEntity{
   
    @Column
    @NotNull
    String title;
    
    @JoinTable
    @ManyToMany
    private List<Genre> genres;
    
    @JoinColumn
    @ManyToOne
    private Director director;
    
    @JoinTable
    @ManyToMany
    private List<Actor> actors;
    
    @Column
    @NotNull
    private String description;
    
    
    @Column
    @Temporal(TemporalType.DATE)
    private Date releaseDate;
    
    @JsonIgnore
    @OneToMany(mappedBy = "movie")
    private List<Review> reviews;
    
    
    /*@ManyToOne
    @JoinColumn
    public User creator;*/
    
    
}
