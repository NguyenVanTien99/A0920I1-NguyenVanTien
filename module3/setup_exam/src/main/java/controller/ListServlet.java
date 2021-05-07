package controller;

import Services.RoomService;
import Services.ipml.RoomServiceIpml;
import model.Room;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ListServlet", urlPatterns  = "/list")
public class ListServlet extends HttpServlet {
    private RoomService roomService = new RoomServiceIpml();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Room> list = roomService.getAll();
        request.setAttribute("list", list);
        request.getRequestDispatcher("view/list.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
