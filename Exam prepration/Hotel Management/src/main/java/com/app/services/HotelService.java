package com.app.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Category;
import com.app.entities.Hotel;
import com.app.repositories.IHotelRepo;
@Service
@Transactional
public class HotelService implements IHotelService {

	@Autowired
	private IHotelRepo hotelRepo;
	
	
	
	@Override
	public List<Hotel> getAllHotels() {
		
		return hotelRepo.findAll().stream().collect(Collectors.toList());
	}

	@Override
	public Hotel addHotel(Hotel newHotel) {
		
		return hotelRepo.save(newHotel);
	}

	@Override
	public String deleteHotel(Long id) {
		if(hotelRepo.existsById(id)) {
			hotelRepo.deleteById(id);
			return "Record Deleted sucessfully";
		}
		return "Not deleted invalid id";
	}

	@Override
	public String updateHotelDetails(Hotel h) {
		if(hotelRepo.existsById(h.getId())) {
			hotelRepo.save(h);
			return "Record updated Sucessfully";
		}
		return "Updation wasn't done";
	}

	@Override
	public List<Hotel> GetHotelByCat(Category category) {
	
		return hotelRepo.getHotelByCategory(category);
	}

}
