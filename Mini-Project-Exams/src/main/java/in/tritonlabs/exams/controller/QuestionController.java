package in.tritonlabs.exams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.tritonlabs.exams.entity.Questions;
import in.tritonlabs.exams.entity.Template;
import in.tritonlabs.exams.service.impl.QuestionServiceImpl;
import in.tritonlabs.exams.service.impl.TemplateServiceImpl;

@RestController
@RequestMapping("api/v1/question")
public class QuestionController {

	@Autowired
	QuestionServiceImpl questionService;
	
	@GetMapping("/")
	public List<Questions> readAll(){
		return questionService.readAll();
	}
}
