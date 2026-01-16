package com.xworkz.survey.servlet;

import com.xworkz.survey.dto.SurveyDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/run",loadOnStartup = 5)
public class Survey extends HttpServlet {
    public Survey(){
        System.out.println("Survey object is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mail=req.getParameter("email");
        String pwd=req.getParameter("password");
        SurveyDTO surveyDTO=new SurveyDTO();

        req.setAttribute("Hello",mail);
        req.getRequestDispatcher("email");
        RequestDispatcher dispatcher = req.getRequestDispatcher("survey.jsp");
        dispatcher.forward(req,resp);
    }
}
