package array_java.practices;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] myFriend = {"Loc","Khang","Son","Huy","Cuong","Kiet"};
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a name's friend");
        String input_name =  sc.nextLine();
        boolean check = false;
        for(int i = 0; i < myFriend.length; i++){
            if(myFriend[i].equals(input_name)){
                System.out.println("Position of the student in the list " + input_name + " is: " + (i+1));
                check =  true;
                break;
            }
        }
        if(!check){
            System.out.println("Not found" + input_name + "in the list");
        }
    }
}
