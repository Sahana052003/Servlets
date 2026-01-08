package com.xworkz.twitter.servlet;


import com.xworkz.twitter.dto.TwitterDTO;
import com.xworkz.twitter.service.FormValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/start",loadOnStartup = 1)
public class Twitter extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String email_id=req.getParameter("email");
        System.out.println(email_id);
        String pwd=req.getParameter("password");
        System.out.println(pwd);
        String email=req.getParameter("email");
        String password=req.getParameter("password");
//        System.out.println(email);
//        System.out.println(password);
        PrintWriter printWriter = resp.getWriter();
        TwitterDTO twitterDTO=new TwitterDTO(email,password);
        FormValidation formValidation=new FormValidation();
        boolean isValidate=formValidation.start(twitterDTO);
        if (isValidate) {
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>order</title>");
            printWriter.println("</head>");
            printWriter.println("<h1> Hi</h1>" + email);
            printWriter.println("<p style='color:green'>Profile Is Created</p>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        } else {
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>Information</title>");
            printWriter.println("</head>");
            printWriter.println("<h1> Hi</h1>");
            printWriter.println("<p style='color:red'>Please input correct details</p>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        }
    }
    }
