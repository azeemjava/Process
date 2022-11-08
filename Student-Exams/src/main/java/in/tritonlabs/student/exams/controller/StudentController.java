package in.tritonlabs.student.exams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.tritonlabs.student.exams.entity.Exams;
import in.tritonlabs.student.exams.entity.Student;
import in.tritonlabs.student.exams.service.impl.ExamsServiceImpl;
import in.tritonlabs.student.exams.service.impl.StudentServiceImpl;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

	@Autowired
	StudentServiceImpl studentService;

	@GetMapping("/")
	public List<Student> readAll() {
		return studentService.readAll();
	}

	@PostMapping("/")
	public ResponseEntity<Student> create(@RequestBody List<Student>  student) {

		studentService.create(student);

		return new ResponseEntity<>(HttpStatus.OK);
	}
}
