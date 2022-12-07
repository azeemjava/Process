package in.triton.all.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import in.triton.all.entity.Parent;
import lombok.Data;

@Data
@JsonInclude(value = Include.NON_NULL)
public class StudentResponse {

	private int studentId;
	private String name;
	private String dob;
	private int departmentId;
	private Parent parent;
	
}
