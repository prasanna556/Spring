package com.upgrad.movieapp.dao;

import com.upgrad.movieapp.entities.City;
import com.upgrad.movieapp.entities.Theatre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityDao extends JpaRepository<City,Integer> {
    City findByCityName(String name);
}
