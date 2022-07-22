package com.springboot.admissionsystem.entity;


import java.time.LocalDate;

public class Admission {
	
	private int admissionnId;
	private LocalDate admissionDate;
	private Course course;
	private Student student;
	
	
	public Admission(int admissionnId, LocalDate admissionDate, Course course, Student student) {
		super();
		this.admissionnId = admissionnId;
		this.admissionDate = admissionDate;
		this.course = course;
		this.student = student;
	}
	
	
	public int getAdmissionnId() {
		return admissionnId;
	}
	public void setAdmissionnId(int admissionnId) {
		this.admissionnId = admissionnId;
	}
	public LocalDate getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}


	@Override
	public String toString() {
		return "Admission [admissionnId=" + admissionnId + ", admissionDate=" + admissionDate + ", course=" + course
				+ ", student=" + student + "]";
	}
	
	
	
	

}