package in.triton.unidirectional.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.webjars.NotFoundException;

import in.triton.unidirectional.response.ApiResponse;

@RestControllerAdvice
public class ExceptionHandling {

	@ExceptionHandler(NotFoundException.class)
	public ApiResponse notFound(NotFoundException e) {
		return new ApiResponse(e.getMessage(), null, "Failure", HttpStatus.NOT_FOUND.value());
	}
	
	
}
