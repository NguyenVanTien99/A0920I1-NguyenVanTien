package controllers._2_customer_menu;

import Validation.RegularException;
import commons.FileUntil;
import controllers.file.ReadFile;
import exceptions.CustomerInformationException;
import exceptions.DateOfBirthExcetion;
import models.Customer;

import java.util.Scanner;

public class AddCustomer {
    public static Scanner scanner = new Scanner(System.in);
    public static void addNewCustomer(){
        boolean flag;

        String fullName;
        String dateOfBirth;
        String gender;
        String idCard;
        String phoneNumber;
        String email;
        String customerType;

        do {
            flag = true;
            System.out.println("Enter the full name Customer");
            fullName = scanner.nextLine();
            try {
                RegularException.validateNameCustomer(fullName);
            } catch (CustomerInformationException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        do {
            flag = true;
            System.out.println("Enter the date of birth");
            dateOfBirth = scanner.nextLine();
            try {
                RegularException.validateDateOfBirth(dateOfBirth);
            } catch (DateOfBirthExcetion e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        do {
            flag = true;
            System.out.println("Enter the Gender");
            gender = scanner.nextLine();
            try {
                RegularException.validateGender(gender.toLowerCase());
            } catch (CustomerInformationException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        do {
            flag = true;
            System.out.println("Enter the number of id Card");
            idCard = scanner.nextLine();
            try {
                RegularException.validateIdCard(idCard);
            } catch (CustomerInformationException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        do {
            flag = true;
            System.out.println("Enter the phone number");
            phoneNumber = scanner.nextLine();
            try {
                RegularException.validatePhoneNumber(phoneNumber);
            } catch (CustomerInformationException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        do {
            flag = true;
            System.out.println("Enter the Email");
            email = scanner.nextLine();
            try {
                RegularException.validateEmail(email);
            } catch (CustomerInformationException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);



        System.out.println("Enter the address");
        String address = scanner.nextLine();


        do {
            flag = true;
            System.out.println("Enter the type of Customer");
            customerType = scanner.nextLine();
            try {
                RegularException.validateCustomerType(customerType);
            } catch (CustomerInformationException e) {
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);



        Customer customer = new Customer(fullName, dateOfBirth, gender, idCard, phoneNumber
                                        , email, address, customerType);

        String line = customer.addInformationCustomerCsv();

        FileUntil.writeInFile(ReadFile.PATH_FILE_CUSTOMER, line);

        System.out.println("SUCCESS");

    }
}
