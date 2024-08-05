package com.assessment.platform.services;

import java.util.List;

import com.assessment.platform.entities.Exam;
import com.assessment.platform.entities.Question;
import com.assessment.platform.entities.StudentAnswer;
import com.assessment.platform.entities.User;

public interface StudentAnswerService {
	
	StudentAnswer addAnswer(StudentAnswer answer);
	
	StudentAnswer getAnswer(int answerId);
	
	StudentAnswer getAnswerByQuestion(Question question);
	
	List<StudentAnswer> getAllAnswerByExam(Exam exam);
	
	List<StudentAnswer> addAnswers(List<StudentAnswer> answers);
	
	List<StudentAnswer> getByExamAndStudent(Exam exam, User student);


}
