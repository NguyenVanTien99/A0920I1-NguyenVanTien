package services.impl;

import model.Product;
import repository.IProductRepository;
import repository.ipml.ProductRepository;
import services.IProductService;

import java.util.List;

public class ProductService implements IProductService {

    IProductRepository repository = new ProductRepository();

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        return repository.findById(id);
    }

    @Override
    public Product getProductByName(String Name) {
        return repository.findByName(Name);
    }

    @Override
    public void saveProduct(Product product) {
        repository.save(product);
    }

    @Override
    public void updateProduct(Product product) {
        repository.update(product);
    }

    @Override
    public void removeProduct(int id) {
        repository.remove(id);
    }
}
