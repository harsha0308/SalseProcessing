package com.caseStudy.salesProcessingservice.Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
@SpringBootTest
class CustomResponseTest {

	
	
	@Test
	void testCustomResponseModel() throws Exception{
		
		CustomResponse customResponse = new CustomResponse();
		customResponse.setHttpStatus(0);
		customResponse.setMessage("Message");
		customResponse.setObject(HttpStatus.NOT_FOUND);
		assertEquals(0,customResponse.getHttpStatus());
	}
	
	@Test
	void testCustomResponseModel1() throws Exception{
		
		CustomResponse customResponse = new CustomResponse(0,"Message",HttpStatus.NOT_FOUND);
		assertEquals("Message", customResponse.getMessage());
	}
	
	@Test
	void testCustomResponseModel2() throws Exception{
		
		CustomResponse customResponse = new CustomResponse(0,"Message",HttpStatus.NOT_FOUND);
		assertEquals(HttpStatus.NOT_FOUND,customResponse.getObject());
	}

}
