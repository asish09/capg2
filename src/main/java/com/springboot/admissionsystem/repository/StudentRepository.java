package com.springboot.admissionsystem.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.admissionsystem.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	Student findByEmail(String email);
	Student findByName(String Name);
}