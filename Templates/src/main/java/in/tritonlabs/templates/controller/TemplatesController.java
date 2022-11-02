package in.tritonlabs.templates.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import in.tritonlabs.templates.entity.Templates;
import in.tritonlabs.templates.request.TemplatesRequest;
import in.tritonlabs.templates.service.impl.TemplatesServiceImpl;

@RestController
@RequestMapping("api/v1/templates")
public class TemplatesController {

	@Autowired
	TemplatesServiceImpl templatesService;

	@GetMapping("/")
	List<Templates> findAll() {
		return templatesService.findAll();
	}

	@GetMapping("/{id}")
	ResponseEntity<Templates> findID(@PathVariable("id") long id) {
		Optional<Templates> op = templatesService.findId(id);
		if (op.isPresent()) {
			return new ResponseEntity<>(op.get(), HttpStatus.OK);
		} else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@PostMapping("/")
	public String create(@RequestBody TemplatesRequest temp) {

		templatesService.create(temp);

		return "Saved";
	}

	@PutMapping("/{id}")
	public Templates update(@RequestBody Templates temp, @PathVariable("id") long id) {
		temp.setId(id);
		temp = templatesService.update(temp);
		return temp;
	}

	@DeleteMapping("/{id}")
	public String Delete(@PathVariable("id") long id) {

		return templatesService.delete(id);
	}
}
