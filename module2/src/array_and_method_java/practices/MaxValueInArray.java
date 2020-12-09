package array_and_method_java.practices;

import java.util.Scanner;

public class MaxValueInArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the length of array");
        int size;
        do {
             size = sc.nextInt();
             if(size > 20){
                 System.out.println("Size should not exceed 20");
             }
        }while (size > 20);

        int[] arr =  new int[size];
        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter the ele : " + (i+1));
            arr[i] = sc.nextInt();
        }
        System.out.print("Property list: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        int max = arr[0];
        int index = 1;
        for(int j = 0; j < arr.length; j++ ){
            if(arr[j] > max){
                max  =  arr[j];
                index = j + 1;
            }
        }
        System.out.println();
        System.out.println("The largest property value in the list is " + max + " at the position " + index);
    }
}
