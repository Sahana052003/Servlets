package com.xworkz.vehicleRegisteration.service;

import com.xworkz.vehicleRegisteration.dao.ReadVehicleRegisterationDAO;
import com.xworkz.vehicleRegisteration.dto.VehicleRegisterationDTO;

import java.util.Iterator;
import java.util.List;


import com.xworkz.vehicleRegisteration.dao.ReadVehicleRegisterationDAO;
import com.xworkz.vehicleRegisteration.dto.VehicleRegisterationDTO;

import java.util.List;

//public class VehicleRegisterationService {
//    public static void main(String[] args) {
//        ReadVehicleRegisterationDAO dao = new ReadVehicleRegisterationDAO();
//        VehicleRegisterationService service = new VehicleRegisterationService();
//        service.getVehicleData();
//
//    }
//
//    public List<Object> getVehicleData() {
//        ReadVehicleRegisterationDAO dao = new ReadVehicleRegisterationDAO();
//        List<Object> list = dao.validateMethod();
//
//        for (Object dto : list) {
//            System.out.println(dto);
//        }
//
//        return list;
//    }
//
//
//}














//        public boolean validate (VehicleRegisterationDTO dto) throws InvalidDataException {
//            boolean valid = true;
//
//            if (dto.getName() == null || dto.getName().isEmpty()) {
//                System.out.println("Validation failed: Name");
//                return valid = false;
//            }
//
//            if (dto.getLName() == null || dto.getLName().isEmpty()) {
//                System.out.println("Validation failed: Last Name");
//                return valid = false;
//            }
//
//            if (dto.getEmail() == null || !dto.getEmail().contains("@")) {
//                System.out.println("Validation failed: Email");
//                valid = false;
//            }
//
//            if (dto.getHomeNumber() == null) {
//                System.out.println("Validation failed: Home Number");
//                valid = false;
//            }
//
//            if (dto.getRegNo() == null) {
//                System.out.println("Validation failed: Vehicle Registration Number");
//                valid = false;
//            }
//
//            if (dto.getChassisNumber() == null || String.valueOf(dto.getChassisNumber()).length() != 17) {
//                System.out.println("Validation failed: Chassis Number must be 17 digits");
//                valid = false;
//            }
//
//            if (dto.getMobileNumber() == null) {
//                System.out.println("Validation failed: Mobile Number");
//                valid = false;
//            }
//
//            if (!valid) {
//                throw new InvalidDataException("Please Enter Correct Data");
//            }
//
//            return true;
//        }
//
//}


public class VehicleRegisterationService {
    public static void main(String[] args) {
        ReadVehicleRegisterationDAO dao = new ReadVehicleRegisterationDAO();
        dao.validateMethod();
    }
}