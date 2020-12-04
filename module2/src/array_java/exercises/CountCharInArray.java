package array_java.exercises;

import java.util.Scanner;

public class CountCharInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "big city boyyyy";
        System.out.println("Enter the character you want to find");
        char ch = 'y';
//        String ch = sc.nextLine();
        int count = 0;
        for(int i = 0; i < string.length(); i++ ){
            if((string.charAt(i) == ch)){
                count ++;
            }
        }
        System.out.println("count: " + count);
    }
}
