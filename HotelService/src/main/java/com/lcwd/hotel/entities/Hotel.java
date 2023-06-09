package com.lcwd.hotel.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@Document(collection = "hotels")
public class Hotel {

	@Id
	@Field("_id")
	private String id;
	private String name;
	private String location;
	private String about;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Hotel(String id, String name, String location, String about) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.about = about;
	}

	public Hotel() {
		super();
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", location=" + location + ", about=" + about + "]";
	}

}
