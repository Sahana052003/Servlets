package com.xworkz.ownly.service;

import com.xworkz.ownly.dto.OwnlyDTO;

public class OwnlyValidation {
    public boolean validate(OwnlyDTO ownlyDTO){
        if (ownlyDTO.getName()!=null && ownlyDTO.getEmail() != null && ownlyDTO.getEmail().endsWith("@gmail.com")
        && ownlyDTO.getMobileNumber() != null && ownlyDTO.getMobileNumber().length() == 10
                && ownlyDTO.getAge()>=18){
            return true;
        }
        return false;
    }
}
