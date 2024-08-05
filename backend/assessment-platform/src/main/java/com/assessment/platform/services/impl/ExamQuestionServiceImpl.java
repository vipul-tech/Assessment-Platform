package com.assessment.platform.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.platform.entities.Question;
import com.assessment.platform.repositories.QuestionRepository;
import com.assessment.platform.services.ExamQuestionService;

@Service
public class ExamQuestionServiceImpl implements ExamQuestionService {
	
	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public Question addExamQuestion(Question question) {
		return questionRepository.save(question);
	}

	@Override
	public Question getExamQuestionById(int questionId) {
		Optional<Question> optionalQuestion = questionRepository.findById(questionId);

		if (optionalQuestion.isPresent()) {
			return optionalQuestion.get();
		} else {
			return null;
		}
	}

	@Override
	public void deleteQuestion(Question question) {
		questionRepository.delete(question);
	}

}
