package com.springboot.admissionsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.admissionsystem.entity.University;
@Repository
public interface UniversityRepository extends JpaRepository<University, Integer> {
	List<University> getUniversityByLocation(String location);
	List<University> getUniversityByUniversityName(String universityName);
	

}