package in.tritonlabs.exams.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import in.tritonlabs.exams.entity.Template;
import in.tritonlabs.exams.service.impl.TemplateServiceImpl;

@RestController
@RequestMapping("api/v1/template")
public class TemplateController {
	
	@Autowired
	TemplateServiceImpl templateService;
	
	@GetMapping("/")
	public List<Template> readAll(){
		return templateService.readAll();
	}
	
	@PostMapping("/")
	public Template create(@RequestBody  Template template) {
		Optional<Template> op = templateService.create(template);
		return op.get();
	}

}
