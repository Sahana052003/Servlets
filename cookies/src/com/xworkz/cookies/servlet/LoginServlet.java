package com.xworkz.cookies.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/laptopservlet")
public class LoginServlet extends HttpServlet {
    public LoginServlet(){
        System.out.println("LoginServlet is Called");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        Cookie cookie = new Cookie("incokkie", name);
        cookie.setMaxAge(60);
        resp.addCookie(cookie);
        resp.sendRedirect("hello");

        HttpSession session = req.getSession();
        session.setAttribute("insession",name);
    }
}
