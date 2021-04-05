package controller;

import model.Customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "DisplayCustomer", urlPatterns = "/display")
public class Display extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Customer customer = new Customer("Name", "18/05/1999", "Danang", "https://miro.medium.com/max/1838/1*mk1-6aYaf_Bes1E3Imhc0A.jpeg");
        Customer customer1 = new Customer("Name2", "18/05/1998", "HaNoi", "https://miro.medium.com/max/1838/1*mk1-6aYaf_Bes1E3Imhc0A.jpeg");
        Customer customer2 = new Customer("Name3", "18/05/1997", "HaiPhong", "https://miro.medium.com/max/1838/1*mk1-6aYaf_Bes1E3Imhc0A.jpeg");
        Customer customer3 = new Customer("Name4", "18/05/1996", "CanTho", "https://interactive-examples.mdn.mozilla.net/media/cc0-images/grapefruit-slice-332-332.jpg");

        List<Customer> listCustomer = new ArrayList<>();

        listCustomer.add(customer);
        listCustomer.add(customer1);
        listCustomer.add(customer2);
        listCustomer.add(customer3);

        req.setAttribute("customer", listCustomer);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/customer.jsp");

        dispatcher.forward(req,resp);

    }
}
