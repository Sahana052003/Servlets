package com.xworkz.passport.servlet;

import com.xworkz.passport.dto.PassportDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/start",loadOnStartup = 4)
public class Passport extends HttpServlet {
    public Passport(){
        System.out.println("Passport object is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("fullName");
        String email=req.getParameter("email");
        PassportDTO passportDTO=new PassportDTO();

        req.setAttribute("Hello","NanduShree");
        req.getRequestDispatcher("name");
        RequestDispatcher dispatcher = req.getRequestDispatcher("passport.jsp");
        dispatcher.forward(req,resp);
    }
}
