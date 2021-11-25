package com.example.airbnb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.airbnb.repository.PlaceRepository;

import com.example.airbnb.model.Place;
@RestController
@CrossOrigin
@RequestMapping("/place")
public class PlaceController {
	
	@Autowired
	private PlaceRepository placeRepository;
	
	@CrossOrigin
	@RequestMapping(value = "", method = RequestMethod.GET, produces = "application/json")
	public List<Place> findAll(){
		return placeRepository.findAll();
	}
	
	@CrossOrigin
	@RequestMapping(value = "{city}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Place>> findByLocalidade(@PathVariable("city") String city) {
		List<Place> places = this.placeRepository.findByCity(city.toUpperCase());
		if (places.isEmpty()) {
			return new ResponseEntity<List<Place>>(places, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<List<Place>>(places, HttpStatus.OK);
		
	}
	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Place> addPlace(@RequestBody Place place){
		return new ResponseEntity<Place>(placeRepository.save(place),HttpStatus.CREATED);
	}
}
