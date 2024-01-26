package com.upgrad.movieapp.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "booking_id")
    private Long bookingId;

    @ManyToOne
    @JoinColumn(name = "customer_id",nullable = false)
    private Customer customerId;

    @ManyToOne
    @JoinColumn(name = "movie_theatre_id", nullable = false)
    private MovieTheatre movieTheatreId;

    @Column(nullable = false,name = "booking_date")
    private LocalDate bookingDate;

    @Column(name = "num_of_seats", nullable = false)
    private int numOfSeats;
}
