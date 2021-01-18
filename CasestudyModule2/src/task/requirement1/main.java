package task.requirement1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the customer name: ");
        String nameCustomer = scanner.nextLine();
        System.out.println("Enter the identity card number customer: ");
        String identityCardNumberCustomer = scanner.nextLine();
        System.out.println("Enter the day of birth customer");
        String dayOfBirthCustomer = scanner.nextLine();
        System.out.println("Enter the email customer");
        String emailCustomer = scanner.nextLine();
        System.out.println("Enter the address customer");
        String address = scanner.nextLine();
        System.out.println("Enter the type of customer");
        String typeOfCustomer = scanner.nextLine();
        System.out.println("Enter the discount customer");
        double discountCustomer = scanner.nextDouble();
        System.out.println("Enter the maximun number of peple");
        scanner.nextLine();
        String maxinumNumberOfPeople = scanner.nextLine();
        System.out.println("Enter the day of rent customer");
        int dayOfRents = scanner.nextInt();
        System.out.println("Enter the type of service customer");
        scanner.nextLine();
        String typeOfservices = scanner.nextLine();
        System.out.println("Enter the type of room customer");
        String typeOfRoom = scanner.nextLine();

        System.out.println("customer name: " + nameCustomer);
        System.out.println("identity card number customer: " + identityCardNumberCustomer);
        System.out.println("day of birth customer: " + dayOfBirthCustomer);
        System.out.println("email customer: " + emailCustomer);
        System.out.println("address customer: " + address);
        System.out.println("type of customer: " + typeOfCustomer);
        System.out.println("discount customer: " + discountCustomer);
        System.out.println("maximun number of peple: " + maxinumNumberOfPeople);
        System.out.println("day of rent customer: " + dayOfRents);
        System.out.println("type of service customer: " + typeOfservices);
        System.out.println("type of room customer: " + typeOfRoom);

        System.out.println("--------------------------------------");

        double totalPrice = 0;

        double villaPrice =  500.0;
        double housePrice = 300.0;
        double roomPrice = 100.0 ;

        if(typeOfservices.equals("Villa")){
            totalPrice = villaPrice * dayOfRents * (1 - discountCustomer/100);
        }else if(typeOfservices.equals("House")){
            totalPrice = housePrice * dayOfRents * (1 - discountCustomer/100);
        }else{
            totalPrice = roomPrice * dayOfRents * (1 - discountCustomer/100);
        }

        System.out.println("total Price: " + totalPrice);



    }
}
