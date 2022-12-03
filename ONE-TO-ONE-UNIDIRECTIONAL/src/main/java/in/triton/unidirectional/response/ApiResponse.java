package in.triton.unidirectional.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiResponse  {

	
	private String error;
	private Object data;
	private Object status;
	private long code;

}
