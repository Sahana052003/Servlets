package com.xworkz.movies.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = "/challenge")
public class GameServlet extends HttpServlet {
    public GameServlet(){
        System.out.println("game object is called");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        String name = req.getParameter("name");

        Cookie cookie = new Cookie("incokkie", name);
        cookie.setMaxAge(60);
        resp.addCookie(cookie);
        resp.sendRedirect("comedy");

        HttpSession session = req.getSession();
        session.setAttribute("insession",name);

    }
}
