package array_java.exercises;

import java.util.Scanner;

public class FindMaxValueInTwoDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of array");
        int row = sc.nextInt();
        System.out.println("Enter the column of array");
        int column = sc.nextInt();

        int[][] arr =  new int[row][column];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.println("arr[" + i + "][" + j + "] = " );
                arr[i][j] =  sc.nextInt();
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print("arr[" + i + "][" + j + "] = " + arr[i][j] + " ");

            }
        }

        int max = arr[0][0];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println();
        System.out.println("The element has max value in array is " + max);


    }
}
