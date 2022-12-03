package in.triton.unidirectional.request;

import in.triton.unidirectional.entity.AdharCard;
import lombok.Data;

@Data
public class StudentRequet {

	private String name;
	private String email;
	private int age;
	private String dept;
	private AdharCard adharCard;	
	
}
