package com.app.services;

import java.util.List;

import com.app.entites.Railway;

public interface IRailwayService {
	

	Railway insertIntoRailway(Railway newRailway);
	String updateRailway(Railway r);
	String deleteRailwayById(Long id);
	List<Railway> GetAllRailway();
//	List<Railway> GetRailWayByCategory(Category category);
//	List<Railway> getRailwaysByCategory(Category category);
	

}
