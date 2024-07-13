package com.app.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Genre;
import com.app.entities.Library;
import com.app.repository.ILibraryRepo;


@Service
@Transactional
public class LibraryService implements ILibraryServices {

	@Autowired
	private ILibraryRepo iLibraryRepo;
	
	@Override
	public List<Library> getAllBooks() {
		
		return iLibraryRepo.findAll().stream().collect(Collectors.toList());
	}

	@Override
	public Library addBook(Library book) {
		
		return iLibraryRepo.save(book);
	}

	@Override
	public String deleteBookById(Long id) {
	if(iLibraryRepo.existsById(id)) {
		iLibraryRepo.deleteById(id);
		return "Book Deleted SucessFully";
	}
		return "Invalid Id";
	}

	@Override
	public String updateBook(Library l) {
		if(iLibraryRepo.existsById(l.getId()))
		{
			iLibraryRepo.save(l);
			return "Book Updated Sucessfully";
		}
		return "Book not updated";
	}

	@Override
	public List<Library> getBookByGenre(Genre genre) {
	
		return iLibraryRepo.getBookByGenre(genre);
	}

	

}
