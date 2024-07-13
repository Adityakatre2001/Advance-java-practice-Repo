package com.app.entites;

//import java.util.Locale.Category;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Railway {
	
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String name;
	@Enumerated(EnumType.STRING)
	@NotNull
	private Category cat;
	@NotNull
	private LocalTime start_time;
	@NotNull
	private LocalTime end_time;
	@NotBlank
	private String source;
	@NotBlank
	private String destination;
	@NotBlank
	private String stationCode;
	@NotNull
	private int distance;
	@NotNull
	private int frequency;
	public Railway() {
		super();
	}
	public Railway(Long id, String name, Category cat, LocalTime start_time, LocalTime end_time, String source,
			String destination, String stationCode, int distance, int frequency) {
		super();
		this.id = id;
		this.name = name;
		this.cat = cat;
		this.start_time = start_time;
		this.end_time = end_time;
		this.source = source;
		this.destination = destination;
		this.stationCode = stationCode;
		this.distance = distance;
		this.frequency = frequency;
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
	public Category getCat() {
		return cat;
	}
	public void setCat(Category cat) {
		this.cat = cat;
	}
	public LocalTime getStart_time() {
		return start_time;
	}
	public void setStart_time(LocalTime start_time) {
		this.start_time = start_time;
	}
	public LocalTime getEnd_time() {
		return end_time;
	}
	public void setEnd_time(LocalTime end_time) {
		this.end_time = end_time;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getStationCode() {
		return stationCode;
	}
	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getFrequency() {
		return frequency;
	}
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
	
	
	
	@Override
	public String toString() {
		return "Railway [id=" + id + ", name=" + name + ", cat=" + cat + ", start_time=" + start_time + ", end_time="
				+ end_time + ", source=" + source + ", destination=" + destination + ", stationCode=" + stationCode
				+ ", distance=" + distance + ", frequency=" + frequency + "]";
	}
	
	
	
	
	
	
	
}
