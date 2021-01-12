package java_collection_framework.exercises.excercises_use_arraylist_linkedlist_in_java_collection;

import java.util.Comparator;

public class SortDescending implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice() > o2.getPrice()){
            return -1;
        }else if(o1.getPrice() == o2.getPrice()){
            return 0;
        }else{
            return 1;
        }
    }
}
