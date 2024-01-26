package com.upgrad.movieapp.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

import javax.validation.Valid;


@Getter
@Setter
@Entity
public class Theatre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int theatre_id;

    @Column(nullable = false,unique = true, length = 20, name = "theatre_name")
    private String theatreName;

    @Column(name = "ticket_price", nullable = false)
    @Value("160.00")
    private double ticketPrice;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    @Override
    public String toString() {
        return "Theatre{" +
                "theatre_id=" + theatre_id +
                ", theatreName='" + theatreName + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Theatre otherTheatre)) {
            return false;
        }

        return theatre_id != 0 &&
                    theatre_id == otherTheatre.getTheatre_id();
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
