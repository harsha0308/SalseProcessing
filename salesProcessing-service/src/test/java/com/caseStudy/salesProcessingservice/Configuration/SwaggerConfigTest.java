package com.caseStudy.salesProcessingservice.Configuration;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SwaggerConfigTest {

	
	private SwaggerConfig swaggerConfiguration = new SwaggerConfig();
	
	
	@Test
	public void config() 
	{
		swaggerConfiguration.apiInfo();
	}

}
