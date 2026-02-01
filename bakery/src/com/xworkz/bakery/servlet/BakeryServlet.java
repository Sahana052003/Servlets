package com.xworkz.bakery.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/getRegisterPage")
public class BakeryServlet extends HttpServlet {
    public BakeryServlet(){
        System.out.println("BakeryServlet is created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        RequestDispatcher requestDispatcher = req.getRequestDispatcher("bakeryreg.jsp");
        requestDispatcher.forward(req,resp);
    }
}
