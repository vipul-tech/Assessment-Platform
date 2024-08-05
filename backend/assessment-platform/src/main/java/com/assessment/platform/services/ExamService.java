package com.assessment.platform.services;

import java.util.List;

import com.assessment.platform.entities.Course;
import com.assessment.platform.entities.Exam;
import com.assessment.platform.entities.Grade;
import com.assessment.platform.entities.User;

public interface ExamService {
	
	Exam addExam(Exam exam);

	Exam updateExam(Exam exam);

	Exam getExamById(int examId);

	List<Exam> getAllExamsByStatus(String status);
	
	List<Exam> getAllExamsByGradeAndStatus(Grade grade, String status);
	
	List<Exam> getAllExamsByCourseAndStatus(Course course, String status);
	
	List<Exam> getAllExamsByTeacherAndStatus(User teacher, String status);
	
	List<Exam> getExamsByGradeAndStartTimeGreaterThanAndStatus(Grade grade, String startTime, String status);	
	
	List<Exam> getExamsByGradeAndStartTimeLessThanAndStatus(Grade grade, String startTime, String status);

	List<Exam> getExamsByGradeAndStartTimeLessThanEqualAndEndTimeGreaterThanEqualAndStatus(Grade grade, String currentTime,
			String currenTime, String status);

}
