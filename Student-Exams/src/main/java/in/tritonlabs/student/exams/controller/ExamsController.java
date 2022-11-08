package in.tritonlabs.student.exams.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.tritonlabs.student.exams.entity.Exams;
import in.tritonlabs.student.exams.request.StudentExaminationAddRequest;
import in.tritonlabs.student.exams.service.impl.ExamsServiceImpl;

@RestController
@RequestMapping("api/v1/exams")
public class ExamsController {

	@Autowired
	ExamsServiceImpl examService;

	@GetMapping("/")
	public List<Exams> readAll() {
		return examService.readAll();
	}

	@GetMapping("/{id}")
	public Optional<Exams> readOne(@PathVariable("id") long id) {

		
		return examService.readOne(id);

	}

	@PostMapping("/")
	public ResponseEntity<Exams> create(@RequestBody List<Exams> exams) {

		examService.create(exams);

		return new ResponseEntity<>(HttpStatus.OK);
	}

}
