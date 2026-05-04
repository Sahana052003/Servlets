package com.xworkz.chatbox.servlet;

import com.xworkz.chatbox.dto.ChatboxDTO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/start" ,loadOnStartup = 4)
public class ChatboxServlet extends HttpServlet {
    public ChatboxServlet(){
        System.out.println("Chatbox object is called");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        ChatboxDTO chatboxDTO=new ChatboxDTO();

        req.setAttribute("Hello",name);
        req.getRequestDispatcher("name");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("chatbox.jsp");
        requestDispatcher.forward(req,resp);

    }
}
