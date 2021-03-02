package com.caseStudy.salesProcessingservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CustomResponse {
	private int httpStatus;
	private String message;
	private Object object;
}


//remove CustomResponse.java
//remove QuotationSaveFail.java
//remove QuotationRetrieveFail.java
//remove ExceptionController.java
//change serviceImpl.java to old one
// also make changes in controller class