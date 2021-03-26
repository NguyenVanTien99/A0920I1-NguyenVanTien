package com.example.discount_caculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet(name = "CalculatorServlet", value = "/display-discount")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String Description = request.getParameter("ProDescription");
       Double price = Double.parseDouble(request.getParameter("Price"));
       Integer discount = Integer.parseInt(request.getParameter("Discount"));

       Double amount = price * discount * 0.01;

       PrintWriter printWriter = response.getWriter();

       printWriter.println("<html>");

       printWriter.println("<h1>Amount: </h1>" + amount);

       printWriter.println("</html>");

    }
}
