package com.caseStudy.salesProcessingservice.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

class CustomExceptionHandlerTest {

	private CustomExceptionHandler customeExceptionHandler = new CustomExceptionHandler();
	private ConstraintViolationException cve = new ConstraintViolationException("Error", new HashSet<ConstraintViolation<?>>() );
	
	/*@Test
	void testCustomExceptionHandler()
	{
		Set<ConstraintViolation<?>> constraintViolations = new HashSet<>(); 
		constraintViolations.addAll(constraintViolations);
		constraintViolations.addAll(constraintViolations);
		ConstraintViolationException cve = new ConstraintViolationException("Error", constraintViolations );
		ResponseEntity<Object> response = customeExceptionHandler.handleConstraintViolationException(cve);
		//System.out.println(response);
		HttpStatus hs = response.getStatusCode();
		//System.out.println(hs);
		assertEquals(HttpStatus.BAD_REQUEST,hs);
		int value= response.getStatusCodeValue();
		assertEquals(400,value);
	}*/
	@Test
	void testCustomExceptionHandler1()
	{
		/*Set<ConstraintViolation<?>> constraintViolations = new HashSet<>(); 
		constraintViolations.addAll(constraintViolations);
		constraintViolations.addAll(constraintViolations);
		ConstraintViolationException cve = new ConstraintViolationException("Error", constraintViolations );
		ResponseEntity<Object> response = customeExceptionHandler.handleConstraintViolationException(cve);
		//System.out.println(response);
		HttpStatus hs = response.getStatusCode();
		//System.out.println(hs);
		assertEquals(HttpStatus.BAD_REQUEST,hs);
		int value= response.getStatusCodeValue();
		assertEquals(400,value);*/
		
		List<String> errorMessages = new ArrayList<>();
		for(ConstraintViolation<?> constraintViolation : cve.getConstraintViolations()) {
			errorMessages.add(constraintViolation.getPropertyPath()+":"+constraintViolation.getMessage()+" Value given bt you is "+constraintViolation.getInvalidValue());
		}
		ResponseEntity<?> response1 = customeExceptionHandler.handleConstraintViolationException(cve);
		assertEquals(HttpStatus.BAD_REQUEST,response1.getStatusCode());
	}
	

}
