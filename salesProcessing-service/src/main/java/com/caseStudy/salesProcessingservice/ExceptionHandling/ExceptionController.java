package com.caseStudy.salesProcessingservice.ExceptionHandling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.caseStudy.salesProcessingservice.Model.CustomResponse;

@RestControllerAdvice
public class ExceptionController {

	  @ExceptionHandler(value = QuotationRetrieveFailException.class)
	   public ResponseEntity<CustomResponse> customerNotfoundException(QuotationRetrieveFailException exception) {
	      return new ResponseEntity<>(new CustomResponse(HttpStatus.NOT_FOUND.value(), 
					exception.getMessage(),null), HttpStatus.NOT_FOUND);
	   }
	   
	   @ExceptionHandler(value = QuotationSaveFailedException.class)
	   public ResponseEntity<CustomResponse> customerInsertionFailedException(QuotationSaveFailedException exception) {
	      return new ResponseEntity<>(new CustomResponse(HttpStatus.NOT_FOUND.value(), 
					exception.getMessage(),null), HttpStatus.NOT_FOUND);
	   }
}
