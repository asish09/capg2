package com.springboot.admissionsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name="college")
public class College {
		
	
			@Id
			
			private int id;
			
			@Column(name="college_name")
			private String collegeName;
			
			@Column(name="branch")
			private String branch;
			
			
			
			public College(int id, String collegeName, String branch) {
				super();
				this.id = id;
				this.collegeName = collegeName;
				this.branch=branch;
			}

			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

		

			public String getCollegeName() {
				return collegeName;
			}

			public void setCollegeName(String collegeName) {
				this.collegeName = collegeName;
			}

			
			
			public String getBranch() {
				return branch;
			}

			public void setBranch(String branch) {
				this.branch = branch;
			}
			public College() {
				super();
			}

	
				
				
			}
			
		