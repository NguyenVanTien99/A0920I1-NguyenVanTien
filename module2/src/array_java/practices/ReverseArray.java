package array_java.practices;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the size: ");
            size = sc.nextInt();
            if(size > 20)
                System.out.println("size does not exceed 20");
        }while(size>20);

        array = new int[size];

        for(int i = 0; i <array.length; i++){
            System.out.println("Enter element" + ( i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        System.out.println("ele in array: ");
        for (int ele : array ){
            System.out.print(ele + "\t");
        }

        for (int j  = 0; j < array.length /2 ; j++){
            int temp = array[j];
            array[j] = array[size - 1 -j];
            array[size - 1 - j ] = temp;
        }
        System.out.println();
        System.out.println("reverse array");
        for (int ele : array ){
            System.out.print(ele + "\t");
        }



        System.out.println();
    }
}
