package com.springboot.admissionsystem.repository;
import java.util.List;
import com.springboot.admissionsystem.entity.University;
import org.springframework.data.repository.CrudRepository;
public interface UniversityRepository extends CrudRepository<University, Integer> {
	
	List<University> findByLocation(String location);
	List<University> findByUniversity_name(String university_name);

}