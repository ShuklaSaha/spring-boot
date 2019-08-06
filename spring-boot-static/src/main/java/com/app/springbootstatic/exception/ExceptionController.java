package com.app.springbootstatic.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(HttpServletRequest request,Exception ex) {
		String message="Request:"+request.getRequestURI()+" throws an exception:"+ex;
		System.out.println(message);
		return new ResponseEntity<String>(message,HttpStatus.BAD_REQUEST);
		
	}

}
