package com.upgrad.movieapp.service;

import com.upgrad.movieapp.entities.City;
import com.upgrad.movieapp.entities.Theatre;
import jakarta.persistence.EntityManager;

import java.util.List;

public interface CityService {
    City acceptCityDetails(City city);

    City updateCityDetails(int id, City city);

    City getCityDetails(int id);

    City getCityDetailsByCityName(String cityName);

    boolean deleteCity(int id);

    List<City> getAllCityDetails();

    void addTheatre(City city, Theatre theatre);

}
