package in.tritonlabs.student.exams.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.tritonlabs.student.exams.entity.ExaminationStudent;
import in.tritonlabs.student.exams.entity.Exams;
import in.tritonlabs.student.exams.service.impl.ExaminationStudentService;
import in.tritonlabs.student.exams.service.impl.ExamsServiceImpl;

@RestController
@RequestMapping("api/v1/examinationStudent")
public class ExaminationStudentController {

	@Autowired
	ExaminationStudentService Service;

	@PostMapping("/")
	public void create(@RequestBody ExaminationStudent examinationStudent) {

		long examId = examinationStudent.getExamId();
		long studentId = examinationStudent.getStudentId();

		Service.createOfBoth(examId, studentId);

	}

}
