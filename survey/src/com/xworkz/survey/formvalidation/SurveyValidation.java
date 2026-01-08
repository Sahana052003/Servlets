package com.xworkz.survey.formvalidation;

import com.xworkz.survey.dto.SurveyDTO;

public class SurveyValidation {
    public boolean checkSurvey(SurveyDTO surveyDTO){
        if(surveyDTO.getFirstName()!=null&&surveyDTO.getName()!=null&&surveyDTO.getEmail()!=null
        &&surveyDTO.getPassword()!=null&&surveyDTO.getAddress()!=null&&surveyDTO.getCity()!=null
        &&surveyDTO.getState()!=null&&surveyDTO.getZip()>=100000
                && surveyDTO.getZip()<=999999){
        return true;
        }
        return false;
    }
}
