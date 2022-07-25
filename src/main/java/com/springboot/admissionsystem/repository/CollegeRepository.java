package com.springboot.admissionsystem.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.springboot.admissionsystem.entity.College;
@Repository
public interface CollegeRepository extends JpaRepository<College, String> {
	List<College> findByBranch(String branch);
	List<College> findByCollegeName(String collegeName);
	void deleteById(int id);
	


}

