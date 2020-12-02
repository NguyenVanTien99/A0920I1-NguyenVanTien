package loop_in_java.practices;

import java.util.Scanner;

public class LoanMoney {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double  interes_rate = 1.0;

        Scanner input = new Scanner(System.in);

        System.out.println("enter investment amount: ");
        money = input.nextDouble();
        System.out.println("enter number of month");
        month = input.nextInt();
        System.out.println("enter ennual interest rate in percentage: ");
        interes_rate = input.nextDouble();

        double total_interest = 0;
        for (int i = 0 ; i < month; i++){
            total_interest += money * (interes_rate/100)/12 * month;

        }

        System.out.println("total of interset: " + total_interest);
    }
}
