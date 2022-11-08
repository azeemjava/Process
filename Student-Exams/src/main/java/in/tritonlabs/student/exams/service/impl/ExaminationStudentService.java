package in.tritonlabs.student.exams.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.tritonlabs.student.exams.repository.IExamRepository;

@Service
public class ExaminationStudentService {


	@Autowired
	IExamRepository examRepo;

	
	
	public void createOfBoth(long examId,long studentId) {
		
		examRepo.createOfBoth(examId, studentId);
		
	}
	
}
