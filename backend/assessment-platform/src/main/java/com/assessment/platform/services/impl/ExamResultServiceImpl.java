package com.assessment.platform.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.platform.entities.Exam;
import com.assessment.platform.entities.ExamResult;
import com.assessment.platform.entities.Grade;
import com.assessment.platform.entities.User;
import com.assessment.platform.repositories.ExamResultRepository;
import com.assessment.platform.services.ExamResultService;

@Service
public class ExamResultServiceImpl implements ExamResultService {
	
	@Autowired
	private ExamResultRepository examResultRepository;

	@Override
	public ExamResult addResult(ExamResult result) {
		return examResultRepository.save(result);
	}

	@Override
	public List<ExamResult> getResultsByStudent(User student) {
		return examResultRepository.findByStudent(student);
	}

	@Override
	public List<ExamResult> getResultsByStudentAndExam(User student, Exam exam) {
		return examResultRepository.findByStudentAndExam(student, exam);
	}

	@Override
	public List<ExamResult> getResultsByExam(Exam exam) {
		return examResultRepository.findByExam(exam);
	}

	@Override
	public ExamResult getExamResultById(int resultId) {
		Optional<ExamResult> optionalExamResult = examResultRepository.findById(resultId);

		if (optionalExamResult.isPresent()) {
			return optionalExamResult.get();
		} else {
			return null;
		}
	}

	@Override
	public List<ExamResult> getResultsByGrade(Grade grade) {
		return this.examResultRepository.findByExam_Grade(grade);
	}

	@Override
	public List<ExamResult> getAllResults() {
		return this.examResultRepository.findAll();
	}

}
