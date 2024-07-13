package com.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.app.entities.Category;
import com.app.entities.Hotel;

@Repository
public interface IHotelRepo extends JpaRepository<Hotel, Long> {

	@Query("SELECT h FROM Hotel h WHERE h.category = :category")
	   List<Hotel> getHotelByCategory(@Param("category") Category category);
	
}
