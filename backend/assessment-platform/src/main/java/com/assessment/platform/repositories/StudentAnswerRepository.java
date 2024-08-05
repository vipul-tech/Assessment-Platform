package com.assessment.platform.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessment.platform.entities.Exam;
import com.assessment.platform.entities.Question;
import com.assessment.platform.entities.StudentAnswer;
import com.assessment.platform.entities.User;

@Repository
public interface StudentAnswerRepository extends JpaRepository<StudentAnswer, Integer> {
	
	List<StudentAnswer> findByExam(Exam exam);
	
	StudentAnswer findByQuestion(Question question);
	
	List<StudentAnswer> findByExamAndStudent(Exam exam, User student);

}
