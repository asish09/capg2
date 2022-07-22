package com.springboot.admissionsystem.entity;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {

@Id
		 public int courseId;
		 private String courseName;
		 private String courseDuration;
	   	 private LocalDate courseStartDate;
		 private LocalDate courseEndDate;
		 
		 
		public Course(int courseId, String courseName, String courseDuration, LocalDate courseStartDate,
				LocalDate courseEndDate) {
			super();
			this.courseId = courseId;
			this.courseName = courseName;
			this.courseDuration = courseDuration;
			this.courseStartDate = courseStartDate;
			this.courseEndDate = courseEndDate;
		}
		public int getCourseId() {
			return courseId;
		}
		public void setCourseId(int courseId) {
			this.courseId = courseId;
		}
		public String getCourseName() {
			return courseName;
		}
		public void setCourseName(String courseName) {
			this.courseName = courseName;
		}
		public String getCourseDuration() {
			return courseDuration;
		}
		public void setCourseDuration(String courseDuration) {
			this.courseDuration = courseDuration;
		}
		public LocalDate getCourseStartDate() {
			return courseStartDate;
		}
		public void setCourseStartDate(LocalDate courseStartDate) {
			this.courseStartDate = courseStartDate;
		}
		public LocalDate getCourseEndDate() {
			return courseEndDate;
		}
		public void setCourseEndDate(LocalDate courseEndDate) {
			this.courseEndDate = courseEndDate;
		}
		@Override
		public String toString() {
			return "courses [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration=" + courseDuration
					+ ", courseStartDate=" + courseStartDate + ", courseEndDate=" + courseEndDate + "]";
		}
		

	

}
