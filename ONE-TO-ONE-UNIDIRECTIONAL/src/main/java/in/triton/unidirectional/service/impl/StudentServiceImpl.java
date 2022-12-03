package in.triton.unidirectional.service.impl;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import in.triton.unidirectional.entity.Student;
import in.triton.unidirectional.mapping.StudentRequestMapper;
import in.triton.unidirectional.repository.StudentRepository;
import in.triton.unidirectional.request.StudentRequet;
import in.triton.unidirectional.response.ApiResponse;
import in.triton.unidirectional.service.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	StudentRequestMapper studentRequestMapper;

	@Override
	public Student saveAll(Student student) {
		if (studentRepository.existsById(student.getId())) {
			return null;
		} else {
			return studentRepository.save(student);
		}
	}

	@Override
	public Student getOne(int id) throws NotFoundException {
		Student op = studentRepository.findById(id).orElseThrow(() -> new NotFoundException("student with id "+id+" not found"));
		return op;
	}

	@Override
	public ApiResponse getSort(String field) {
		List<Student> page = studentRepository.findAll(Sort.by(Direction.DESC, field));
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setData(page);
		return apiResponse;
	}

	@Override
	public ApiResponse getPagination(int ofSet, int pageSize) {
		Page<Student> page = studentRepository.findAll(PageRequest.of(ofSet, pageSize));
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setData(page);
		return apiResponse;
	}

	@Override
	public ApiResponse getPaginationWithSort(int ofSet, int pageSize, String sort) {
		Page<Student> page = studentRepository.findAll(PageRequest.of(ofSet, pageSize).withSort(Sort.by(Direction.ASC, sort)));
		ApiResponse apiResponse = new ApiResponse();
		apiResponse.setData(page);
		return apiResponse;
	}

	@Override
	public Optional<Student> update(StudentRequet studentRequet, int id) {
		return Optional.empty();
	}

	@Override
	public String delete(int id) {
		return null;
	}

	@Override
	public String deleteAll() {
		return null;
	}

}
