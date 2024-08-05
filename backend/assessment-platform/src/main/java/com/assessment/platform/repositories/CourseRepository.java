package com.assessment.platform.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessment.platform.entities.Course;
import com.assessment.platform.entities.Grade;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
	
	List<Course> findByGradeAndStatus(Grade grade, String status);
	
	List<Course> findByStatus(String status);											

}
