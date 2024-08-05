package com.assessment.platform.dto;


import java.util.ArrayList;
import java.util.List;

import com.assessment.platform.entities.CommonApiResponse;
import com.assessment.platform.entities.Question;

public class QuestionsResponseDto extends CommonApiResponse {

	private List<Question> questions = new ArrayList<>();

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

}
