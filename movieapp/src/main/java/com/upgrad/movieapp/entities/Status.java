package com.upgrad.movieapp.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "status_id")
    private Long statusId;

    @Column(name = "status_name", length = 20, nullable = false, unique = true)
    private String statusName;
}
