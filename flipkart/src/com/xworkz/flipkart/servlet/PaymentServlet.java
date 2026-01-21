package com.xworkz.flipkart.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/payments")
public class PaymentServlet extends HttpServlet {

    public PaymentServlet(){
        System.out.println("PaymentServlet is Created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("order.jsp");
        requestDispatcher.forward(req,resp);

    }
}
