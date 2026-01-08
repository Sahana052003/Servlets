package com.xworkz.survey.servlet;

import com.sun.deploy.net.proxy.WFirefoxProxyConfig;
import com.xworkz.survey.dto.SurveyDTO;
import com.xworkz.survey.formvalidation.SurveyValidation;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/start",loadOnStartup = 1)
public class Survey extends HttpServlet {
    public Survey(){
        System.out.println("Survey is created");
    }

//    @Override
//    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        System.out.println("Service is called");
//
//    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String firstName=req.getParameter("firstName");
        System.out.println(firstName);
        String name=req.getParameter("name");
        System.out.println(name);
        String email=req.getParameter("email");
        System.out.println(email);
        String password=req.getParameter("password");
        System.out.println(password);
        String address=req.getParameter("address");
        System.out.println(address);
        String state=req.getParameter("state");
        System.out.println(state);
        String city=req.getParameter("city");
        System.out.println(city);
        String zip=req.getParameter("zip");
        System.out.println(zip);
        String check=req.getParameter("check");
        System.out.println(check);
        SurveyDTO surveyDTO=new SurveyDTO(firstName,name,email,password,address,city,state,Integer.parseInt(zip),Boolean.parseBoolean(check));
        SurveyValidation surveyValidation=new SurveyValidation();
        boolean isValidate=surveyValidation.checkSurvey(surveyDTO);
        PrintWriter printWriter=resp.getWriter();
        if (isValidate) {
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>order</title>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("<h1> Hi</h1>"+ firstName + name);
            printWriter.println("<p style='color:green'>Profile Is Created</p>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        } else {
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>Information</title>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("<h1> Hi</h1>" + firstName + name);
            printWriter.println("<p style='color:red'>Please input correct details</p>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        }
    }
}
