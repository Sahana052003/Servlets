package com.xworkz.booking.service;

import com.xworkz.booking.dto.FlightBookingDTO;

public class FlightBookingService {
    public boolean start(FlightBookingDTO flightBookingDTO){
        if (flightBookingDTO.getName().length()>=4 && flightBookingDTO.getEmail()!=null
        && flightBookingDTO.getPassword().length()>=6 &&
                flightBookingDTO.getMobileNumber()>=1000000000L && flightBookingDTO.getMobileNumber()<=9999999999L &&
                flightBookingDTO.getAge()>=12 &&
                flightBookingDTO.getAge()<=65){
            return true;
        }
        return false;
    }
}
