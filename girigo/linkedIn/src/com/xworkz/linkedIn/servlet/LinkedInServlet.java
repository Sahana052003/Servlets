package com.xworkz.linkedIn.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/LinkedInServlet")
public class LinkedInServlet extends HttpServlet {
    public LinkedInServlet(){
        System.out.println("LinkedInServlet is Called");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        req.setAttribute("name", name);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("AccountServlet");
        requestDispatcher.forward(req,resp);

    }
}
