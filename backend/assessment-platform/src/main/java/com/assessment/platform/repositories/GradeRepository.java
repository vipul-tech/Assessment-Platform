package com.assessment.platform.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessment.platform.entities.Grade;

@Repository
public interface GradeRepository extends JpaRepository<Grade, Integer> {

	List<Grade> findByStatus(String status);
	
}
