package array_and_method_java.exercises;

import java.util.Scanner;

public class DeleteElementOfArr {
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

        int[] array =  new int[size];
        for(int i = 0; i < array.length; i++){
            System.out.println("Enter the ele : " + (i+1));
            array[i] = sc.nextInt();
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.println();
        System.out.println("Enter the number delete");
        int numberDelete = sc.nextInt();
        boolean checkExist = false;
        int index_del = 0;
        for(int i = 0; i < array.length; i ++){
            if(array[i] == numberDelete){
                System.out.println("the index of number in array is: " + i);
                index_del = i;
                checkExist = true;

            }
        }
        if (!checkExist){
            System.out.println("the number is not exist in array");
        }
        int k = 0;
        for(int j = 0; j < array.length; j ++  ){
            if(array[j] != numberDelete){
                array[k] = array[j];
                k++;
            }
        }

        System.out.println("array after delete");
        for (int i = 0; i < k; i++) {
            System.out.print(array[i] + "\t");
        }


    }
}
