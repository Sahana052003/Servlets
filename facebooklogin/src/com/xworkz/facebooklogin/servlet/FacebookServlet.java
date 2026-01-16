package com.xworkz.facebooklogin.servlet;

import com.xworkz.facebooklogin.dto.FacebookDTO;
import com.xworkz.facebooklogin.servicevalidation.FacebookServiceValidation;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/start", loadOnStartup = 1)
public class FacebookServlet extends HttpServlet {

    public FacebookServlet() {
        System.out.println("Facebook Servlet Created");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        Integer age = Integer.parseInt(req.getParameter("age"));
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmPassword = req.getParameter("confirmpassword");
        System.out.println(name + age + email + password + confirmPassword);

        FacebookDTO dto = new FacebookDTO(
                name, age, password, confirmPassword, email
        );

        FacebookServiceValidation validation =
                new FacebookServiceValidation();

        boolean isValid = validation.pageStatus(dto);

        if (isValid) {
            req.setAttribute("message", "Registration Successful");
        } else {
            req.setAttribute("message", "Registration Failed");
        }

        RequestDispatcher dispatcher =
                req.getRequestDispatcher("facebook.jsp");
        dispatcher.forward(req, resp);
    }
}
