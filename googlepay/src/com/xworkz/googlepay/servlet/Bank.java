package com.xworkz.googlepay.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/save")
public class Bank extends HttpServlet {
    public Bank(){
        System.out.println("Bank object is Called");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie[] cookies = req.getCookies();
        for (Cookie cookie:cookies){
            System.out.println("Name is : " + cookie.getName() + " and Email is : " + cookie.getValue());
        }
    }
}
