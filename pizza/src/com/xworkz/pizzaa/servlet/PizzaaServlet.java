package com.xworkz.pizzaa.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

public class PizzaaServlet extends GenericServlet {

    public PizzaaServlet(){
        System.out.println("PizzaaServlet is Called");
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service method is called");
    }


    @Override
    public void destroy() {
        super.destroy();
    }
}
