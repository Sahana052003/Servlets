package com.xworkz.Instagram.survlet;

import com.xworkz.Instagram.dto.InstagramDTO;
import com.xworkz.Instagram.formValidation.InstagramValidation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/run",loadOnStartup = 2)
public class Instagram extends HttpServlet {
    public Instagram() {
        System.out.println("Instagram is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        String email=req.getParameter("email");
        System.out.println(email);
        String pwd=req.getParameter("password");
        System.out.println(pwd);
        String firstName=req.getParameter("firstName");
        System.out.println(firstName);
        String lastName=req.getParameter("lastName");
        System.out.println(lastName);
        String userName=req.getParameter("userName");
        System.out.println(userName);
        String city=req.getParameter("city");
        System.out.println(city);
        String state=req.getParameter("state");
        System.out.println(state);
        String zip=req.getParameter("zip");
        System.out.println(zip);
        String gender=req.getParameter("male");
        System.out.println(gender);
        String gender1=req.getParameter("female");
        System.out.println(gender1);
        InstagramDTO instagramDTO=new InstagramDTO(email,pwd,firstName,lastName,userName,city,state,Integer.parseInt(zip));
        InstagramValidation instagramValidation=new InstagramValidation();
        boolean isValidate=instagramValidation.check(instagramDTO);
        PrintWriter printWriter=resp.getWriter();
        if (isValidate) {
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>order</title>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("<h1> Hi</h1>"+ firstName + lastName);
            printWriter.println("<p style='color:green'>Profile Is Created</p>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        } else {
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>Information</title>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("<h1> Hi</h1>" + firstName + lastName);
            printWriter.println("<p style='color:red'>Please input correct details</p>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        }
    }
}