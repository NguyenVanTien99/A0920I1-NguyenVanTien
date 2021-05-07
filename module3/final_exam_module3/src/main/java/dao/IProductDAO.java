package dao;

import model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductDAO {
    List<Product> getAll() throws SQLException;
    void insert(Product product) throws SQLException;
}
