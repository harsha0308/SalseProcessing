package com.caseStudy.salesProcessingservice.Controller;

//import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.caseStudy.salesProcessingservice.Model.QuotationInfo;
import com.caseStudy.salesProcessingservice.Repository.QuotationInfoRepository;
import com.caseStudy.salesProcessingservice.Service.SalesProcessingServiceImpl;
@SpringBootTest
class SalesProcessingRestControllerTest {
	
	@Mock
	private QuotationInfoRepository quotationInfoRepository;
	@Mock
	private SalesProcessingServiceImpl salesProcessingServiceImpl;
	@InjectMocks
	private SalesProcessingRestController salesProcessingRestController;
	
	
	
	@Test
	void testSaveQuotationController() throws Exception{
		QuotationInfo quotationInfo = new QuotationInfo();
		quotationInfo.setName("Harsha");
		quotationInfo.setAddress("Jamshedpur");
		quotationInfo.setContactNumber("9087654321");
		quotationInfo.setEmailId("harsha@gmail.com");
		quotationInfo.setInsuranceType("LIC");
		quotationInfo.setCost(9000);
		when(quotationInfoRepository.save(quotationInfo)).thenReturn(quotationInfo);
		ResponseEntity<QuotationInfo> qInfo1 = salesProcessingRestController.saveQuotation(quotationInfo);
		//assertThat(qInfo1).isNotNull();
		int responseCode = qInfo1.getStatusCodeValue();
		assertEquals(200,responseCode);
	}
	@Test
	void testGetAllQuotationController() throws Exception{
		List<QuotationInfo> quotationInfo = new ArrayList<>();
		quotationInfo.add(new QuotationInfo(1L,"Harsha","Jamshedpur","9807654321","harsha@gmail.com","LIFE Insurance",7800));
		quotationInfo.add(new QuotationInfo(2L,"Resham","Punjab","9870651234","Resham@gmail.com","LIC",9200));
		when(quotationInfoRepository.findAll()).thenReturn(quotationInfo);
		ResponseEntity<List<QuotationInfo>> qInfo1 = salesProcessingRestController.getAllQuotation();
		//assertThat(qInfo1).isNotNull();
		int responseCode = qInfo1.getStatusCodeValue();
		assertEquals(200,responseCode);
	}
	@Test
	void testGetQuotation() throws Exception {
		long quoteId = 5L;
		QuotationInfo quotationInfo4 = new QuotationInfo(5L,"Harsha","Jamshedpur","9807654321","harsha@gmail.com","LIFE Insurance",7800);
		when(quotationInfoRepository.findById(quoteId)).thenReturn(Optional.of(quotationInfo4));
		ResponseEntity<Optional<QuotationInfo>> quotationInfo = salesProcessingRestController.getQuotation(quoteId);
		//assertThat(quotationInfo).isNotNull();
		int responseCode = quotationInfo.getStatusCodeValue();
		assertEquals(200,responseCode);
	}
	

}
