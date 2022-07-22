package com.springboot.admissionsystem.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
	
@Entity
public class Student {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int sid;
		public int getSid() {
			return sid;
		}
		public void setSid(int sid) {
			this.sid = sid;
		}
		private String student_name, date_of_birth, email, phone, father_name, mother_name, address;
		public String getStudent_name() {
			return student_name;
		}
		public void setStudent_name(String student_name) {
			this.student_name = student_name;
		}
		public String getDate_of_birth() {
			return date_of_birth;
		}
		public void setDate_of_birth(String date_of_birth) {
			this.date_of_birth = date_of_birth;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public String getFather_name() {
			return father_name;
		}
		public void setFather_name(String father_name) {
			this.father_name = father_name;
		}
		public String getMother_name() {
			return mother_name;
		}
		public void setMother_name(String mother_name) {
			this.mother_name = mother_name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
}
		
		