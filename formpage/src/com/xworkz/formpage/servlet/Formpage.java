package com.xworkz.formpage.servlet;

import com.xworkz.formpage.dto.FormpageDTO;
import com.xworkz.formpage.formvalidation.FormpageValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/load",loadOnStartup = 1)
public class Formpage extends HttpServlet {
    public Formpage(){
        System.out.println("form-page is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Calling post method");
        resp.setContentType("text/html");
        String name=req.getParameter("name");
        System.out.println(name);
        String email=req.getParameter("email");
        System.out.println(email);
        String password=req.getParameter("password");
        System.out.println(password);
        FormpageDTO formpageDTO=new FormpageDTO(name,email,password);
        FormpageValidation formpageValidation=new FormpageValidation();
        boolean isValid=formpageValidation.status(formpageDTO);
        PrintWriter printWriter=resp.getWriter();
        if (isValid){
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>order</title>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("<h1> Hi" + name +"</h1>");
            printWriter.println("<p style='color:green'>Profile Is Created</p>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        } else {
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>Information</title>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("<h1> Hi" + name + "</h1>"  );
            printWriter.println("<p style='color:red'>Please input correct details</p>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        }
        }
    }
