package introduction_java.exercises;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        long rate = 23000;
        System.out.println("Enter your money that you want to convert");
        Scanner sc = new Scanner(System.in);
        long USD = sc.nextInt();
        long VND = USD * rate;
        System.out.println( USD + "USD = " + VND + " VND");
        }
    }

