package in.tritonlabs.exams.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.tritonlabs.exams.entity.Questions;
import in.tritonlabs.exams.entity.Template;
import in.tritonlabs.exams.repository.ITemplateRepository;
import in.tritonlabs.exams.service.ITemplateService;

@Service
public class TemplateServiceImpl implements ITemplateService {

	@Autowired
	ITemplateRepository tempalteRepo;

	public List<Template> readAll() {
		return tempalteRepo.findAll();
	}

	public Optional<Template> create(Template template) {

		Template templateSet = new Template();
		templateSet.setId(0);
		templateSet.setTemplateName(template.getTemplateName());
		templateSet.setTotalMark(template.getTotalMark());

		List<Questions> questionsList = template.getQuetsions();
		Questions questionsSet0 = questionsList.get(0);
		Questions questionsSet1 = questionsList.get(1);

		if(questionsList.get(0)==null) {
			Questions questionsSet2 = questionsList.get(2);
		}
		else {
			
		}
		

		questionsSet1.setTemplate(templateSet);
		questionsSet1.setId(0);
		questionsSet1.setQuestion(questionsSet1.getQuestion());
		questionsSet1.setWheightage(questionsSet1.getWheightage());

		questionsList.add(questionsSet0);
		questionsList.add(questionsSet1);



		templateSet.setQuetsions(questionsList);

		
	
		 
		return 	Optional.of(tempalteRepo.save(templateSet));

		

	}
}
