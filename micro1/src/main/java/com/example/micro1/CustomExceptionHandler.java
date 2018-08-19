package com.example.micro1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@ControllerAdvice
@RequestMapping(produces = "application/vnd.error+json")
public class CustomExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> notFoundException(Exception e) {
		return new ResponseEntity<String>("Oh no! not again", HttpStatus.OK);
	}

}
