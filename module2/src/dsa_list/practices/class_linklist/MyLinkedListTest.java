package dsa_list.practices.class_linklist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("------test------");
        MyLinkedList list = new MyLinkedList(10);//0
        list.addFirst(13);//1
        list.addFirst(12);//2
        list.addFirst(11);//3
        list.add(6, "tesst");

        System.out.println(list.get(4));
        System.out.println(list.get(5));


    }

}
