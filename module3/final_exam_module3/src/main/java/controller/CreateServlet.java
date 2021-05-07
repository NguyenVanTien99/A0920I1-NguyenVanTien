package controller;

import model.Product;
import services.IProductService;
import services.ipml.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CreateServlet", urlPatterns  = "/create")
public class CreateServlet extends HttpServlet {

    private IProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> list = productService.getAll();
        request.setAttribute("list", list);
        request.getRequestDispatcher("view/create.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String price = request.getParameter("price");
        String discount = request.getParameter("discount");
        String stock = request.getParameter("stock");

        Product product = new Product(Integer.parseInt(id),name,Integer.parseInt(price),Integer.parseInt(discount),Integer.parseInt(stock));

        productService.insert(product);
        response.sendRedirect("list");

    }
}
