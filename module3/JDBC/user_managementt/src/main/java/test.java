import java.util.Scanner;

public class test {

    public static boolean checkPrime(int n){
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSymmetry(int n1){
        int reversed = 0;
        int oldValue = n1;
        boolean check = false;

        while(n1 != 0) {
            int temp = n1 % 10;
            reversed = reversed * 10 + temp;
            n1 /= 10;
        }

        if(reversed == oldValue){
            check = true;
        }
        return check;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        boolean check = false;

        do {
            if(test.checkPrime(input) == true && test.checkSymmetry(input) == true){
                System.out.println(input);
                check = true;
            }
            input ++;
        }while (check == false);

    }
}
