package com.upgrad.movieapp;

import com.upgrad.movieapp.entities.*;
import com.upgrad.movieapp.service.CityService;
import com.upgrad.movieapp.service.CustomerService;
import com.upgrad.movieapp.service.TheatreService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.h2.engine.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.time.LocalDate;
import java.util.ArrayList;

@SpringBootApplication
public class MovieappApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(MovieappApplication.class, args);


		// Testing city and theatre
//		CityService cityService = (CityService) applicationContext.getBean("cityServiceImpl");
//		// create city
//		City city = new City();
//		city.setCityName("kalyan");
//		// save it in DB
//
//		// create a theatre
//		Theatre theatre = new Theatre();
//		theatre.setTheatreName("Cinemax");
//		//City city1 = cityService.getCityDetailsByCityName("kalyan");
//
//		// set city in Theatre
//		//theatre.setCity(city);
//		theatre.setTicketPrice(150.00);
//		cityService.addTheatre(city,theatre);
//		//TheatreService theatreService = (TheatreService) applicationContext.getBean("theatreServiceImpl");
//		City savedCity = cityService.acceptCityDetails(city);
//
//		System.out.println(savedCity);
//
//		// Create another theatre
//		Theatre theatre1 = new Theatre();
//		theatre1.setTheatreName("SM5");
//		theatre1.setTicketPrice(200.00);
//
//		cityService.addTheatre(city,theatre1);
//		//City city1 = cityService.getCityDetailsByCityName("kalyan");
//		//city1.addTheatre(theatre1);
//
//		City updatedCity = cityService.updateCityDetails(city.getId(),city);
//
//		// save theatre in DB
//		//Theatre theatre1 = theatreService.acceptTheatreDetails(theatre);
//		//System.out.println(theatre1);
//
//
//		System.out.println(updatedCity);
//
//		updatedCity.getTheatres().stream().forEach(theatre2 -> System.out.println(theatre2.getCity()));
//
//		System.out.println(updatedCity.getTheatres().contains(theatre));
//
//		System.out.println("=========================");

		// testing Customer

		Customer customer = new Customer();
		customer.setFirstName("prasanna");
		customer.setLastName("kulkarni");
		customer.setUsername("kulpra");
		customer.setPassword("dsfdsfg");
		customer.setDateOfBirth(LocalDate.of(1993,3,24));
		Language language = new Language();
		language.setLanguageName("Marathi");
		customer.setLanguage(language);
		UserType userType = new UserType();
		customer.setUserType(userType);
		CustomerService customerService = (CustomerService) applicationContext.getBean("customerServiceImpl");
		Customer savedCustomer = customerService.acceptCustomerDetails(customer);
		System.out.println(savedCustomer);











	}

}
