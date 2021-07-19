package com.example.demoServlet;
/**
 * @Author Adil
 * @create 19.07.2021 20:55
 */

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/Login", value = "/Login_")
public class Login extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<form action=\"Login\" method=\"post\">");
        out.println("Enter username: <input type=\"text\"  name=\"user\"><br/>");
        out.println("Enter password: <input type=\"password\"  name=\"pass\"><br/>");
        out.println("<input type=\"submit\" value=\"Login\">");
        out.println("</form>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user=request.getParameter("user");
        String password=request.getParameter("pass");
        if(user.equals("admin") && password.equals("pass")){
            response.sendRedirect("welcome.jsp");
        } else {
            response.sendRedirect("index.jsp");
        }
    }
}
