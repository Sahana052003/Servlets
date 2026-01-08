package com.xworkz.booking.servlet;

import com.xworkz.booking.dto.FlightBookingDTO;
import com.xworkz.booking.service.FlightBookingService;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/login",loadOnStartup = 1)
public class FlightBooking extends HttpServlet {
    public FlightBooking(){
        System.out.println("Object is Created");
    }
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Being Called");
        res.setContentType("text/html");
        String name=req.getParameter("name");
        System.out.println(name);
        String email_id=req.getParameter("email");
        System.out.println(email_id);
        String pwd=req.getParameter("password");
        System.out.println(pwd);
        String age= req.getParameter("age");
        System.out.println(age);
        String phoneNo=req.getParameter("mobileNo");
        System.out.println(phoneNo);
        FlightBookingDTO flightBookingDTO=new FlightBookingDTO(name,email_id,pwd,Long.parseLong(phoneNo),Integer.parseInt(age));
        FlightBookingService flightBookingService=new FlightBookingService();
        PrintWriter printWriter=res.getWriter();
        boolean isValidate=flightBookingService.start(flightBookingDTO);
        if (isValidate) {
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>order</title>");
            printWriter.println("</head>");
            printWriter.println("<h1> Hi</h1>" + name);
            printWriter.println("<p style='color:green'>Profile Is Created</p>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        } else {
            printWriter.println("<html>");
            printWriter.println("<head>");
            printWriter.println("<title>Information</title>");
            printWriter.println("</head>");
            printWriter.println("<h1> Hi</h1>" + name);
            printWriter.println("<p style='color:red'>Please input correct details</p>");
            printWriter.println("</body>");
            printWriter.println("</html>");
        }
    }

}
