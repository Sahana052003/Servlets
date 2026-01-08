package com.xworkz.Instagram.formValidation;

import com.xworkz.Instagram.dto.InstagramDTO;

public class InstagramValidation {
    public boolean check(InstagramDTO instagramDTO){
        if(instagramDTO.getEmail()!=null&&!instagramDTO.getEmail().isEmpty()
                &&instagramDTO.getPassword()!=null
        &&instagramDTO.getFirstName() != null &&
                instagramDTO.getFirstName().equals(instagramDTO.getUserName())
                &&instagramDTO.getCity()!=null
    &&instagramDTO.getState()!=null&&instagramDTO.getZip()>=100000&&
                instagramDTO.getZip()<=999999){
        return true;
    }
    return false;
}
}