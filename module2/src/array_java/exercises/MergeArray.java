package array_java.exercises;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size arr 1");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for(int i = 0; i < arr1.length; i++){
            System.out.println("Enter ele " + (i + 1) + "of arr 1");
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter size arr 2");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for(int i = 0; i < arr2.length; i++){
            System.out.println("Enter ele " + (i + 1) + "of arr 2");
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[size1+size2];

        for(int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }

        int j = 0;
        for(int i = arr1.length; i < arr3.length; i++){
            arr3[i] = arr2[j];
            j++;
        }



        for(int i = 0; i < arr3.length; i++){
            System.out.print(arr3[i] + "\t");
        }

    }
}
