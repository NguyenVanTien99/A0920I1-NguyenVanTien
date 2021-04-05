package repository;

import model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> findAll();

    Product findById(int id);

    Product findByName(String Name);

    void save(Product product);

    void update(Product product);

    void remove(int id);
}
