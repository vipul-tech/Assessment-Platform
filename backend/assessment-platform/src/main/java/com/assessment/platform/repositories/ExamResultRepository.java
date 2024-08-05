package com.assessment.platform.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessment.platform.entities.Exam;
import com.assessment.platform.entities.ExamResult;
import com.assessment.platform.entities.Grade;
import com.assessment.platform.entities.User;

@Repository
public interface ExamResultRepository extends JpaRepository<ExamResult, Integer> {

	List<ExamResult> findByExam(Exam exam);

	List<ExamResult> findByStudent(User student);

	List<ExamResult> findByStudentAndExam(User student, Exam exam);

	List<ExamResult> findByExam_Grade(Grade grade);

}
