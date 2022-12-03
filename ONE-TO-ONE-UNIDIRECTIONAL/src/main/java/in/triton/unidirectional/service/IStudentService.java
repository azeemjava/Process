package in.triton.unidirectional.service;

import java.util.Optional;
import in.triton.unidirectional.entity.Student;
import in.triton.unidirectional.request.StudentRequet;
import in.triton.unidirectional.response.ApiResponse;

public interface IStudentService {

	public ApiResponse getSort(String field);
	public Student saveAll(Student student);
	public ApiResponse getPaginationWithSort(int ofSet, int pageSize,String sort);
	public ApiResponse getPagination(int ofSet,int pageSize );
	public Student getOne(int id);
	public Optional<Student> update(StudentRequet oneRequet,int id);
	public String delete(int id);	
	public String deleteAll();	

	
	
}
