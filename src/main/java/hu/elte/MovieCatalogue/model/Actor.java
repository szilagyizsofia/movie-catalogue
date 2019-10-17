
package hu.elte.MovieCatalogue.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ACTORS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Actor extends BaseEntity {
    
    @Column
    @NotNull
    private String name;
    
    @JsonIgnore
    @ManyToMany(mappedBy = "actors")
    private List<Movie> movies;
    
    /*@ManyToOne
    @JoinColumn
    public User creator;*/
}
