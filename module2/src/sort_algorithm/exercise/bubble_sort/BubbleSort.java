package sort_algorithm.exercise.bubble_sort;

import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for(int i = 0 ; i < arr.length - 1; i++){
            for(int j = 0 ; j < arr.length - 1 - i; j ++ ){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortOptimized(int arr[]){
        for(int i = 0 ; i < arr.length - 1; i++){
            boolean swapped = false;
            for(int j = 0 ; j < arr.length - 1 - i; j ++ ){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false) {
                break;
            }
        }
    }

    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number element of array");
        int size = input.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("Enter element " + (i+1));
            arr[i] = input.nextInt();
        }
        printArray(arr);
//        bubbleSort(arr);
//        printArray(arr);
        bubbleSortOptimized(arr);
        printArray(arr);

    }

}
