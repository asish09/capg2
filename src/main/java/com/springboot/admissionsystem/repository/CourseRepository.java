package com.springboot.admissionsystem.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.admissionsystem.entity.Course;
@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{ 
	List<Course> findByDuration(String duration);
	List<Course> findByCourse_name(String course_name);
	}

