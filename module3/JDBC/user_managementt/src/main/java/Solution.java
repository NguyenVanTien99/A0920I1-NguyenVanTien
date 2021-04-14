import java.util.Scanner;

public class Solution {

    public static boolean checkNumber(int n){
        int temp = n;
        String stringTemp = n + "";

        boolean check = false;

        String[] arrString = stringTemp.split("");

        if(arrString.length < 3){
            check = false;
        }else if(arrString.length < 4){
            if(Math.pow(Integer.parseInt(arrString[0] + arrString[arrString.length - 1]), 2 )  == temp){
                check = true;
            }
        }else {
            if(Math.pow(Integer.parseInt(arrString[0] + arrString[arrString.length - 1]),arrString.length - 2)  == temp){
                check = true;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        boolean check = false;

        do {
            if(Solution.checkNumber(input) == true){
                System.out.println(input);
                check = true;
            }
            input ++;
        }while (check == false);

    }
}



