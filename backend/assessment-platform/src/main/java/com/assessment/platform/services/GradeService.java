package com.assessment.platform.services;


import java.util.List;

import com.assessment.platform.entities.Grade;

public interface GradeService {

	Grade addGrade(Grade grade);

	Grade updateGrade(Grade grade);

	Grade getGradeById(int gradeId);

	List<Grade> getAllGradesByStatus(String status);

}
