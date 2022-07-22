package com.springboot.admissionsystem.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import com.springboot.admissionsystem.entity.College;
@Repository
public interface CollegeRepository extends CrudRepository<College, String>{
	
}
