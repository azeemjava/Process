package in.triton.unidirectional.mapping;


import org.springframework.stereotype.Component;

import in.triton.unidirectional.entity.AdharCard;
import in.triton.unidirectional.entity.Student;
import in.triton.unidirectional.request.StudentRequet;

@Component
public class StudentRequestMapper {
	
	public Student student (StudentRequet studentRequet) {
		
			Student student = new Student();
			student.setName(studentRequet.getName());
			student.setEmail(studentRequet.getEmail());
			student.setAge(studentRequet.getAge());
			student.setDept(studentRequet.getDept());

			AdharCard adharCard = studentRequet.getAdharCard();
			adharCard.setStudent(student);
			student.setAdharCard(adharCard);
			return student;
		}
	
}
