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

import com.app.entites.Railway;
import com.app.services.IRailwayService;



@RestController
@RequestMapping("/railway")
public class RailwayController {
	
	@Autowired
	private IRailwayService iRailwayService;
	
	@PostMapping
	public Railway insertIntoRailway(@RequestBody Railway newRailway) {
		
		return iRailwayService.insertIntoRailway(newRailway);
		
	}
	
	@PutMapping
	public String updateRailway(@RequestBody Railway r) {
		return iRailwayService.updateRailway(r);
		
	}
	
//	@DeleteMapping("/{id}")
	@DeleteMapping("/{id}")
	public String deleteRailwayById(@PathVariable Long id) {
		return iRailwayService.deleteRailwayById(id);
		
	}
	
	@GetMapping
	public List <Railway> GetAllRailway(){
		return iRailwayService.GetAllRailway();
		
	}
//	@GetMapping("/{category}")
//	public List<Railway> GetRailWayByCategory(@PathVariable Category category){
//		
//		return iRailwayService.GetRailWayByCategory(category);
//		
//	}
//	
//	
//	@GetMapping("/category/{category}")
//    public ResponseEntity<List<Railway>> getRailwaysByCategory(@PathVariable Category category) {
//        List<Railway> railways = iRailwayService.getRailwaysByCategory(category);
//        if (railways.isEmpty()) {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//        return ResponseEntity.ok(railways);
//    }
	

}
