package com.xworkz.flipkart.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/start")
public class FlipkartServlet extends HttpServlet {
    public FlipkartServlet(){
        System.out.println("FlipkartServlet is Created");
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        req.setAttribute("name",name);
       // RequestDispatcher requestDispatcher = req.getRequestDispatcher("flipkart.jsp");
        resp.sendRedirect("orderServlet");
       // requestDispatcher.forward(req,resp);
    }
}
