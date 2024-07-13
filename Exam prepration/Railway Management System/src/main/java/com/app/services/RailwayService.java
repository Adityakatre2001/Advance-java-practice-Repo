package com.app.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Repositories.RailwayRepository;
import com.app.entities.Railway;

@Service
@Transactional
public class RailwayService implements IRailwayService {

	@Autowired
	private RailwayRepository railwayrepo;
	
	@Autowired
	private ModelMapper modelmapper;
	
	@Override
	public List<Railway> GetAllRailways() {
		
		return railwayrepo.findAll().stream().collect(Collectors.toList());
	}

	@Override
	public String DeleteById(Long id) {
		if(railwayrepo.existsById(id)) {
			railwayrepo.deleteById(id);
			return "deleted by id";
		}
		return "Invalid Id";
	}

	@Override
	public String UpdateRailway(Railway r) {
		if(railwayrepo.existsById(r.getId())){
			railwayrepo.save(r);
			return "Railway Updated Sucessfully";
			
		}
		return "Not Updated Invalid Credentials";
	}

	@Override
	public Railway InsertRailway(Railway newRailway) {
		
		return railwayrepo.save(newRailway);
		 
	}

}
