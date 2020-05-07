package com.vp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class JobExceptionController {
	

	@ExceptionHandler(value=JobNotFoundException.class)
	public ResponseEntity<Object> exception(JobNotFoundException exception)
	{
		return new ResponseEntity<>("Job Not Found",HttpStatus.NOT_FOUND);
	}
}
