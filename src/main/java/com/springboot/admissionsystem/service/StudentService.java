package com.springboot.admissionsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.admissionsystem.entity.Student;
import com.springboot.admissionsystem.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;

	
	public boolean validateUser(String userid, String password) {
		return userid.equalsIgnoreCase("user")
				&& password.equalsIgnoreCase("password");
		
	}

	public void savestudent(String student_name, String date_of_birth, String email, String phone, String father_name, String mother_name, String address) {
		Student s = new Student();
		s.setStudent_name(student_name);
		s.setDate_of_birth(date_of_birth);
		s.setEmail(email);
		s.setPhone(phone);
		s.setFather_name(father_name);
		s.setMother_name(mother_name);
		s.setAddress(address);
		studentRepository.save(s);
	}
}

