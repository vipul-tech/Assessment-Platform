package com.assessment.platform.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assessment.platform.entities.Course;
import com.assessment.platform.entities.Exam;
import com.assessment.platform.entities.Grade;
import com.assessment.platform.entities.User;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Integer> {

	List<Exam> findByCourseAndStatus(Course course, String status);

	List<Exam> findByGradeAndStatus(Grade grade, String status);

	List<Exam> findByTeacherAndStatus(User teacher, String status);

	List<Exam> findByStatus(String status);

	List<Exam> findByGradeAndStartTimeGreaterThanAndStatus(Grade grade, String startTime, String status);

	List<Exam> findByGradeAndStartTimeLessThanAndStatus(Grade grade, String startTime, String status);

	List<Exam> findByGradeAndStartTimeLessThanEqualAndEndTimeGreaterThanEqualAndStatus(Grade grade, String currentTime,
			String currenTime, String status);

}
