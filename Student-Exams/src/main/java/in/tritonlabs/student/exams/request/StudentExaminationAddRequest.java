package in.tritonlabs.student.exams.request;

import java.util.List;
import java.util.Set;

import in.tritonlabs.student.exams.entity.Exams;
import in.tritonlabs.student.exams.entity.Student;

public class StudentExaminationAddRequest {

	private long id;
	private String name;
	private List<Student> student;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	

}
