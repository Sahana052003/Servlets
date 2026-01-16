package com.xworkz.game.servlet;

import com.xworkz.game.dto.GameDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/login",loadOnStartup = 2)
public class Game extends HttpServlet {
    public Game(){
        System.out.println("Game object is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        GameDTO gameDTO=new GameDTO();

        req.setAttribute("Hello",name);
        req.getRequestDispatcher("name");
        RequestDispatcher dispatcher = req.getRequestDispatcher("game.jsp");
        dispatcher.forward(req,resp);
    }
}
