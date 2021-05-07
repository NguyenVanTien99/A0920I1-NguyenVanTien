package controller;

import Services.PaymentMethodServices;
import Services.RoomService;
import Services.ipml.PaymentMethodServicesIpml;
import Services.ipml.RoomServiceIpml;
import model.PaymentMethod;
import model.Room;
import validate.Validate;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet(name = "CreateServlet", urlPatterns  = "/create")
public class CreateServlet extends HttpServlet {
    PaymentMethodServices paymentMethodServices = new PaymentMethodServicesIpml();
    RoomService roomService = new RoomServiceIpml();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<PaymentMethod> list = paymentMethodServices.getAll();
        request.setAttribute("list", list);
        request.getRequestDispatcher("view/create.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("renterName");
        String phone = request.getParameter("phoneNumber");
        String rentDate = request.getParameter("rentDate");
        String payment = request.getParameter("paymentMethod");
        String remark = request.getParameter("remark");

        Room room = new Room(Integer.parseInt(id),name,phone,rentDate,payment,remark);

        roomService.insert(room);
        response.sendRedirect("list");

    }
}
