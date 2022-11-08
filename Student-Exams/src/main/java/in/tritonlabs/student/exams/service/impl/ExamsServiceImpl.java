package in.tritonlabs.student.exams.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.tritonlabs.student.exams.entity.Exams;
import in.tritonlabs.student.exams.entity.Student;
import in.tritonlabs.student.exams.repository.IExamRepository;
import in.tritonlabs.student.exams.request.StudentExaminationAddRequest;
import in.tritonlabs.student.exams.service.IExamService;

@Service
public class ExamsServiceImpl implements IExamService {

	@Autowired
	IExamRepository examRepo;

	public List<Exams> readAll() {
		return examRepo.findAll();
	}

	public Optional<Exams> readOne(long id) {
		return examRepo.findById(id);
	}

	public List<Exams> create(List<Exams> exams) {

		return examRepo.saveAll(exams);

	}

}
