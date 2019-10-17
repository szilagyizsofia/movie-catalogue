/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.elte.MovieCatalogue.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "REVIEWS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)

public class Review extends BaseEntity {
    
    @Column
    @NotNull
    public String review;
    
    @Column
    @NotNull
    public Integer point;
    
    @ManyToOne
    @JoinColumn
    public Movie movie;
    
    @ManyToOne
    @JoinColumn
    public User user;
    
    
}
