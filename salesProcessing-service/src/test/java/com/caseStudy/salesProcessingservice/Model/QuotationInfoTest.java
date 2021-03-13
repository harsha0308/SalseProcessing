package com.caseStudy.salesProcessingservice.Model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class QuotationInfoTest {

	

	//Testing the Model QuotationInfo
	@Test
	void testQuotationInfoModel() throws Exception {
		QuotationInfo quotationInfo = new QuotationInfo();
		quotationInfo.setName("Harsha");
		quotationInfo.setAddress("Jamshedpur");
		quotationInfo.setContactNumber("9087654321");
		quotationInfo.setEmailId("harsha@gmail.com");
		quotationInfo.setInsuranceType("LIC");
		quotationInfo.setCost(9000);
		assertEquals("Harsha",quotationInfo.getName());
	}
	@Test
	void testQuotationInfoModel1() throws Exception {
		QuotationInfo quotationInfo = new QuotationInfo(2L,"Harsha","Jamshedpur","9087654321","harsha@gmail.com","LIC",9000);
		assertEquals("Jamshedpur",quotationInfo.getAddress());
	}
	
	@Test
	void testQuotationInfoModel2() throws Exception {
		QuotationInfo quotationInfo = new QuotationInfo(2L,"Harsha","Jamshedpur","9087654321","harsha@gmail.com","LIC",9000);
		assertEquals("9087654321",quotationInfo.getContactNumber());
	}
	
	@Test
	void testQuotationInfoModel3() throws Exception {
		QuotationInfo quotationInfo = new QuotationInfo(2L,"Harsha","Jamshedpur","9087654321","harsha@gmail.com","LIC",9000);
		assertEquals("harsha@gmail.com",quotationInfo.getEmailId());
	}
	
	@Test
	void testQuotationInfoModel4() throws Exception {
		QuotationInfo quotationInfo = new QuotationInfo(2L,"Harsha","Jamshedpur","9087654321","harsha@gmail.com","LIC",9000);
		assertEquals("LIC",quotationInfo.getInsuranceType());
	}
	
	@Test
	void testQuotationInfoModel5() throws Exception {
		QuotationInfo quotationInfo = new QuotationInfo(2L,"Harsha","Jamshedpur","9087654321","harsha@gmail.com","LIC",9000);
		assertEquals(9000,quotationInfo.getCost());
	}

	
	/*@Test
	void testQuotationInfoModel19() throws Exception {
		QuotationInfo quotationInfo = new QuotationInfo(2L,"Harsha","Jamshedpur","9087654321","harsha@gmail.com","LIC",9000);
		assertEquals("Harsha",quotationInfo.getName());
		assertEquals("Jamshedpur",quotationInfo.getAddress());
		assertEquals("9087654321",quotationInfo.getContactNumber());
		assertEquals("harsha@gmail.com",quotationInfo.getEmailId());
		assertEquals("LIC",quotationInfo.getInsuranceType());
		assertEquals(9000,quotationInfo.getCost());	
	}*/
}
