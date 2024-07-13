package com.app.controllers;

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

import com.app.entities.Railway;
import com.app.services.IRailwayService;


@RestController
@RequestMapping("/railways")
public class RailwayController {
	
	@Autowired
	private IRailwayService railwayService;
	
	@GetMapping
	public List<Railway> GetAllRailways(){
		return railwayService.GetAllRailways();
	}
	
	@PostMapping
	public Railway InsertRailway(@RequestBody Railway newRailway) {
		System.out.println("in category new category"+newRailway);
		return railwayService.InsertRailway(newRailway);
	}
	
	@DeleteMapping("/{id}")
	public String DeleteById(@PathVariable Long id) {
		return railwayService.DeleteById(id);
	}
	
	@PutMapping
	public String UpdateRailway(@RequestBody Railway r) {
		return railwayService.UpdateRailway(r);
	}
	
}
