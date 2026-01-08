package com.xworkz.twitter.service;

import com.xworkz.twitter.dto.TwitterDTO;

public class FormValidation {

    public boolean start(TwitterDTO twitterDTO) {
        if (twitterDTO.getEmail()!=null&&twitterDTO.getPassword().length()<=9) {
            return true;
        }
       return false;
    }
}