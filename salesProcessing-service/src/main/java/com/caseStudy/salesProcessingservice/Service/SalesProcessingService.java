package com.caseStudy.salesProcessingservice.Service;

import java.util.List;
import java.util.Optional;

import com.caseStudy.salesProcessingservice.Model.QuotationInfo;

public interface SalesProcessingService {

	public QuotationInfo saveQuotation(QuotationInfo quotationInfo1);
	public List<QuotationInfo> getAllQuotation();
	public Optional<QuotationInfo> getQuotation(long id);
}
