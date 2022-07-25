package com.springboot.admissionsystem.entity;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="university")
public class University {
	
	@Id

	@Column (name="id")
	private int id;
	@Column (name="universityName")
	private String universityName;
	@Column (name="location")
	private String location;
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUniversityName() {
		return this.universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	public University(int id, String universityName, String location ) {
		super();
		this.id =id ;
		this.universityName = universityName;
		this.location=location;
	}
	public University() {
		super();
	}
	
}
