package in.triton.unidirectional.mapping;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import in.triton.unidirectional.entity.AdharCard;
import in.triton.unidirectional.entity.Student;
import in.triton.unidirectional.repository.StudentRepository;
import in.triton.unidirectional.response.AdharCardResponse;
import in.triton.unidirectional.response.StudentResponse;

@Component
public class StudentResponseMapper {

	@Autowired
	StudentRepository studentRepository;

	public StudentResponse getOne(Student student) {

		StudentResponse studentResponse = new StudentResponse();
		studentResponse.setName(student.getName());
		studentResponse.setAge(student.getAge());
		studentResponse.setEmail(student.getEmail());

		AdharCard adharCard = student.getAdharCard();
		AdharCardResponse adharCardResponse = new AdharCardResponse();
		adharCardResponse.setAdharId(adharCard.getAdharId());
		studentResponse.setAdharCard(adharCardResponse);
		return studentResponse;

	}
	
	public StudentResponse getAll(Page<Student> studentGet) {
	
		
		
		StudentResponse studentResponse = new StudentResponse();

		//student.stream().forEach(stud -> studentResponse.setName(stud.getName()) );
		
		AdharCardResponse adharCardResponse =new AdharCardResponse();

		studentResponse.setAdharCard(adharCardResponse);
		
		return studentResponse;

	}

}
