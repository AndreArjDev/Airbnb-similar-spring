package com.example.airbnb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.airbnb.model.Place;
import com.example.airbnb.repository.PlaceRepository;

@SpringBootApplication
public class AirbnbApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirbnbApplication.class, args);
	}



@Bean
public CommandLineRunner demo(PlaceRepository repository) {
  return (args) -> {
    // save a few customers
    repository.save(new Place("Casa","Taperoá", "Duque de caxias Centro", "Ariano"));
    repository.save(new Place("Apartamento","Porto Alegre", "Duque de caxias", "Guimarães"));
    repository.save(new Place("Apartamento","Porto Alegre", "Duque de caxias", "Érico"));
};
}
}