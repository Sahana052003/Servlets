//package com.xworkz.vehicleRegisteration.dao;
//
//import com.xworkz.vehicleRegisteration.dto.VehicleRegisterationDTO;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//public class ReadVehicleRegisterationDAO {
//    String url = "jdbc:mysql://localhost:3306/vehicle_db";
//    String userName = "root";
//    String password = "Ammu@5182603";
//
//    public List<Object> validateMethod() {
//        List<Object> list=new ArrayList<>();
//        try {
//            String readQuery = "select * from vehicle_table";
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection connection = DriverManager.getConnection(url, userName, password);
//            PreparedStatement preparedStatement = connection.prepareStatement(readQuery);
//            ResultSet resultSet =preparedStatement.executeQuery(readQuery);
//            while (resultSet.next()){
//                VehicleRegisterationDTO dto = new VehicleRegisterationDTO();
//                dto.setName(resultSet.getString(1));
//                dto.setLName(resultSet.getString(2));
//                dto.setTitleName(resultSet.getString(3));
//                dto.setCompanyName(resultSet.getString(4));
//                dto.setAddress(resultSet.getString(5));
//                dto.setTownName(resultSet.getString(6));
//                dto.setCountryName(resultSet.getString(7));
//                dto.setHomeNumber(resultSet.getLong(8));
//                dto.setMobileNumber(resultSet.getLong(9));
//                dto.setFaxNo(resultSet.getLong(10));
//                dto.setEmail(resultSet.getString(11));
//                dto.setRegNo(resultSet.getLong(12));
//                dto.setNoOfWindow(resultSet.getInt(13));
//                dto.setChassisNumber(resultSet.getLong(14));
//                dto.setVehicle(resultSet.getInt(15));
//                dto.setModel(resultSet.getInt(16));
//                dto.setColor(resultSet.getString(17));
//                dto.setYear(resultSet.getInt(18));
//                dto.setMileage(resultSet.getInt(19));
//                dto.setAlarmType(resultSet.getString(20));
//                dto.setDelarName(resultSet.getString(21));
//                dto.setDelarLastName(resultSet.getString(22));
//                dto.setTown(resultSet.getString(23));
//                list.add(dto);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return list;
//    }
//}


package com.xworkz.vehicleRegisteration.dao;

import com.xworkz.vehicleRegisteration.dto.VehicleRegisterationDTO;

import java.sql.*;


public class ReadVehicleRegisterationDAO {
    public void validateMethod() {
       // String name = "null";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/vehicle_db";
            String username = "root";
            String password = "Ammu@5182603";
            String query = "select * from vehicle_table";
            Connection connection = DriverManager.getConnection(url, username, password);
            if (connection != null) {
                System.out.println("Updating the customers data ");
            }
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(
                        resultSet.getString(1) + "\t" +
                                resultSet.getString(2) + "\t" +
                                resultSet.getString(3) + "\t" +
                                resultSet.getString(4) + "\t" +
                                resultSet.getString(5) + "\t" +
                                resultSet.getString(6) + "\t" +
                                resultSet.getString(7) + "\t" +
                                resultSet.getLong(8) + "\t" +
                                resultSet.getLong(9) + "\t" +
                                resultSet.getLong(10) + "\t" +
                                resultSet.getString(11) + "\t" +
                                resultSet.getLong(12) + "\t" +
                                resultSet.getInt(13) + "\t" +
                                resultSet.getLong(14) + "\t" +
                                resultSet.getInt(15) + "\t" +
                                resultSet.getInt(16) + "\t" +
                                resultSet.getString(17) + "\t" +
                                resultSet.getInt(18) + "\t" +
                                resultSet.getInt(19) + "\t" +
                                resultSet.getString(20) + "\t" +
                                resultSet.getString(21) + "\t" +
                                resultSet.getString(22) + "\t" +
                                resultSet.getString(23)
                );
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

