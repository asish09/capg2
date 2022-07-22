package com.springboot.admissionsystem.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.admissionsystem.entity.Student;
@Repository

public interface StudentRepository extends CrudRepository<Student, Integer>{
	

	}


