package com.caseStudy.salesProcessingservice.Model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;


@SpringBootTest
class ErrorDetailsTest {


	@Test
	void testErrorDetails() throws Exception{
		List<String> list1 = new ArrayList<>();
		list1.add("Error 1");
		list1.add("Error 2");
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setStatus(HttpStatus.OK);
		errorDetails.setMessage("Message");
		errorDetails.setErrors(list1);
		assertEquals(HttpStatus.OK,errorDetails.getStatus());
	}

	@Test
	void testErrorDetails1() throws Exception{
		List<String> list1 = new ArrayList<>();
		list1.add("Error 1");
		list1.add("Error 2");
		ErrorDetails errorDetails = new ErrorDetails(HttpStatus.OK,"Message",list1);
		assertEquals("Message",errorDetails.getMessage());
	}
	
	@Test
	void testErrorDetails2() throws Exception{
		List<String> list1 = new ArrayList<>();
		list1.add("Error 1");
		list1.add("Error 2");
		ErrorDetails errorDetails = new ErrorDetails(HttpStatus.OK,"Message",list1);
		List<String> list2 = new ArrayList<>();
		list2.add("Error 1");
		list2.add("Error 2");
		assertEquals(list2,errorDetails.getErrors());
	}
	
	/*
	@Test
	void testErrorDetails9() throws Exception{
		List<String> list1 = new ArrayList<>();
		list1.add("Error 1");
		list1.add("Error 2");
		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setStatus(HttpStatus.OK);
		errorDetails.setMessage("Message");
		errorDetails.setErrors(list1);
		assertEquals(HttpStatus.OK,errorDetails.getStatus());
		assertEquals("Message",errorDetails.getMessage());
		List<String> list2 = new ArrayList<>();
		list2.add("Error 1");
		list2.add("Error 2");
		assertEquals(list2,errorDetails.getErrors());
	}*/

}
