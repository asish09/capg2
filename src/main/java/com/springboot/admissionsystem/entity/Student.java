package com.springboot.admissionsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	
	private int id;
	@Column(name="name")
	private String name;
	@Column (name="mobile_number")
	private long mobileNumber;
	@Column (name="email")
	private String email;
	@Column (name="password")
	private String password;
	@Column (name="confirm_password")
	private String confirmPassword;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public Student(int id, String name, long mobileNumber, String email, String password, String confirmPassword) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	public Student() {
		super();
		
	}
	
	

}