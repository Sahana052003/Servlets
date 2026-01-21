package com.xworkz.cookiesandsessions.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/upiservlet")
public class UPIServlet extends HttpServlet {
    public UPIServlet(){
        System.out.println("UPIServlet is Created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie[] cookies = req.getCookies();
        for (Cookie co:cookies){
            System.out.println("Are the values are :" + co.getName()+ " value : " + co.getValue());
        }
        Cookie[] cookies1=req.getCookies();
        for (Cookie cookie:cookies1){
            System.out.println("Names are : " + cookie.getValue() + " email : " + cookie.getName());
        }

        HttpSession session = req.getSession(false);
       String s=(String)session.getAttribute("insession");
        System.out.println(s);

    }
}
