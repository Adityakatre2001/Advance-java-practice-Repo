package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Category;
import com.app.entities.Hotel;
import com.app.services.IHotelService;



@RestController
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	private IHotelService hotelService;
	
	@GetMapping
	public List<Hotel> getAllHotels() {
		return hotelService.getAllHotels();
	}
	
	@PostMapping
	public Hotel addHotel(@RequestBody Hotel newHotel) {
		return hotelService.addHotel(newHotel);
	}
	
	@DeleteMapping("/{id}")
	public String deleteHotel(@PathVariable Long id) {
		return hotelService.deleteHotel(id);
	}
	
	@PutMapping("/{h}")
	public String updateHotelDetails(@RequestBody Hotel h) {
		return hotelService.updateHotelDetails(h);
	}
	//@GetMapping("/category/{category}")
	@GetMapping("/category/{category}")
	public List<Hotel> GetHotelByCategory(@PathVariable Category category) {
		return hotelService.GetHotelByCat(category);
	}
	
	

}
