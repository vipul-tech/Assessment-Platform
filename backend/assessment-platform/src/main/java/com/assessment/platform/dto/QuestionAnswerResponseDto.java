package com.assessment.platform.dto;


import java.util.ArrayList;
import java.util.List;

import com.assessment.platform.entities.CommonApiResponse;
import com.assessment.platform.entities.StudentAnswer;

public class QuestionAnswerResponseDto extends CommonApiResponse {

	List<StudentAnswer> questionAnswers = new ArrayList<>();

}
