package com.upgrad.movieapp.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.service.annotation.GetExchange;

import java.util.*;

@Data
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "city_id")
    private int id;

    @Column(nullable = false, name = "city_name")
    private String cityName;

    @OneToMany(mappedBy = "city",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Theatre> theatres = new HashSet<>();
}
