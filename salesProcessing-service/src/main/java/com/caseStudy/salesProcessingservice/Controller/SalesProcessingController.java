package com.caseStudy.salesProcessingservice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class SalesProcessingController {
	@GetMapping("/")
    public ModelAndView showWelcomePage(ModelMap model) {
		log.info("INSIDE showWelcomePage method of SalesProcessingController"); 
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		log.info("ENDING showWelcomePage method of SalesProcessingController"); 
        return mv;
    }
	@GetMapping("/saveQuote")
    public ModelAndView showSaveQuotePage(ModelMap model) {
		 log.info("INSIDE showSaveQuotePage method of SalesProcessingController");
		 ModelAndView mv = new ModelAndView();
		 mv.setViewName("saveQuote");
		 log.info("ENDING showSaveQuotePage method of SalesProcessingController");
        return mv;
    }
	@GetMapping("/getQuotes")
    public ModelAndView showGetQuotesPage(ModelMap model) {
		log.info("INSIDE showGetQuotesPage method of SalesProcessingController");
		 ModelAndView mv = new ModelAndView();
		 mv.setViewName("getQuotes");
		 log.info("ENDING showGetQuotesPage method of SalesProcessingController");
        return mv;
    }
	@GetMapping("/getQuoteById")
    public ModelAndView showGetQuoteByIdPage(ModelMap model) {
		log.info("INSIDE showGetQuoteByIdPage method of SalesProcessingController");
		 ModelAndView mv = new ModelAndView();
		 mv.setViewName("getQuoteById");
		 log.info("ENDING showGetQuoteByIdPage method of SalesProcessingController");
        return mv;
    }

  
}
