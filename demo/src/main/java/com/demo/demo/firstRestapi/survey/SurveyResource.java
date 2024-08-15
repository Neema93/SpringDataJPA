package com.demo.demo.firstRestapi.survey;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class SurveyResource {
     private SurveyService surveyService;
     public SurveyResource(SurveyService surveyService) {
        this.surveyService = surveyService;
    }
    @GetMapping("/surveys")
    public List<Survey> retriveAllSurvey() {
        return surveyService.retriveAllSurvey();
    }

    
    
}
