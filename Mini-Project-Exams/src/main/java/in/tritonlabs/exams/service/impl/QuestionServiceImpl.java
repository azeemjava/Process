package in.tritonlabs.exams.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.tritonlabs.exams.entity.Questions;
import in.tritonlabs.exams.entity.Template;
import in.tritonlabs.exams.repository.IQuestionRepository;
import in.tritonlabs.exams.repository.ITemplateRepository;
import in.tritonlabs.exams.service.IQuestionService;

@Service
public class QuestionServiceImpl implements IQuestionService {

	@Autowired
	IQuestionRepository questionRepo;

	public List<Questions> readAll() {
		return questionRepo.findAll();
	}

}
