package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entites.Railway;

public interface IRailwayRepository extends JpaRepository<Railway, Long> {
	
//	List<Railway> FindByCategory(Category category);
//	List<Railway> getRailwaysByCategory(Category category);

}
