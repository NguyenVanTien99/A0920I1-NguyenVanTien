package introduction_java.practices;

import java.util.Scanner;

public class UseOperators {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Width: ");
        width = sc.nextFloat();
        System.out.println("Enter Height: ");
        height = sc.nextFloat();

        float area = width * height;
        System.out.println("Area is: " + area);
    }
}
