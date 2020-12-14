package inheritance_java.exercises.triangle;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
/*        Shape shape = new Shape(3,5,6);
        System.out.println(shape);*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter side 1");
        double size1 = scanner.nextDouble();
        System.out.println("enter side 2");
        double size2 = scanner.nextDouble();
        System.out.println("enter side 3");
        double size3 = scanner.nextDouble();
        System.out.println("enter color");
        String color = scanner.next();

        Triangle triangle = new Triangle(size1,size2,size3,color);
        System.out.println(triangle);
    }
}
