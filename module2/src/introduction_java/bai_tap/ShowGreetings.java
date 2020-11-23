package introduction_java.bai_tap;

import java.util.Scanner;

public class ShowGreetings {
    public static void main(String[] args) {

        System.out.println("enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("hello " + name);
    }
}
