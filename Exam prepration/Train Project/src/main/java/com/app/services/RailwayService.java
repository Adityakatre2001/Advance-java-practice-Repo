package com.app.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entites.Railway;
import com.app.repository.IRailwayRepository;

@Service
@Transactional
public class RailwayService implements IRailwayService{
	@SuppressWarnings("unused")
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private IRailwayRepository railwayRepository;
	@Override
	public List<Railway> GetAllRailway() {
		
		return railwayRepository.findAll().stream().collect(Collectors.toList());
	}

	@Override
	public Railway insertIntoRailway(Railway newRailway) {
		
		return railwayRepository.save(newRailway);
	}

	@Override
	public String updateRailway(Railway r) {
		if(railwayRepository.existsById(r.getId())) {
			railwayRepository.save(r);
			return "Railway Data Updated Sucessflly";
		}
		return "Railway Data Updation faild";
	}

	@Override
	public String deleteRailwayById(Long id) {
		if(railwayRepository.existsById(id)) {
			railwayRepository.deleteById(id);
			return "Data Deleted Sucessfully";
		}
		return "Data not updated";
	}
//
//	@Override
//	public List<Railway> GetRailWayByCategory(Category category) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public List<Railway> GetRailWayByCategory(Category category) {
////		if(railwayRepository.equals(category)) {
//			return railwayRepository.FindByCategory(category);
////			return railwayRepository.findAll().stream().collect(Collectors.toList());
////		}
		//return null;
//		
//	}
	
	
//	@Override
//    public List<Railway> getRailwaysByCategory(Category category) {
//        return railwayRepository.getRailwaysByCategory(category);
//    }
//	
	

}
