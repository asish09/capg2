package com.springboot.admissionsystem.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

import com.springboot.admissionsystem.controller.CourseController;
import com.springboot.admissionsystem.entity.Course;
import com.springboot.admissionsystem.service.CourseServiceImpl;

@Controller
//@CrossOrigin(origins = "http://localhost:4200/")
public class CourseController {
	@Autowired
	private CourseServiceImpl courseService;

	@GetMapping("/course")
	public List<Course> getAllCourse(){
		return courseService.getAllCourse();
	}
	
	@PostMapping("/course/add")
	public void addCourse(@RequestBody Course c) {
		courseService.addCourse(c);
	}
	
	@PutMapping("/course/{id}")
	public String updateCourseById(@RequestBody Course c,@PathVariable int courseId) {
		return courseService.updateCourseById(c, courseId);
	}
	
	@GetMapping("course/courseName")
	public ResponseEntity<List<Course>> getCourseByName(@RequestParam String courseName){
		return new ResponseEntity<List<Course>>(courseService.getCourseByName(courseName),HttpStatus.OK) ;
	}
	
	@DeleteMapping("/course/delete/{id}")
	public void deleteById(@PathVariable int courseId) {
		 courseService.deleteById(courseId);
	}
	
	@GetMapping("course/duration")
	public List<Course> getCourseByDuration(@RequestParam String duration) {
		return courseService.getCourseByDuration(duration);
	}
	
}
