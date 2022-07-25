package com.springboot.admissionsystem.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.admissionsystem.entity.Student;
import com.springboot.admissionsystem.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/student")
	public List<Student> getAllStudent(){
		return studentService.getAllStudent();
	}
	
	@PostMapping("/student/add")
	public ResponseEntity<?> addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
		 Student student1 = studentService.getStudentByName(student.getName());
		 return ResponseEntity.ok(student1);
	}
	
	
	@PutMapping("/student/{id}")
	public String updateUserById(@RequestBody Student student,@PathVariable int id) {
		return studentService.updateStudentById(student, id);
	}
	
	@GetMapping("/student/{id}")
	public Student getAdminStudentById(@PathVariable int id) {
		return studentService.getStudentById(id);
	}
	
	
	@DeleteMapping("/student/delete/{id}")
	public void deleteStudentById(@PathVariable int id) {
		studentService.deleteStudentById(id);
	}
}

