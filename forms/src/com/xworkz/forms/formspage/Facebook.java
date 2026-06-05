package com.xworkz.forms.formspage;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/login", loadOnStartup = 1)
public class Facebook extends GenericServlet {

    public Facebook() {
        System.out.println("Creating account to login");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
            throws ServletException, IOException {
        String username = servletRequest.getParameter("username");
        System.out.println("user name : " + username);
        String name = servletRequest.getParameter("email");
        System.out.println(name);
        String pwd = servletRequest.getParameter("password");
        System.out.println(pwd);
        // System.out.println("Login successfully");
        PrintWriter printWriter = servletResponse.getWriter();
        printWriter.println(username + "Login Successfully");
        servletResponse.setContentType("text/html/plain");
        printWriter.println("<html>");
        printWriter.println("<head>");
        printWriter.println("<title>Login Page</title>");
        printWriter.println("</head>");
        printWriter.println("<body>");
        printWriter.println("<h1>HI," + username + "</h1>");
        printWriter.println("<p>Successfully registered</p>");
        printWriter.println("</body></html>");
    }
}
