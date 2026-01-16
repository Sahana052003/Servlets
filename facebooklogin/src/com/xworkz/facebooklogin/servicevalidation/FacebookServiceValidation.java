package com.xworkz.facebooklogin.servicevalidation;

import com.xworkz.facebooklogin.dto.FacebookDTO;

public class FacebookServiceValidation {

    public boolean pageStatus(FacebookDTO dto) {

        if (dto == null) return false;

        boolean validName =
                dto.getName() != null &&
                        dto.getName().length() > 3 &&
                        dto.getName().length() <= 10;

        boolean validAge =
                dto.getAge() != null &&
                        dto.getAge() >= 18 &&
                        dto.getAge() <= 60;

        boolean validEmail =
                dto.getEmail() != null && dto.getEmail().length()>3 && dto.getEmail().length()<=15 &&
                        dto.getEmail().contains("@gmail.com");

        boolean validPassword =
                dto.getPassword() != null &&
                        dto.getPassword().matches("^[A-Za-z].{6,}[@#$%^&*]$");


        boolean passwordMatch =
                dto.getPassword().equals(dto.getConfirmPassword());

        return validName && validAge && validEmail && validPassword && passwordMatch;
    }
}
