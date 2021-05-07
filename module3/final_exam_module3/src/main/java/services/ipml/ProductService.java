package services.ipml;

import dao.IProductDAO;
import dao.ipml.ProductDAO;
import model.Product;
import services.IProductService;

import java.sql.SQLException;
import java.util.List;

public class ProductService implements IProductService {
    IProductDAO productDAO = new ProductDAO();

    @Override
    public List<Product> getAll() {
        try {
            return productDAO.getAll();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

    @Override
    public void insert(Product product) {
        try {
            productDAO.insert(product);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}
