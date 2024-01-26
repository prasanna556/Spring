package com.upgrad.movieapp.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "language_id")
    private Long languageId;

    @Column(name = "language_name", length = 20, nullable = false, unique = true)
    private String languageName;

}
