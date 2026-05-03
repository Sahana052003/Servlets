package com.xworkz.pizaa.main;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/",loadOnStartup = 1)
public class Pizaa extends GenericServlet {
    public Pizaa(){
        System.out.println("Pizaa method is Called");
    }

    @Override
    public void init() throws ServletException {
        super.init();
    }


    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Service method is called");

    }

}
