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

import com.app.entities.Genre;
import com.app.entities.Library;
import com.app.services.ILibraryServices;

@RestController
@RequestMapping
public class LibraryController {
	
	@Autowired
	private ILibraryServices iLibraryServices;
	
	@GetMapping
	public List<Library> getAllBooks() {
		return iLibraryServices.getAllBooks();
	}
	@PostMapping
	public Library addBook(@RequestBody Library book) {
		return iLibraryServices.addBook(book);
	}
	@DeleteMapping("/{id}")
	public String deleteBookById(@PathVariable Long id) {
		return iLibraryServices.deleteBookById(id);
	}
	@PutMapping("/{l}")
	public String updateBook(@RequestBody Library l) {
		return iLibraryServices.updateBook(l);
	}
	
	@GetMapping("/{genre}")
	public List<Library> getBookByGenre(@PathVariable Genre genre){
		return iLibraryServices.getBookByGenre(genre);
	}
	

	
	
	
	
	

}
