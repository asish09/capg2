package com.springboot.admissionsystem.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.admissionsystem.entity.Course;
import com.springboot.admissionsystem.repository.CourseRepository;
@Service
public class CourseService {
	@Autowired
	private CourseRepository courseRepository;
	public List<Course> getAllCourse(){
		return (List<Course>) courseRepository.findAll();
		
	}
	public String addCourse(Course c) {
		courseRepository.save(c);
		return "Course Added";
	}
	
	public String updateCourseById( int cid, Course course) {
		
		course.setCid(cid);
		courseRepository.save(course);
		return "Course Updated";
	}
	public List<Course> getCourseByDuration(Long duration){
		return courseRepository.findByDuration(duration);
	}
	public String deleteById(int cid) {
		courseRepository.deleteById(cid);
		return "course deleted";
	}
	public List<Course> getCourseByName(String courseName){
		return courseRepository.findByCourseName(courseName);
		
		
	}
}
	
	
