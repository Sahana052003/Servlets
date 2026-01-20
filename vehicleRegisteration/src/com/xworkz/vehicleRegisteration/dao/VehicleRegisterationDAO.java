package com.xworkz.vehicleRegisteration.dao;

import com.xworkz.vehicleRegisteration.dto.VehicleRegisterationDTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class VehicleRegisterationDAO {
    String url = "jdbc:mysql://localhost:3306/vehicle_db";
    String userName = "root";
    String password = "Ammu@5182603";

    public boolean start(VehicleRegisterationDTO vehicleDto) {
        boolean staus=false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String query = "insert into vehicle_table values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            Connection connection = DriverManager.getConnection(url, userName, password);
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, vehicleDto.getName());
            ps.setString(2, vehicleDto.getLName());
            ps.setString(3, vehicleDto.getTitleName());
            ps.setString(4, vehicleDto.getCompanyName());
            ps.setString(5, vehicleDto.getAddress());
            ps.setString(6, vehicleDto.getTownName());
            ps.setString(7, vehicleDto.getCountryName());
            ps.setLong(8, vehicleDto.getHomeNumber());
            ps.setLong(9, vehicleDto.getMobileNumber());
            ps.setLong(10, vehicleDto.getFaxNo());
            ps.setString(11, vehicleDto.getEmail());
            ps.setLong(12, vehicleDto.getRegNo());
            ps.setInt(13, vehicleDto.getNoOfWindow());
            ps.setLong(14, vehicleDto.getChassisNumber());
            ps.setInt(15, vehicleDto.getVehicle());
            ps.setInt(16, vehicleDto.getModel());
            ps.setString(17, vehicleDto.getColor());
            ps.setInt(18, vehicleDto.getYear());
            ps.setInt(19, vehicleDto.getMileage());
            ps.setString(20, vehicleDto.getAlarmType());
            ps.setString(21, vehicleDto.getDelarName());
            ps.setString(22, vehicleDto.getDelarLastName());
            ps.setString(23, vehicleDto.getTown());
            int rows = ps.executeUpdate();
            if (rows > 0) {
                staus=true;
                System.out.println("Being executed");
            }
        }catch (ClassNotFoundException obj){
            obj.printStackTrace();
    }catch (SQLException e){
                    e.printStackTrace();
                }
                return staus;
            }
        }