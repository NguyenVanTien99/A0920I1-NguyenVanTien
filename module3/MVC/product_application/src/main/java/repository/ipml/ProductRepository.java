package repository.ipml;

import model.Product;
import repository.IProductRepository;

import java.util.*;

public class ProductRepository implements IProductRepository {
    private static Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1,"Food", 100, "No Description", "Viet Nam"));
        products.put(2, new Product(2,"Drink", 200, "No Description", "Viet Nam"));
        products.put(3, new Product(3,"Toy", 300, "No Description", "Viet Nam"));
        products.put(4, new Product(4,"furniture", 400, "No Description", "Viet Nam"));
        products.put(5, new Product(5,"Houseware", 500, "No Description", "Viet Nam"));
    }

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public Product findByName(String name) {
        Set<Integer> set = products.keySet();
        Product product = new Product();
        for (Integer key: set) {
            if(products.get(key).getName().equals(name)){
                product = products.get(key);
                break;
            }
        }
        return product;
    }

    @Override
    public void save(Product product) {
        if(products.get(product.getId()) == null){
            products.put(product.getId() , product );
        } else {
            System.out.println("id product da ton tai");
        }

    }

    @Override
    public void update(Product product) {
        if(products.get(product.getId()) != null){
            products.put(product.getId() , product );
        }else {
            System.out.println("khong tim thay san pham");
        }

    }

    @Override
    public void remove(int id) {
        products.remove(id);
    }

}
