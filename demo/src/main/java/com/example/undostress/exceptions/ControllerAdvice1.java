package com.example.undostress.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class ControllerAdvice1 {
	@ExceptionHandler
	public ResponseEntity<String> handleException()
	{
		return new ResponseEntity<String>("{}",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(NoPswdExptn.class)
	
	public ResponseEntity<String> handleNoPwdExptn(NoPswdExptn E)
	{
		return new ResponseEntity<String>(E.getMessage(),HttpStatus.BAD_REQUEST);
	}


}
