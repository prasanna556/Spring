package com.upgrad.movieapp.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Data
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "movie_id")
    private int movieId;

    @Column(name = "movie_name",nullable = false,unique = true,length = 50)
    private String movieName;

    @Column(name = "movie_desc", length = 500)
    private String description;

    @Column(nullable = false,name = "release_date")
    private LocalDate releaseDate;

    @Column(nullable = false)
    @Min(60)
    private int duration;

    @Column(nullable = false,name = "cover_photo_url",length = 500)
    private String coverPhotoURL;

    @Column(nullable = false,length = 500,name = "trailer_url")
    private String trailerURL;

    @ManyToOne
    @JoinColumn(name = "status_id", nullable = false)
    private Status statusId;

    @ManyToOne
    @JoinColumn(name = "language_id", nullable = false)
    private Language languageId;

}
