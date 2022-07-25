package com.springboot.admissionsystem.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.admissionsystem.entity.Admission;

public interface AdmissionRepository extends JpaRepository<Admission, String>{
	List<Admission> findByGender(String gender);
	List<Admission> findByfirstName(String firstName);
	List<Admission> findBylastName(String lastName);
	void deleteById(int id);



}

