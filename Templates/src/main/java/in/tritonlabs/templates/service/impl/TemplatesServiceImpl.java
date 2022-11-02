package in.tritonlabs.templates.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.tritonlabs.templates.entity.Question;
import in.tritonlabs.templates.entity.Templates;
import in.tritonlabs.templates.repository.ITemplatesRepositroy;
import in.tritonlabs.templates.request.TemplatesRequest;

@Service
public class TemplatesServiceImpl {

	@Autowired
	ITemplatesRepositroy templateRepo;

	public List<Templates> findAll() {
		return templateRepo.findAll();
	}

	public Optional<Templates> findId(long id) {
		if (templateRepo.existsById(id)) {
			return templateRepo.findById(id);
		} else {
			return Optional.empty();
		}
	}

	public Optional<Templates> create(TemplatesRequest temp) {
		Templates template = new Templates();
		template.setTemplatesName(temp.getTemplatesName());
		template.setTotalMark(temp.getTotalMark());

		List<Question> que = temp.getQuestion();
		Question quest1 = que.get(0);
		Question quest2 = que.get(1);

		quest1.setTemplates(template);
		quest1.setQuestion(quest1.getQuestion());
		quest1.setWeightage(quest1.getWeightage());

		quest2.setTemplates(template);
		quest2.setQuestion(quest2.getQuestion());
		quest2.setWeightage(quest2.getWeightage());

		que.add(quest1);
		que.add(quest2);

		template.setQuestion(que);

		if (templateRepo.existsById(template.getId())) {
			return Optional.empty();

		} else {
			return Optional.of(templateRepo.save(template));

		}
	}

	public Templates update(Templates temp) {

	


		List<Question> que = temp.getQuestion();

		Question quest1 = que.get(0);
		//Question quest2 = que.get(1);

		quest1.setQuestion(quest1.getQuestion());
		quest1.setWeightage(quest1.getWeightage());

		//quest2.setQuestion(quest2.getQuestion());
		//quest2.setWeightage(quest2.getWeightage());

		que.add(quest1);
		//que.add(quest2);

		temp.setQuestion(que);
		

		if (templateRepo.existsById(temp.getId())) {
			quest1.setTemplates(temp);
			return templateRepo.save(temp);


		} else {
			return null;

		}
	}

	public String delete(long id) {
		if (templateRepo.existsById(id)) {
			templateRepo.deleteById(id);
			return "Deleted";
		} else {
			return "Does not record";
		}

	}
}
