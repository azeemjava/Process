package in.triton.all.request;

import java.util.List;

import in.triton.all.entity.Course;
import lombok.Data;

@Data
public class CoursesRequest {
	
	private List<Course> courses;

}
