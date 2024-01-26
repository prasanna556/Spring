package com.upgrad.movieapp.service;

import com.upgrad.movieapp.dao.CityDao;
import com.upgrad.movieapp.entities.City;
import com.upgrad.movieapp.entities.Theatre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    @PersistenceContext
    private EntityManager entityManager;



    @Override
    public City acceptCityDetails(City city) {
        return cityDao.save(city);

    }

    @Override
    public City updateCityDetails(int id, City city) {
        return cityDao.save(city);
    }

    @Override
    public City getCityDetails(int id) {
       return cityDao.findById(id).get();
    }

    @Override
    public City getCityDetailsByCityName(String cityName) {

        return cityDao.findByCityName(cityName);
    }

    @Override
    public boolean deleteCity(int id) {
        City cityToDelete = cityDao.findById(id).get();
        cityDao.delete(cityToDelete);
        return true;
    }

    @Override
    public List<City> getAllCityDetails() {
        return cityDao.findAll();
    }

    @Override
    @Transactional
    public void addTheatre(City city,Theatre theatre) {
       // City mergedCity = entityManager.merge(city);
        city.getTheatres().add(theatre);
        theatre.setCity(city);
    }


}
