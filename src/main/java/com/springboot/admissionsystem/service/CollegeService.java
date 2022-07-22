package com.springboot.admissionsystem.service;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.springboot.admissionsystem.entity.College;
import com.springboot.admissionsystem.repository.CollegeRepository;
@Service
public class CollegeService {
	@Autowired
	CollegeRepository collegeRepository;
	public List<College> getAllCollege(){
		return (List<College>) collegeRepository.findAll();
		
	}
	public String addCollege(College g) {
		collegeRepository.save(g);
		return "College Added";
	}
//	public String updateCollegeById(College college, int courseId) {
//		course.setCourseId(courseId);
//		courseRepository.save(course);
//		return "Course Updated";
//	}
//	public List<Course> getCourseByDuration(String duration){
//		return courseRepository.findByDuration(duration);
//	}
//	public String deleteById(int courseId) {
//		courseRepository.deleteById(courseId);
//		return "Course deleted";
//	}
//	public List<Course> getCourseByName(String course_name){
//		return courseRepository.findByCourse_name(course_name);
//		
//		
//	}
	
	

}
