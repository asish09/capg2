package com.springboot.admissionsystem.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.admissionsystem.entity.Course;
import com.springboot.admissionsystem.repository.CourseRepository;
@Service
public class CourseServiceImpl {
	@Autowired
	CourseRepository courseRepository;
	public List<Course> getAllCourse(){
		return (List<Course>) courseRepository.findAll();
		
	}
	public String addCourse(Course c) {
		courseRepository.save(c);
		return "Course Added";
	}
	public String updateCourseById(Course course, int courseId) {
		course.setCourseId(courseId);
		courseRepository.save(course);
		return "Course Updated";
	}
	public List<Course> getCourseByDuration(String duration){
		return courseRepository.findByDuration(duration);
	}
	public String deleteById(int courseId) {
		courseRepository.deleteById(courseId);
		return "Course deleted";
	}
	public List<Course> getCourseByName(String course_name){
		return courseRepository.findByCourse_name(course_name);
		
		
	}
	
	

}
