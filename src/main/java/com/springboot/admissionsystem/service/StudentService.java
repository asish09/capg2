package com.springboot.admissionsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.admissionsystem.entity.Student;
import com.springboot.admissionsystem.repository.StudentRepository;



@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudent(){
		return studentRepository.findAll();
	}
	
	public String addStudent(Student student) {
		studentRepository.save(student);
		return "Student Added";
	}
	
	public Student findByEmail(Student student) {
		Student s = studentRepository.findByEmail(student.getEmail());
		return s;
	} 
	
	public String updateStudentById(Student student, int id) {
		student.setId(id);
		studentRepository.save(student);
		return "Student Updated";
	}
	public Student getStudentById(int id) {
		return studentRepository.findById(id).get();
	}
	public Student getStudentByName(String Name) {
		return studentRepository.findByName(Name);
	}
	
	public void deleteStudentById(int id) {
		studentRepository.deleteById(id);
	}
}
