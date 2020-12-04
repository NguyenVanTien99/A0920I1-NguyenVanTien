package array_java.exercises;

import java.util.Scanner;

public class SumOfColumnInTwoDimensionalArray {
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
        System.out.println("");
        System.out.println("Enter the colum number you want caculate");
        int columnNumber = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
                sum += arr[i][columnNumber];
        }

        System.out.println(sum);

    }
}
