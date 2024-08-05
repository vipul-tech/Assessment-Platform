package com.assessment.platform.resource;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.assessment.platform.dto.AddQuestionDto;
import com.assessment.platform.dto.QuestionsResponseDto;
import com.assessment.platform.entities.Exam;
import com.assessment.platform.entities.Question;
import com.assessment.platform.services.CourseService;
import com.assessment.platform.services.ExamQuestionService;
import com.assessment.platform.services.ExamService;
import com.assessment.platform.services.GradeService;
import com.assessment.platform.services.UserService;
import com.assessment.platform.utility.Constants.ActiveStatus;

import jakarta.transaction.Transactional;

@Component
@Transactional
public class ExamQuestionResource {

	private final Logger LOG = LoggerFactory.getLogger(ExamResource.class);

	@Autowired
	private CourseService courseService;

	@Autowired
	private UserService userService;

	@Autowired
	private GradeService gradeService;

	@Autowired
	private ExamQuestionService examQuestionService;

	@Autowired
	private ExamService examService;

	public Logger getLOG() {
		return LOG;
	}

	public CourseService getCourseService() {
		return courseService;
	}

	public UserService getUserService() {
		return userService;
	}

	public GradeService getGradeService() {
		return gradeService;
	}

	public ExamQuestionService getExamQuestionService() {
		return examQuestionService;
	}

	public ExamService getExamService() {
		return examService;
	}

	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void setGradeService(GradeService gradeService) {
		this.gradeService = gradeService;
	}

	public void setExamQuestionService(ExamQuestionService examQuestionService) {
		this.examQuestionService = examQuestionService;
	}

	public void setExamService(ExamService examService) {
		this.examService = examService;
	}

	public ResponseEntity<QuestionsResponseDto> addExamQuestion(AddQuestionDto request) {

		LOG.info("Request received for add exam question");

		QuestionsResponseDto response = new QuestionsResponseDto();

		if (request == null || request.getExamId() == 0) {
			response.setResponseMessage("missing input or bad request");
			response.setSuccess(false);

			return new ResponseEntity<QuestionsResponseDto>(response, HttpStatus.BAD_REQUEST);
		}

		Exam exam = this.examService.getExamById(request.getExamId());

		if (exam == null) {
			response.setResponseMessage("Exam not found");
			response.setSuccess(false);

			return new ResponseEntity<QuestionsResponseDto>(response, HttpStatus.BAD_REQUEST);
		}

		List<Question> questions = exam.getQuestions();

		if (!AddQuestionDto.validate(request)) {
			response.setQuestions(questions);
			response.setResponseMessage("missing input or bad request");
			response.setSuccess(false);

			return new ResponseEntity<QuestionsResponseDto>(response, HttpStatus.BAD_REQUEST);
		}

		Question question = AddQuestionDto.toQuestionEntity(request);

		if (question == null) {
			response.setQuestions(questions);
			response.setResponseMessage("Question not found");
			response.setSuccess(false);

			return new ResponseEntity<QuestionsResponseDto>(response, HttpStatus.BAD_REQUEST);
		}

		question.setCorrectAnswer(request.getCorrectAnswer());
		question.setStatus(ActiveStatus.ACTIVE.value());
		question.setExams(Arrays.asList(exam));

		Question updateQuestion = this.examQuestionService.addExamQuestion(question);

		if (updateQuestion == null) {
			response.setQuestions(questions);
			response.setResponseMessage("Failed to add exam question");
			response.setSuccess(false);

			return new ResponseEntity<QuestionsResponseDto>(response, HttpStatus.BAD_REQUEST);
		}

		questions.add(updateQuestion);
		
		for (Question q : questions) {
			q.setCorrectAns(q.getCorrectAnswer());
			q.setAnswer(5);
		}
		
		response.setQuestions(questions);
		response.setResponseMessage("Exam Question Added Successfully");
		response.setSuccess(true);

		return new ResponseEntity<QuestionsResponseDto>(response, HttpStatus.OK);

	}

	public ResponseEntity<QuestionsResponseDto> deleteExamQuestion(int questionId) {

		LOG.info("Request received for deleting the Question using Id");

		QuestionsResponseDto response = new QuestionsResponseDto();

		if (questionId == 0) {
			response.setResponseMessage("missing input or bad request");
			response.setSuccess(false);

			return new ResponseEntity<QuestionsResponseDto>(response, HttpStatus.BAD_REQUEST);
		}

		Question question = this.examQuestionService.getExamQuestionById(questionId);

		if (question == null) {
			response.setResponseMessage("Question not found");
			response.setSuccess(false);

			return new ResponseEntity<QuestionsResponseDto>(response, HttpStatus.BAD_REQUEST);
		}
		
		// Remove the question from associated exams
		for (Exam exam : question.getExams()) {
		    exam.getQuestions().remove(question);
		}

		this.examQuestionService.deleteQuestion(question);
		
		response.setResponseMessage("Exam Questions Deleted Successful");
		response.setSuccess(true);

		return new ResponseEntity<QuestionsResponseDto>(response, HttpStatus.OK);

	}

}
