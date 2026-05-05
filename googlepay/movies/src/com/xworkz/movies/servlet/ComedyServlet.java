package com.xworkz.movies.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/comedy")
public class ComedyServlet extends HttpServlet {
    public ComedyServlet(){
        System.out.println("Comedy Object is Called");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        String s=(String)session.getAttribute("insession");
        System.out.println(s);



        Cookie[] cookies = req.getCookies();
        for(Cookie co:cookies){
            System.out.println("Name is : " + co.getName()+" ===" + co.getValue());
        }
    }
}
