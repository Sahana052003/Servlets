package com.xworkz.movie.servlet;

import com.xworkz.movie.dto.MovieDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/details",loadOnStartup = 1)
public class Movie extends HttpServlet {
    public Movie(){
        System.out.println("Movie object is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        MovieDTO movieDTO=new MovieDTO();

        req.setAttribute("Hello",name);
        req.getRequestDispatcher("name");
      RequestDispatcher dispatcher = req.getRequestDispatcher("movie.jsp");
                dispatcher.forward(req,resp);
    }
}
