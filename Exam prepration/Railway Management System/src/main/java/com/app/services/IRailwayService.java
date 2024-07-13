package com.app.services;

import java.util.List;

import com.app.entities.Railway;

public interface IRailwayService {
	
	
	List<Railway> GetAllRailways();
	String DeleteById(Long id);
	String UpdateRailway(Railway r);
	Railway InsertRailway(Railway newRailway);

}
