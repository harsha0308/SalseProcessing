package com.caseStudy.salesProcessingservice.ExceptionHandling;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.caseStudy.salesProcessingservice.Model.QuotationInfo;
import com.caseStudy.salesProcessingservice.Repository.QuotationInfoRepository;
import com.caseStudy.salesProcessingservice.Service.SalesProcessingServiceImpl;

@SpringBootTest
class QuotationRetrieveFailExceptionTest {

	@Mock 
	private QuotationInfoRepository quotationInfoRepository;
	@InjectMocks
	private SalesProcessingServiceImpl salesProcessingServiceImpl;
	
	
	@Test
	void testQuotationRetrieveFailException() {
		
		QuotationInfo quotationInfo = new QuotationInfo(1L,"Harsha","Jamshedpur","9087654321","harsha@gmail.com","LIC",9000);
		Optional<QuotationInfo> data = Optional.of(quotationInfo);
		when(quotationInfoRepository.findById(1L)).thenReturn(data);
		QuotationRetrieveFailException quotationRetrieveFailException = assertThrows(QuotationRetrieveFailException.class,() -> salesProcessingServiceImpl.getQuotation(2L));
		assertTrue(quotationRetrieveFailException.getMessage().contains("quote id not present"));
		
	}

}
