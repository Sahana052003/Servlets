package com.xworkz.ownly.main;

import com.xworkz.ownly.dto.OwnlyDTO;
import com.xworkz.ownly.service.OwnlyValidation;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/run",loadOnStartup = 2)
public class Ownly extends HttpServlet {
    public Ownly(){
        System.out.println("Ownly object is created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String name = req.getParameter("name");
        System.out.println(name);
        String email = req.getParameter("email");
        System.out.println(email);
        String mobileNumber = req.getParameter("mobileNumber");
        System.out.println(mobileNumber);
        String age = req.getParameter("age");
        System.out.println(age);
        OwnlyDTO ownlyDTO=new OwnlyDTO(name,email,mobileNumber,Integer.parseInt(age));
        OwnlyValidation ownlyValidation=new OwnlyValidation();
        boolean validate = ownlyValidation.validate(ownlyDTO);
        PrintWriter writer = resp.getWriter();
        if (validate){
           writer.println("<html>");
            writer.println("<head>");
            writer.println("<title>Ownly food delivery </title>");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<h1>Hi</h1>" + name + age );
            writer.println("<p style='color:green'> Food is Ordered </p>");
            writer.println("</body>");
            writer.println("</html>");
        }else {
            writer.println("<html>");
            writer.println("<head>");
            writer.println("<title>Ownly food delivery");
            writer.println("</head>");
            writer.println("<body>");
            writer.println("<h1>Hello</h1>"+ name + age );
            writer.println("<p style='color:red'> Food is Not Ordered </p>");
            writer.println("</body>");
            writer.println("</html>");
        }
    }
}
