package loop_in_java.practices;

import java.util.Scanner;

public class PrintImage {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);

        while (choice != 0){
            System.out.println("Menu");
            System.out.println("1.Print the rectangle");
            System.out.println("2.print the square triangle");
            System.out.println("3.Print the isosceles triangle");
            System.out.println("4.exit");

            choice = sc.nextInt();

            switch (choice){
                case 1:
                    for(int i = 1; i <= 3; i++){
                        for(int j = 1; j <= 7; j++){
                            System.out.printf("* ");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 2:
                    for(int i = 1; i <= 5; i++){
                        for(int j = 1; j <= i; j++){
                            System.out.printf("* ");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 3:
                    for(int i = 1; i <= 5; i++){
                        for(int j = 5; j >= i; j--){
                            System.out.printf("* ");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!!!");
            }
        }

        }


}
