//package com.xworkz.vehicleRegisteration.servlet;
//
//import com.xworkz.vehicleRegisteration.dao.ReadVehicleRegisterationDAO;
//import com.xworkz.vehicleRegisteration.dao.VehicleRegisterationDAO;
//import com.xworkz.vehicleRegisteration.dto.VehicleRegisterationDTO;
//import com.xworkz.vehicleRegisteration.service.InvalidDataException;
//import com.xworkz.vehicleRegisteration.service.VehicleRegisterationService;
//
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet("/start")
//public class VehicleServlet extends HttpServlet {
//    public VehicleServlet(){
//        System.out.println("Vehicle Object is Created");
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       String name= req.getParameter("first");
//       String flName= req.getParameter("last");
//       String title= req.getParameter("title");
//       String companyName= req.getParameter("companyName");
//       String address= req.getParameter("address");
//       String town= req.getParameter("town");
//       String country= req.getParameter("country");
//       String postCode= req.getParameter("postcode");
//       Long pNumber= Long.valueOf(req.getParameter("phoneNo"));
//       Long mNUmber= Long.valueOf(req.getParameter("mobileNo"));
//       Long faxNo= Long.valueOf(req.getParameter("faxNumber"));
//       String email= req.getParameter("email");
//       Long vehicleReg= Long.valueOf(req.getParameter("vehicleNumber"));
//       int noOfWindows= Integer.parseInt(req.getParameter("sideWindows"));
//       Long chassNumber= Long.valueOf(req.getParameter("chassisNumber"));
//       int vehicle= Integer.parseInt(req.getParameter("vehicle"));
//       int model= Integer.parseInt(req.getParameter("model"));
//       String color= req.getParameter("color");
//       int year= Integer.parseInt(req.getParameter("year"));
//       int currMileage= Integer.parseInt(req.getParameter("mileage"));
//       String alarmType= req.getParameter("alarmType");
//       String delarName= req.getParameter("firstName");
//       String delarLastName= req.getParameter("lastName");
//       String delarTown= req.getParameter("delarTown");
//
//
//        VehicleRegisterationDTO dto=new VehicleRegisterationDTO();
//        dto.setName(name);
//        dto.setLName(flName);
//        dto.setTitleName(title);
//        dto.setCompanyName(companyName);
//        dto.setAddress(address);
//        dto.setTownName(town);
//        dto.setCountryName(country);
//        dto.setHomeNumber(pNumber);
//        dto.setMobileNumber(mNUmber);
//        dto.setFaxNo(faxNo);
//        dto.setEmail(email);
//        dto.setRegNo(vehicleReg);
//        dto.setNoOfWindow(noOfWindows);
//        dto.setChassisNumber(chassNumber);
//        dto.setVehicle(vehicle);
//        dto.setModel(model);
//        dto.setColor(color);
//        dto.setYear(year);
//        dto.setMileage(currMileage);
//        dto.setAlarmType(alarmType);
//        dto.setDelarName(delarName);
//        dto.setDelarLastName(delarLastName);
//        dto.setTown(delarTown);
//
//        VehicleRegisterationService vehicleRegisterationService=new VehicleRegisterationService();
//        vehicleRegisterationService.getVehicleData();
//
//
//        try {
//            vehicleRegisterationService.validate(dto);
//
//        } catch (InvalidDataException e) {
//            System.out.println("Validation Error: " + e.getMessage());
//            req.setAttribute("error", e.getMessage());
//            RequestDispatcher rd = req.getRequestDispatcher("reg.jsp");
//            rd.forward(req, resp);
//        }
////        vehicleRegisterationService.validate(dto);
//        VehicleRegisterationDAO dao = new VehicleRegisterationDAO();
//       if(dao.start(dto)){
//            req.setAttribute("name","Successfully Registered");
//       }else{
//           req.setAttribute("name1","Failed to Registered");
//       }
//
//
//
//        req.setAttribute("Name",name);
//        req.setAttribute("FLName",flName);
//        req.setAttribute("Title",title);
//        req.setAttribute("CompanyName",companyName);
//        req.setAttribute("Address",address);
//        req.setAttribute("Town",town);
//        req.setAttribute("Country",country);
//        req.setAttribute("PostCode",postCode);
//        req.setAttribute("PNumber",pNumber);
//        req.setAttribute("MNUmber",mNUmber);
//        req.setAttribute("FaxNo",faxNo);
//        req.setAttribute("Email",email);
//        req.setAttribute("VehicleReg",vehicleReg);
//        req.setAttribute("NoOfWindows",noOfWindows);
//        req.setAttribute("ChassNumber",chassNumber);
//        req.setAttribute("Vehicle",vehicle);
//        req.setAttribute("Model",model);
//        req.setAttribute("Color",color);
//        req.setAttribute("Year",year);
//        req.setAttribute("CurrMileage",currMileage);
//        req.setAttribute("AlarmType",alarmType);
//        req.setAttribute("DelarName",delarName);
//        req.setAttribute("DelarLastName",delarLastName);
//        req.setAttribute("DelarTown",delarTown);
//        RequestDispatcher dispatcher = req.getRequestDispatcher("reg.jsp");
//        dispatcher.forward(req, resp);
//
//
//
//    }
//}
