import model.Product;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class test {

    private static Map<Integer, Product> products = new HashMap<>();

    static {
        products.put(1, new Product(1,"Food", 100, "No Description", "Viet Nam"));
        products.put(2, new Product(2,"Drink", 200, "No Description", "Viet Nam"));
        products.put(3, new Product(3,"Toy", 300, "No Description", "Viet Nam"));
        products.put(4, new Product(4,"furniture", 400, "No Description", "Viet Nam"));
        products.put(5, new Product(5,"Houseware", 500, "No Description", "Viet Nam"));
    }

//    public static Product findByName(String name) {
//        Set<Integer> set = products.keySet();
//        Product product = new Product();
//        for (Integer key: set) {
//            if(products.get(key).getName().equals(name)){
//                product = products.get(key);
//                break;
//            }
//        }
//        return product;
//    }

    public static void main(String[] args) {

        //System.out.println(test.findByName("Food1").getPrice());


    }
}
