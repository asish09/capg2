package com.springboot.admissionsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="course")
public class Course {

	@Id
	@Column (name="id")
	private int id;
	
	@Column(name="course_name")
	private String courseName;
	
	@Column(name="duration")
	private long duration;
	
	
	public Course(int id, String courseName, long duration) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.duration=duration;
	}

	

	public int getCid() {
		return id;
	}



	public void setCid(int id) {
		this.id = id;
	}



	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	
	
	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}
	public Course() {
		super();
	}
	
}