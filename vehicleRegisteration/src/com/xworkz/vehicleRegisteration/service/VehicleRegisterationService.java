package com.xworkz.vehicleRegisteration.service;

import com.xworkz.vehicleRegisteration.dto.VehicleRegisterationDTO;

public class VehicleRegisterationService {

    public boolean validate(VehicleRegisterationDTO dto) {

        if (dto.getName() == null || dto.getName().isEmpty())
            throw new InvalidDataException("First name is required");

        if (dto.getLName() == null )
            throw new InvalidDataException("Last name is required");

        if (dto.getEmail() == null || !dto.getEmail().contains("@"))
            throw new InvalidDataException("Invalid email address");

        if (dto.getHomeNumber() == null)
            throw new InvalidDataException("Home phone number is required");

        if (dto.getRegNo() == null)
            throw new InvalidDataException("Vehicle registration number is required");

        if (dto.getChassisNumber() == null)
            throw new InvalidDataException("Chassis number is required");
            return true;
    }


}
