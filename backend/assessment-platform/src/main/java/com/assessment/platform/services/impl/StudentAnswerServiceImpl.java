package com.assessment.platform.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.platform.entities.Exam;
import com.assessment.platform.entities.Question;
import com.assessment.platform.entities.StudentAnswer;
import com.assessment.platform.entities.User;
import com.assessment.platform.repositories.StudentAnswerRepository;
import com.assessment.platform.services.StudentAnswerService;

@Service
public class StudentAnswerServiceImpl implements StudentAnswerService {

	@Autowired
	private StudentAnswerRepository studentAnswerRepository;

	@Override
	public StudentAnswer addAnswer(StudentAnswer answer) {
		return studentAnswerRepository.save(answer);
	}

	@Override
	public StudentAnswer getAnswer(int answerId) {
		Optional<StudentAnswer> optionalAnswer = studentAnswerRepository.findById(answerId);

		if (optionalAnswer.isPresent()) {
			return optionalAnswer.get();
		} else {
			return null;
		}
	}

	@Override
	public StudentAnswer getAnswerByQuestion(Question question) {
		return studentAnswerRepository.findByQuestion(question);
	}

	@Override
	public List<StudentAnswer> getAllAnswerByExam(Exam exam) {
		return studentAnswerRepository.findByExam(exam);
	}

	@Override
	public List<StudentAnswer> addAnswers(List<StudentAnswer> answers) {
		return studentAnswerRepository.saveAll(answers);
	}

	@Override
	public List<StudentAnswer> getByExamAndStudent(Exam exam, User student) {
		return studentAnswerRepository.findByExamAndStudent(exam, student);

	}

}
