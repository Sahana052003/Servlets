package com.xworkz.hotel.servlet;

import com.xworkz.hotel.dto.HotelDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/register",loadOnStartup = 3)
public class Hotel extends HttpServlet {
    public Hotel(){
        System.out.println("Hotel object is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("guestName");
        HotelDTO hotelDTO=new HotelDTO();

        req.setAttribute("Hello",name);
        req.getRequestDispatcher("name");
        RequestDispatcher dispatcher = req.getRequestDispatcher("hotel.jsp");
        dispatcher.forward(req,resp);
    }
}
