package com.assessment.platform.entities;

import java.util.ArrayList;
import java.util.List;

public class ExamResultResponse extends CommonApiResponse {

	private List<ExamResult> results = new ArrayList<>();

	public List<ExamResult> getResults() {
		return results;
	}

	public void setResults(List<ExamResult> results) {
		this.results = results;
	}

}
