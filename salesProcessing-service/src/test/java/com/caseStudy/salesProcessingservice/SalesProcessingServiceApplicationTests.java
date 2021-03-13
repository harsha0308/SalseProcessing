package com.caseStudy.salesProcessingservice;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.caseStudy.salesProcessingservice.Controller.SalesProcessingRestController;
import com.caseStudy.salesProcessingservice.ExceptionHandling.QuotationRetrieveFailException;
import com.caseStudy.salesProcessingservice.ExceptionHandling.QuotationSaveFailedException;
import com.caseStudy.salesProcessingservice.Model.QuotationInfo;
import com.caseStudy.salesProcessingservice.Repository.QuotationInfoRepository;
import com.caseStudy.salesProcessingservice.Service.SalesProcessingServiceImpl;

import static org.mockito.Mockito.when;

import java.util.Optional;

@SpringBootTest
class SalesProcessingServiceApplicationTests {

	@Mock 
	private QuotationInfoRepository quotationInfoRepository;
	@InjectMocks
	private SalesProcessingServiceImpl salesProcessingServiceImpl;
	@InjectMocks
	private SalesProcessingRestController salesProcessingRestController;
	 
	@Test
	void contextLoads() 
	{
		SalesProcessingServiceApplication.main(new String[] {});
	}
/*
	//Testing saveQuotation() of  SalesProcessingServiceImpl
	@Test
	void testSaveQuotation() throws Exception{
		QuotationInfo quotationInfo = new QuotationInfo();
		quotationInfo.setName("Harsha");
		quotationInfo.setAddress("Jamshedpur");
		quotationInfo.setContactNumber("9087654321");
		quotationInfo.setEmailId("harsha@gmail.com");
		quotationInfo.setInsuranceType("LIC");
		quotationInfo.setCost(9000);
		when(quotationInfoRepository.save(quotationInfo)).thenReturn(quotationInfo);
		QuotationInfo quotationInfo2 = salesProcessingServiceImpl.saveQuotation(quotationInfo);
		assertThat(quotationInfo2).isNotNull();
		assertEquals("Harsha",quotationInfo2.getName());
		assertEquals("Jamshedpur",quotationInfo2.getAddress());
		assertEquals("9087654321",quotationInfo2.getContactNumber());
		assertEquals("harsha@gmail.com",quotationInfo2.getEmailId());
		assertEquals("LIC",quotationInfo2.getInsuranceType());
		assertEquals(9000,quotationInfo2.getCost());	
	}
	//Testing getAllQuotation() method of SalesProcessingServiceImpl
	@Test
	void testGetAllQuotation() throws Exception{
		List<QuotationInfo> quotationInfo3 = new ArrayList<>();
		quotationInfo3.add(new QuotationInfo(1L,"Harsha","Jamshedpur","9807654321","harsha@gmail.com","LIFE Insurance",7800));
		quotationInfo3.add(new QuotationInfo(2L,"Resham","Punjab","9870651234","Resham@gmail.com","LIC",9200));
		when(quotationInfoRepository.findAll()).thenReturn(quotationInfo3);
		List<QuotationInfo> quotationInfoList = salesProcessingServiceImpl.getAllQuotation();
		assertThat(quotationInfoList).isNotNull();
	}
	//Testing getQuotation() method of SalesProcessingServiceImpl
	@Test
	void testGetQuotation() throws Exception {
		long quoteId = 5L;
		QuotationInfo quotationInfo4 = new QuotationInfo(5L,"Harsha","Jamshedpur","9807654321","harsha@gmail.com","LIFE Insurance",7800);
		when(quotationInfoRepository.findById(quoteId)).thenReturn(Optional.of(quotationInfo4));
		Optional<QuotationInfo> quotationInfo = salesProcessingServiceImpl.getQuotation(quoteId);
		assertThat(quotationInfo).isNotNull();
	}*/
	//Testing of saveQuotation() of SalesProcessingServiceImpl when it throws QuotationSaveFailedException
	/*@Test
	void testSaveQuotationFails()  {
		QuotationSaveFailedException qsfe = assertThrows(
				QuotationSaveFailedException.class, () -> {
					QuotationInfo quotationInfo1 = new QuotationInfo();
					when(quotationInfoRepository.save(quotationInfo1)).thenReturn(null);
					QuotationInfo quotationInfo = salesProcessingServiceImpl.saveQuotation(quotationInfo1);
					System.out.println(quotationInfo + "-----------harsha-------");
					
					assertThat(quotationInfo).isNotNull();
				}
				);
		assertTrue(qsfe.getMessage().contains("Quote was not saved"));
	}
	*/
	
	
	//Testing of getQuotation() of SalesProcessingServiceImpl when it throws QuotationRetrieveFailException
	/*@Test
	void testGetQuotationFails() throws Exception{
		QuotationRetrieveFailException quotationRetrieveFailException = assertThrows(
				QuotationRetrieveFailException.class, () -> {
					long quoteId = 2000L;
					when(quotationInfoRepository.findById(quoteId)).thenReturn(null);
				
					Optional<QuotationInfo> quotationInfo = salesProcessingServiceImpl.getQuotation(quoteId);
					assertThat(quotationInfo).isNull();		
					}
				);
		assertTrue(quotationRetrieveFailException.getMessage().contains("quote id not present"));
	
	}*/
	//Testing of saveQuotation() of SalesProcessingRestController
}
