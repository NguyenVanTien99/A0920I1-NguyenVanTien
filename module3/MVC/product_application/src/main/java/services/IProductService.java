package services;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAllProducts();

    Product getProductById(int id);

    Product getProductByName(String Name);

    void saveProduct(Product product);

    void updateProduct(Product product);

    void removeProduct(int id);
}
