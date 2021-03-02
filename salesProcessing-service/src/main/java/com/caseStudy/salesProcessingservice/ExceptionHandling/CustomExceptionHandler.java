package com.caseStudy.salesProcessingservice.ExceptionHandling;


import java.util.ArrayList;
import java.util.List;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;


import com.caseStudy.salesProcessingservice.Model.ErrorDetails;



@RestControllerAdvice
public class CustomExceptionHandler {
	
	
	@ExceptionHandler(ConstraintViolationException.class)
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	public ResponseEntity<Object> handleConstraintViolationException(ConstraintViolationException cve) {
	  List<String> errors = new ArrayList<String>();
	  for (ConstraintViolation<?> violation : cve.getConstraintViolations()) {
	    errors.add(violation.getPropertyPath().toString() + " : " + violation.getMessage()+"Value entered is : "+violation.getInvalidValue());
	  }
	  
	  ErrorDetails errorDetails = new ErrorDetails(HttpStatus.BAD_REQUEST, cve.getLocalizedMessage() , errors);
	  return ResponseEntity.badRequest().body(errorDetails);
	}
	 
	
	
}
