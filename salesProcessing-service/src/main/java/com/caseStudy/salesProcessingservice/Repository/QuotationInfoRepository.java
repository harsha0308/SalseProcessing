package com.caseStudy.salesProcessingservice.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.caseStudy.salesProcessingservice.Model.QuotationInfo;

@Repository
public interface QuotationInfoRepository extends JpaRepository<QuotationInfo, Long>{
}
