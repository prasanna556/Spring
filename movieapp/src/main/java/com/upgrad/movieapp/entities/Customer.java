package com.upgrad.movieapp.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Cascade;

import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id",length = 10)
    private int id;


    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "user_type_id",nullable = false)
    private UserType userType;

    @ManyToOne
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinColumn(name = "language_id", nullable = false)
    private Language language;


    @Column(name = "first_name", length = 20,nullable = false)
    private String firstName;

    @Column(name = "last_name", length = 20)
    private String lastName;

    @Column(length = 20, unique = true,nullable = false)
    private String username;

    @Column(nullable = false,length = 20)
    @Size(min = 5)
    private String password;

    @Column(name = "date_of_birth", nullable = false)
    private LocalDate dateOfBirth;

}
