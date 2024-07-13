package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity 
//@Table(name="Libraries")
public class Library {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String Title;
	@NotBlank
	private String Author;
	@NotNull
	@Enumerated(EnumType.STRING)
	private Genre genre;
	@NotNull
	private LocalDate publishedDate;
	@NotBlank
	private String isbn;
	@NotNull
	private Long pages;
	@NotBlank
	private String Language;
	public Library() {
		super();
	}
	public Library(Long id, @NotBlank String title, @NotBlank String author, @NotNull Genre genre,
			@NotNull LocalDate publishedDate, @NotBlank String isbn, @NotNull Long pages, @NotBlank String language) {
		super();
		this.id = id;
		Title = title;
		Author = author;
		this.genre = genre;
		this.publishedDate = publishedDate;
		this.isbn = isbn;
		this.pages = pages;
		Language = language;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public Genre getGenre() {
		return genre;
	}
	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public LocalDate getPublishedDate() {
		return publishedDate;
	}
	public void setPublishedDate(LocalDate publishedDate) {
		this.publishedDate = publishedDate;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public Long getPages() {
		return pages;
	}
	public void setPages(Long pages) {
		this.pages = pages;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	@Override
	public String toString() {
		return "Library [id=" + id + ", Title=" + Title + ", Author=" + Author + ", genre=" + genre + ", publishedDate="
				+ publishedDate + ", isbn=" + isbn + ", pages=" + pages + ", Language=" + Language + "]";
	}
	
	
	
	
	
	

	
	

}
