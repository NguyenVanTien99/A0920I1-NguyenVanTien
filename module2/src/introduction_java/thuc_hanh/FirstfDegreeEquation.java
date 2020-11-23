package introduction_java.thuc_hanh;

import java.util.Scanner;

public class FirstfDegreeEquation {
    public static void main(String[] args) {
        System.out.println("Liner Equation Resolver");
        System.out.println("Given a equation as a*x + b = 0 , please enter your constants: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        double a = sc.nextDouble();
        System.out.println("b: ");
        double b = sc.nextDouble();
        System.out.println("c: ");
        double c = sc.nextDouble();

        if(a != 0){
            double solution = -b/a;
            System.out.printf("the solution is: %f ", solution);
        }else{
            if( b == 0 ){
                System.out.println("the solution is all x");
            }else {
                System.out.println("no solution ");
            }
        }
    }
}
