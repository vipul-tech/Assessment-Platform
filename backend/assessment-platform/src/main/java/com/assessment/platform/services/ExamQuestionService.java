package com.assessment.platform.services;

import com.assessment.platform.entities.Question;

public interface ExamQuestionService {
	
	Question addExamQuestion(Question question);
	
	Question getExamQuestionById(int questionId);
	
	void deleteQuestion(Question question);

}
