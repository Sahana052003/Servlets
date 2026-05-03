package com.xworkz.pizaa.main;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/click",loadOnStartup = 6)
public class Order extends GenericServlet {
    public Order(){
        System.out.println("Oreder is called");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Order service method is called");
    }
}
