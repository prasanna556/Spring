package com.upgrad.movieapp.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class MovieTheatre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movie_theatre_id")
    private Long movieTheatreId;

    @ManyToOne
    @JoinColumn(name = "movie_id",nullable = false)
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "theatre_id",nullable = false)
    private Theatre theatre;
}
