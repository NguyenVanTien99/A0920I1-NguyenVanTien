package controller;

import model.Product;
import services.IProductService;
import services.impl.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListProductServlet", value = "/list")
public class ListProductServlet extends HttpServlet {
    IProductService service = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> productList = service.getAllProducts();
        request.setAttribute("products", productList);
        request.getRequestDispatcher("/product/list.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
