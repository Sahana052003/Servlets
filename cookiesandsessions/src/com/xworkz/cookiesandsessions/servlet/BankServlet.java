package com.xworkz.cookiesandsessions.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/bankservlet")
public class BankServlet extends HttpServlet {
    public BankServlet(){
        System.out.println("BankServlet is Created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        String password = req.getParameter("password");
        req.setAttribute("name",name);
        Cookie cookie=new Cookie("incookie",name);
        cookie.setMaxAge(60);
        resp.addCookie(cookie);
        req.setAttribute("email",email);
        Cookie cookie1=new Cookie("mail",email);
        resp.addCookie(cookie1);
        HttpSession session = req.getSession();
        session.setAttribute("insession",name);
        resp.sendRedirect("upiservlet");

    }
}
