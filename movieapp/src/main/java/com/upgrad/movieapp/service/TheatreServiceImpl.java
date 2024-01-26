package com.upgrad.movieapp.service;

import com.upgrad.movieapp.dao.TheatreDao;
import com.upgrad.movieapp.entities.City;
import com.upgrad.movieapp.entities.Theatre;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.lang.Boolean.TRUE;

@Service
public class TheatreServiceImpl implements TheatreService{

    @Autowired
    private TheatreDao theatreDao;

    @PersistenceContext
    EntityManager entityManager;

    @Override
    @Transactional
    public Theatre acceptTheatreDetails(Theatre theatre) {
        City city = theatre.getCity();
        if(city.getId() == 0) {
            entityManager.persist(city);
        }else {
            city = entityManager.merge(city);
        }

        theatre.setCity(city);
        return theatreDao.save(theatre);
    }

    @Override
    public Theatre getTheatreDetails(int id) {
        return theatreDao.findById(id).get();
    }

    @Override
    public Theatre updateTheatreDetails(int id, Theatre theatre) {
        return theatreDao.save(theatre);
    }

    @Override
    public boolean deleteTheatre(int id) {
        theatreDao.deleteById(id);
        return TRUE;
    }

    @Override
    public List<Theatre> getAllTheatreDetails() {
        return theatreDao.findAll();
    }
}
