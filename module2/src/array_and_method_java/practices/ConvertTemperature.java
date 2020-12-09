package array_and_method_java.practices;

import java.util.Scanner;

public class ConvertTemperature {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5 ) * celsius + 32;
        return  fahrenheit;
    }
    public static double FahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9 ) * (fahrenheit - 32);
        return  celsius;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double F;
        double C;
        int choice;

        do{
            System.out.println("Menu.");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter F");
                    F = sc.nextDouble();
                    System.out.println("F TO C: " + FahrenheitToCelsius(F));
                    break;
                case 2:
                    System.out.println("Enter C");
                    C = sc.nextDouble();
                    System.out.println("C TO F: " + celsiusToFahrenheit(C));
                    break;
                case 0:
                    System.exit(0);
            }

        }while (choice != 0);

    }
}
