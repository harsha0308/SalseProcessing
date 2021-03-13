package com.caseStudy.salesProcessingservice.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.caseStudy.salesProcessingservice.Model.CustomResponse;


class ExceptionControllerTest {


	private ExceptionController exceptionController = new ExceptionController();
	
	@Test
	void quotationSavedFailedExceptionTest() 
	{
		QuotationSaveFailedException qsfe1 = new QuotationSaveFailedException("Quote not saved");
		ResponseEntity<CustomResponse> customResponse1 = exceptionController.customerInsertionFailedException(qsfe1);
		HttpStatus hs = customResponse1.getStatusCode();
		assertEquals(HttpStatus.NOT_FOUND,hs);
		/*
		 * int value= customResponse1.getStatusCodeValue(); 
		 * assertEquals(404,value);
		 */	
	}
	@Test
	void quotationRetrieveFailedExceptionTest() 
	{
		QuotationRetrieveFailException qrfe1 = new QuotationRetrieveFailException("Quote id not present");
		ResponseEntity<CustomResponse> customResponse1 = exceptionController.customerNotfoundException(qrfe1);
		HttpStatus hs = customResponse1.getStatusCode();
		assertEquals(HttpStatus.NOT_FOUND,hs);
		
	}

}
