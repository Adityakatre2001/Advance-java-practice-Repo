package com.app.services;

import java.util.List;

import com.app.entities.Genre;
import com.app.entities.Library;

public interface ILibraryServices {
	List<Library> getAllBooks();
	Library addBook(Library book);
	String deleteBookById(Long id);
	String updateBook(Library l);
	List<Library> getBookByGenre(Genre genre);
//	String deleteByGenre(Genre genre);
//	String deleteByGenre(Library library);

}
