package com.xworkz.vehicleRegisteration.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/run")
public class VehicleRegServlet extends HttpServlet {
    public VehicleRegServlet(){
        System.out.println("VehicleRegServlet is Created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("reg.jsp");
            requestDispatcher.forward(req,resp);
    }
}
