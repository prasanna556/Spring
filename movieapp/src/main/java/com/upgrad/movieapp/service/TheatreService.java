package com.upgrad.movieapp.service;

import com.upgrad.movieapp.entities.Theatre;

import java.util.List;

public interface TheatreService {
    Theatre acceptTheatreDetails(Theatre theatre);

    Theatre getTheatreDetails(int id);

    Theatre updateTheatreDetails(int id, Theatre theatre);

    boolean deleteTheatre(int id);
    List<Theatre> getAllTheatreDetails();

}
