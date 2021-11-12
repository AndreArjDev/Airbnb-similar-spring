package com.example.airbnb.repository;


import java.util.List;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.airbnb.model.Place;

@Repository
public interface PlaceRepository extends CrudRepository<Place, Long>{
	List<Place> findAll();

	List<Place> findByCity(String city);
	
	
}
