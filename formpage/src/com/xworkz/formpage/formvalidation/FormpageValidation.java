package com.xworkz.formpage.formvalidation;

import com.xworkz.formpage.dto.FormpageDTO;

public class FormpageValidation {

    public boolean status(FormpageDTO formpageDTO) {
        if(formpageDTO.getName()!=null&&formpageDTO.getEmail()!=null&&formpageDTO.getPassword()!=null&&formpageDTO.getPassword().length()>=6){
            return true;
        }
        return false;
    }
}
