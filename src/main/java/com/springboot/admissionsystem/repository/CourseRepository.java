package com.springboot.admissionsystem.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.admissionsystem.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
	
	List<Course> findByDuration(Long duration);
	List<Course> findByCourseName(String courseName);

}

