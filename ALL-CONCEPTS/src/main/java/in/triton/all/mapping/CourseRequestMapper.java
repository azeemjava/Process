package in.triton.all.mapping;

import java.util.List;
import org.springframework.stereotype.Component;
import in.triton.all.entity.Course;
import in.triton.all.request.CourseRequest;
import jakarta.validation.Valid;


@Component
public class CourseRequestMapper {

	public  Course modelToEntitys(@Valid CourseRequest courseRequest) {
		
		Course course=new Course();
		course.setName(courseRequest.getCourseName());
		return course;
		
		
	}
	
	

}
