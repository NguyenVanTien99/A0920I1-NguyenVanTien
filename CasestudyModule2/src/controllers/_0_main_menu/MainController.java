package controllers;

import java.util.Scanner;

public class MainController {
    public static Scanner scanner = new Scanner(System.in);


    public static void displayMainMenu(){
        int choose = 1;
        do{
            System.out.println(
                    "------------------------------------ \n"
                    + "1.Add new Services \n"
                    + "2.Show services \n"
                    + "3.Add new customer \n"
                    + "4.Show information of customer \n"
                    + "5.Add new booking \n"
                    + "6.Show informaton of Employee \n"
                    + "7.Exit \n"
                    + "-----------------------------------"
            );
            System.out.println("Please choose ");
            int input = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1 :
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    showInformationCustomer();
                    break;
                case 5:
                    addNewBooking();
                    break;
                case 6:
                    showInformationEmployee();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choose 1 to 7");
                    break;
            }
        }while (choose >= 1 && choose <=7);
    }

    public static void addNewServices(){

    }

    public static void showInformationEmployee() {
        System.out.println("showInformationEmployee");
    }

    public static void addNewBooking() {
        System.out.println("addNewBooking");
    }

    public static void showInformationCustomer() {
        System.out.println("showInformationCustomer");
    }

    public static void addNewCustomer() {
        System.out.println("addNewCustomer");
    }

    public static void showServices() {
        System.out.println("showServices");
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
