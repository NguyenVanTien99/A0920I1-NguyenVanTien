package controller;

import Services.PaymentMethodServices;
import Services.RoomService;
import Services.ipml.PaymentMethodServicesIpml;
import Services.ipml.RoomServiceIpml;
import model.PaymentMethod;
import model.Room;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "updateServlet", urlPatterns  = "/update")
public class UpdateServlet extends HttpServlet {
    PaymentMethodServices paymentMethodServices = new PaymentMethodServicesIpml();
    RoomService roomService = new RoomServiceIpml();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String id = request.getParameter("id");
            Room room = roomService.getOneById(Integer.parseInt(id));
            List<PaymentMethod> list = paymentMethodServices.getAll();
            request.setAttribute("room",room);
            request.setAttribute("list", list);
            request.getRequestDispatcher("view/update.jsp").forward(request,response);



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String id1 = request.getParameter("id");
            String name = request.getParameter("renterName");
            String phone = request.getParameter("phoneNumber");
            String rentDate = request.getParameter("rentDate");
            String payment = request.getParameter("paymentMethod");
            String remark = request.getParameter("remark");

            Room room = new Room(Integer.parseInt(id1),name,phone,rentDate,payment,remark);
            roomService.update(room);
            response.sendRedirect("list");
    }
}
