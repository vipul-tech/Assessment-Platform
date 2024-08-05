package com.assessment.platform.services;




import java.util.List;

import com.assessment.platform.entities.Exam;
import com.assessment.platform.entities.ExamResult;
import com.assessment.platform.entities.Grade;
import com.assessment.platform.entities.User;

public interface ExamResultService {
	
	ExamResult addResult(ExamResult result);
	
	ExamResult getExamResultById(int resultId);
	
	List<ExamResult> getResultsByStudent(User student);
	
	List<ExamResult> getResultsByStudentAndExam(User student, Exam exam);
	
	List<ExamResult> getResultsByExam(Exam exam);
	
	List<ExamResult> getResultsByGrade(Grade grade);
	
	List<ExamResult> getAllResults();

}
