package in.triton.unidirectional.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import in.triton.unidirectional.entity.Student;
import in.triton.unidirectional.mapping.StudentRequestMapper;
import in.triton.unidirectional.mapping.StudentResponseMapper;
import in.triton.unidirectional.request.StudentRequet;
import in.triton.unidirectional.response.ApiResponse;
import in.triton.unidirectional.response.StudentResponse;
import in.triton.unidirectional.service.IStudentService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("api/v1/student")
public class StudentController {

	@Autowired
	IStudentService studentService;

	@Autowired
	StudentRequestMapper requestMapper;

	@Autowired
	StudentResponseMapper studentResponseMapper;

	@PostMapping("/")
	public ResponseEntity<String> saveAll(@Valid @RequestBody StudentRequet studentRequet) {
		Student student = requestMapper.student(studentRequet);
		studentService.saveAll(student);
		return new ResponseEntity<String>("saved", HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<ApiResponse> getOne(@PathVariable("id") int id) {
		ApiResponse apiResponse = new ApiResponse();
		Student op = studentService.getOne(id);
		StudentResponse studentResponse = studentResponseMapper.getOne(op);
		apiResponse.setData(studentResponse);
		apiResponse.setCode(HttpStatus.OK.value());
		apiResponse.setError(null);
		apiResponse.setStatus("Success");
		return ResponseEntity.ok(apiResponse);
	}

	@GetMapping("/sort/{field}")
	public ResponseEntity<ApiResponse> getSort(@PathVariable("field") String field) {
		ApiResponse apiResponses = studentService.getSort(field);
		return ResponseEntity.ok(apiResponses);
	}
	
	@GetMapping("/pagination/{ofSet}/{pageSize}")
	public ResponseEntity<ApiResponse> getPagination(@PathVariable("ofSet") int ofSet,@PathVariable("pageSize") int pageSize) {
		ApiResponse apiResponses = studentService.getPagination(ofSet,pageSize);
		return ResponseEntity.ok(apiResponses);
	}
	
	@GetMapping("/paginationSort54321/{ofSet}/{pageSize}/{sort}")
	public ResponseEntity<ApiResponse> getPagination(@PathVariable("ofSet") int ofSet,@PathVariable("pageSize") int pageSize,@PathVariable("sort")String sort) {
		ApiResponse apiResponses = studentService.getPaginationWithSort(ofSet,pageSize,sort);
		return ResponseEntity.ok(apiResponses);
	}
	
	 
	

}
