package in.triton.unidirectional.response;


import lombok.Data;

@Data
public class StudentResponse {

	private String name;
	private int age;
	private String email;
	private String dept;
	private AdharCardResponse adharCard;

	
	
}
