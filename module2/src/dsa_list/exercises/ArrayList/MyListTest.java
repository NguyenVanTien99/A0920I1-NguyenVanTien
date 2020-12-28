package dsa_list.exercises.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> arr = new MyList<>();

        arr.add("Tien");
        arr.add("Le");
        arr.add("Nguyen", 1);

        System.out.println(arr.size());
        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
        System.out.println(arr.get(2));


        System.out.println(arr.contains("Nguyen"));
        System.out.println(arr.indexOf("Nguyen"));
    }
}
