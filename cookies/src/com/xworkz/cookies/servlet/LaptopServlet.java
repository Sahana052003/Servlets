package com.xworkz.cookies.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;



@WebServlet("/hello")
public class LaptopServlet extends HttpServlet {
    public LaptopServlet(){
        System.out.println("LaptopServlet is Called");
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
