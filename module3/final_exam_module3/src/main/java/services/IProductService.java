package services;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();
    void insert(Product product);
}
