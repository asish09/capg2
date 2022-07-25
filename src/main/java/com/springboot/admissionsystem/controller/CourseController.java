package com.springboot.admissionsystem.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.admissionsystem.entity.Course;
import com.springboot.admissionsystem.service.CourseService;
@RestController
@CrossOrigin(origins = "http://localhost:8085/")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping("/course")
	public List<Course> getAllCourse(){
		return courseService.getAllCourse();
	}
	
	@PostMapping("/course/add")
	public ResponseEntity<?> addCourse(@RequestBody Course c) {
		System.out.println(c.getCid() + " || " + c.getCourseName() + " || " + c.getDuration());
		courseService.addCourse(c);
		return ResponseEntity.ok(c);
	}
	
	@PutMapping("/course/{id}")
	public String updateCourseById(@RequestBody Course c,@PathVariable int cid) {
		return courseService.updateCourseById(cid , c);
	}
	
	// @GetMapping("course/duration")
	// public ResponseEntity<List<Course>> getCourseByDuration(@RequestParam Long duration){
	// 	return new ResponseEntity<List<Course>>(CourseService.getCourseByDuration(duration),HttpStatus.OK) ;
	// }
	
	@DeleteMapping("/course/delete/{id}")
	public void deleteById(@PathVariable int cid) {
		courseService.deleteById(cid);
	}
	
	@GetMapping("course/courseName")
	public List<Course> getCourseByName(@RequestParam String courseName) {
		return courseService.getCourseByName(courseName);
	}
	
}