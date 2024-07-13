package com.app.services;

import java.util.List;

import com.app.entities.Category;
import com.app.entities.Hotel;

public interface IHotelService {
	
	
	List<Hotel> getAllHotels();
	Hotel addHotel(Hotel newHotel);
	String deleteHotel(Long id);
	String updateHotelDetails(Hotel h);
	List<Hotel> GetHotelByCat(Category category);

}
