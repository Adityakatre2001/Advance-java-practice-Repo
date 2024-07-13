package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Enumerated(EnumType.STRING)
	private Category category;
	private String address;
	private LocalDate check_in_time;
	private LocalDate check_out_time;
	private int rating;
	@Enumerated(EnumType.STRING)
	private Facilities facility;
	public Hotel(Long id, String name, Category category, String address, LocalDate check_in_time,
			LocalDate check_out_time, int rating, Facilities facility) {
		super();
		this.id = id;
		this.name = name;
	
		this.category = category;
		this.address = address;
		this.check_in_time = check_in_time;
		this.check_out_time = check_out_time;
		this.rating = rating;
		this.facility = facility;
	}
	public Hotel() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getCheck_in_time() {
		return check_in_time;
	}
	public void setCheck_in_time(LocalDate check_in_time) {
		this.check_in_time = check_in_time;
	}
	public LocalDate getCheck_out_time() {
		return check_out_time;
	}
	public void setCheck_out_time(LocalDate check_out_time) {
		this.check_out_time = check_out_time;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Facilities getFacility() {
		return facility;
	}
	public void setFacility(Facilities facility) {
		this.facility = facility;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", category=" + category + ", address=" + address
				+ ", check_in_time=" + check_in_time + ", check_out_time=" + check_out_time + ", rating=" + rating
				+ ", facility=" + facility + "]";
	}
	
	
	

}
