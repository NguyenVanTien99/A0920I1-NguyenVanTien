package dsa_list.practices.class_arraylist;

import dsa_list.practices.class_arraylist.MyList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> ListInteger =  new MyList<>();
        ListInteger.add(0);
        ListInteger.add(2);
        ListInteger.add(3);
        ListInteger.add(4);

        System.out.println("element 4: "+ListInteger.get(3));
        System.out.println("element 1: "+ListInteger.get(1));
        System.out.println("element 2: "+ListInteger.get(2));

/*        ListInteger.get(6);
        System.out.println("element 6: "+ListInteger.get(6));*/

        System.out.println("element 1: " + ListInteger.get(0));
    }
}
