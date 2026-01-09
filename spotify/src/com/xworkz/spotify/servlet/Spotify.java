package com.xworkz.spotify.servlet;

import com.xworkz.spotify.dto.SpotifyDTO;
import com.xworkz.spotify.service.SpotifyService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/start",loadOnStartup = 1)
public class Spotify extends HttpServlet {
    public Spotify(){
        System.out.println("Spotify clss is created");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Get the details of Spotify");
        resp.setContentType("text/html");
        String email=req.getParameter("email");
        System.out.println(email);
        String password=req.getParameter("password");
        System.out.println(password);
        PrintWriter printWriter=resp.getWriter();
        SpotifyDTO spotifyDTO=new SpotifyDTO(email,password);
        SpotifyService spotifyService=new SpotifyService();
        boolean isValid=spotifyService.check(spotifyDTO);
        if(isValid){
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>order</title>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("<h1> Hi </h1>");
            printWriter.println("<p style='color:green'>Profile Is Created</p>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        } else {
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>Information</title>");
            printWriter.println("</head>");
            printWriter.println("<body>");
            printWriter.println("<h1> Hi </h1>"  );
            printWriter.println("<p style='color:red'>Please input correct details</p>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        }
    }
        }
