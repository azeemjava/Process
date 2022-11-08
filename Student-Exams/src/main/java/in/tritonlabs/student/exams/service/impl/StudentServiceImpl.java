package in.tritonlabs.student.exams.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.tritonlabs.student.exams.entity.Student;
import in.tritonlabs.student.exams.repository.IStudentRepository;
import in.tritonlabs.student.exams.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {
	
	@Autowired
	IStudentRepository studentRepo;

	public List<Student> readAll() {
		return studentRepo.findAll();
	}

	public List<Student> create(List<Student>  student) {
		
	
		return studentRepo.saveAll(student);

	}
	
	

}
