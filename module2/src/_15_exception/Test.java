package _15_exception;

import java.util.Scanner;

public class Test {
    public static void inputStudent() throws AgeCheckingException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input name: ");
        String name = scanner.nextLine();
        int age = 0;

        System.out.print("Input age:");
        age = scanner.nextInt();
        if (age <= 0) {
            throw new AgeCheckingException("Tuoi phai lon hon 0");
        }
        if (age >= 499) {
            throw new AgeCheckingException("Tuoi khong the lon hon 500");
        }

        Student student = new Student(name, age, 50);
        System.out.println(student);
    }

    public static void main(String[] args) throws AgeCheckingException {
        inputStudent();
    }


}
