package com.upgrad.movieapp.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_type_id")
    private Long userId;

    @Column(name = "user_type_name", length = 20,unique = true)
    private String userTypeName = "Customer";

}
