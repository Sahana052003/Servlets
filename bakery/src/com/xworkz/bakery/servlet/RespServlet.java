package com.xworkz.bakery.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registerdata")
public class RespServlet extends HttpServlet {
    public RespServlet(){
        System.out.println("RespServlet is called");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        req.setAttribute("name",name);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("resp.jsp");
        resp.sendRedirect("fowserv");
        requestDispatcher.forward(req,resp);
    }
}
