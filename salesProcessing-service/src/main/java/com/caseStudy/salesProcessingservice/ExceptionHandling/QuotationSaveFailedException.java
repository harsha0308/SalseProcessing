package com.caseStudy.salesProcessingservice.ExceptionHandling;

public class QuotationSaveFailedException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public QuotationSaveFailedException(String message) {
		super(message);
		
	}

	
}
