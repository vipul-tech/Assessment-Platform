package com.assessment.platform.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessment.platform.entities.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
	
}
