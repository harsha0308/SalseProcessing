package com.caseStudy.salesProcessingservice.Model;

import java.util.List;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ErrorDetails {

	
	private HttpStatus status;
    private String message;
    private List<String> errors;

	   
	
}
