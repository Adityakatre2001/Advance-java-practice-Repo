package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "railways")

public class Railway {
	
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	private String Name;
	@Enumerated(EnumType.STRING)
	private Category cat;
	private LocalDate Start_time;
	private LocalDate End_time;
	private String Source;
	private String Destiation;
	private String station_code;
	private int Distance;
	private int Frequency;
	
	
	public Railway() {
		super();
	}
	public Railway(long id, String name, Category cat, LocalDate start_time, LocalDate end_time, String source,
			String destiation, String station_code, int distance, int frequency) {
		super();
		Id = id;
		Name = name;
		this.cat = cat;
		Start_time = start_time;
		End_time = end_time;
		Source = source;
		Destiation = destiation;
		this.station_code = station_code;
		Distance = distance;
		Frequency = frequency;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Category getCat() {
		return cat;
	}
	public void setCat(Category cat) {
		this.cat = cat;
	}
	public LocalDate getStart_time() {
		return Start_time;
	}
	public void setStart_time(LocalDate start_time) {
		Start_time = start_time;
	}
	public LocalDate getEnd_time() {
		return End_time;
	}
	public void setEnd_time(LocalDate end_time) {
		End_time = end_time;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestiation() {
		return Destiation;
	}
	public void setDestiation(String destiation) {
		Destiation = destiation;
	}
	public String getStation_code() {
		return station_code;
	}
	public void setStation_code(String station_code) {
		this.station_code = station_code;
	}
	public int getDistance() {
		return Distance;
	}
	public void setDistance(int distance) {
		Distance = distance;
	}
	public int getFrequency() {
		return Frequency;
	}
	public void setFrequency(int frequency) {
		Frequency = frequency;
	}
	
	
	@Override
	public String toString() {
		return "Railway [Id=" + Id + ", Name=" + Name + ", cat=" + cat + ", Start_time=" + Start_time + ", End_time="
				+ End_time + ", Source=" + Source + ", Destiation=" + Destiation + ", station_code=" + station_code
				+ ", Distance=" + Distance + ", Frequency=" + Frequency + "]";
	}
	
	
	
	
	

	

}
