package com.upgrad.movieapp.dao;

import com.upgrad.movieapp.entities.Theatre;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TheatreDao extends JpaRepository<Theatre,Integer> {
    Theatre findByTheatreName(String name);
    List<Theatre> findByTicketPriceLessThan(int price, Pageable pageable);

    List<Theatre> findByTheatreNameContaining(String pattern, Pageable pageable);

    @Query("select u from Theatre u where u.ticketPrice >:price")
    List<Theatre> getTheatreByPriceMoreThan(@Param("price") int price);
}
