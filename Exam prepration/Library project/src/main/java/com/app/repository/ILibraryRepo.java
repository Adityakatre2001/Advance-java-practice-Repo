package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.app.entities.Genre;
import com.app.entities.Library;

public interface ILibraryRepo extends JpaRepository<Library, Long> {
	@Query("SELECT l FROM Library l WHERE l.genre = :genre")
	List<Library> getBookByGenre(@Param("genre") Genre genre);
	
	
//	@Query("DELETE l FROM Library l WHERE l.genre = :genre")
//	String deleteBYGenre(@Param("genre") Genre genre);
//	
//	  List<Library> findByGenre(Genre genre);
//	    void deleteByGenre(Genre genre);

}
