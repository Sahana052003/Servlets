package com.xworkz.googlepay.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login")
public class ATM extends HttpServlet {
    public ATM(){
        System.out.println("ATM object is Called");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        Cookie cookie = new Cookie("incookie", name);
        cookie.setMaxAge(60);
        resp.addCookie(cookie);
        resp.sendRedirect("save");
    }
}
