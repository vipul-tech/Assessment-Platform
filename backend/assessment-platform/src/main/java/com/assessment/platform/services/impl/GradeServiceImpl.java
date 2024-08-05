package com.assessment.platform.services.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.platform.entities.Grade;
import com.assessment.platform.repositories.GradeRepository;
import com.assessment.platform.services.GradeService;

@Service
public class GradeServiceImpl implements GradeService {

	@Autowired
	private GradeRepository gradeRepository;

	@Override
	public Grade addGrade(Grade grade) {
		return gradeRepository.save(grade);
	}

	@Override
	public Grade updateGrade(Grade grade) {
		return gradeRepository.save(grade);
	}

	@Override
	public Grade getGradeById(int gradeId) {
		Optional<Grade> optionalGrade = gradeRepository.findById(gradeId);

		if (optionalGrade.isPresent()) {
			return optionalGrade.get();
		} else {
			return null;
		}
	}

	@Override
	public List<Grade> getAllGradesByStatus(String status) {
		return this.gradeRepository.findByStatus(status);
	}

}
