package com.xworkz.girigo.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/stop",loadOnStartup = 3)
public class SuccessServlet extends HttpServlet {
    public SuccessServlet(){
        System.out.println("Success object is called");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("wish.jsp");
        requestDispatcher.forward(req,resp);
    }
}
