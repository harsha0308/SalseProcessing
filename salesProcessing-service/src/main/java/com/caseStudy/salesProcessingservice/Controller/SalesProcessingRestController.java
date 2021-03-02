package com.caseStudy.salesProcessingservice.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.caseStudy.salesProcessingservice.Model.QuotationInfo;
import com.caseStudy.salesProcessingservice.Service.SalesProcessingService;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@RestController
public class SalesProcessingRestController {
	
	
	@Autowired
	private SalesProcessingService spService;
	
	@PostMapping("/saveQuotation")
    public ResponseEntity<QuotationInfo> saveQuotation(@RequestBody QuotationInfo quotationInfo1) {
        log.info("Inside saveQuotation method of SalesProcessingRestController");
		return new ResponseEntity<QuotationInfo>(spService.saveQuotation(quotationInfo1),HttpStatus.OK);
    }
	
	@GetMapping("/getAllQuotation")
	 public ResponseEntity<List<QuotationInfo>> getAllQuotation() {
        log.info("Inside getAllQuotation method of SalesProcessingRestController");;
		List<QuotationInfo> list = spService.getAllQuotation();
        return new ResponseEntity<List<QuotationInfo>>(list,HttpStatus.OK);
    }
	
	 @GetMapping("/getQuotation/{quoteId}")
	 public ResponseEntity<Optional<QuotationInfo>> getQuotation(@PathVariable("quoteId") long id) {
	     log.info("Inside getQuotation method of SalesProcessingRestController");
	     return new ResponseEntity<Optional<QuotationInfo>>(spService.getQuotation(id),HttpStatus.OK);
	    }
	 
}
	

