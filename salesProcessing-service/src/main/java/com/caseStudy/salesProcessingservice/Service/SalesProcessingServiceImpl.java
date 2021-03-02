package com.caseStudy.salesProcessingservice.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caseStudy.salesProcessingservice.ExceptionHandling.QuotationRetrieveFailException;
import com.caseStudy.salesProcessingservice.ExceptionHandling.QuotationSaveFailedException;
import com.caseStudy.salesProcessingservice.Model.QuotationInfo;
import com.caseStudy.salesProcessingservice.Repository.QuotationInfoRepository;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class SalesProcessingServiceImpl implements SalesProcessingService {
	
	@Autowired 
	private QuotationInfoRepository quotationInfoRepository;

	@Override
	public QuotationInfo saveQuotation(QuotationInfo quotationInfo1) {
		log.info("Inside saveQuotation method of SalesProcessingServiceImpl");
		QuotationInfo qInfo = quotationInfoRepository.save(quotationInfo1);
		 if(qInfo == null)
			 throw new QuotationSaveFailedException("Quote was not saved");
		 else
			 return qInfo;
	}

	@Override
	public List<QuotationInfo> getAllQuotation() {
		log.info("Inside getAllQuotation method of SalesProcessingServiceImpl");
		 return quotationInfoRepository.findAll();	
	}

	@Override
	public Optional<QuotationInfo> getQuotation(long id) {
		log.info("Inside getQuotation method of SalesProcessingServiceImpl");
		//return quotationInfoRepository.findById(id).get();
		Optional<QuotationInfo> qInfo1 = quotationInfoRepository.findById(id);
		//!qInfo1.isPresent()
		if(qInfo1 == null || qInfo1.isEmpty())
			throw new QuotationRetrieveFailException("quote id not present");
			else
				return qInfo1;
	}

	
}