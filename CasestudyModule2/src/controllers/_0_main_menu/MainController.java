package controllers._0_main_menu;

import controllers._1_service_menu.AddServicesMainMenu;
import controllers._1_service_menu.ShowServicesMainMenu;
import controllers._2_customer_menu.AddCustomer;
import controllers._2_customer_menu.ShowCustomer;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu(){
        String choose;
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
            choose = scanner.nextLine();
            switch (choose){
                case "1" :
                    AddServicesMainMenu.addNewServices();
                    break;
                case "2":
                    ShowServicesMainMenu.showServices();
                    break;
                case "3":
                    AddCustomer.addNewCustomer();
                    break;
                case "4":
                    ShowCustomer.showInformationCustomers();
                    break;
                case "5":
                    addNewBooking();
                    break;
                case "6":
                    showInformationEmployee();
                case "7":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choose 1 to 7");
                    displayMainMenu();
                    break;
            }
        }while (Integer.parseInt(choose) >= 1 && Integer.parseInt(choose) <=7);
    }

    public static void showInformationEmployee() {
        System.out.println("showInformationEmployee");
    }

    public static void addNewBooking() {
        System.out.println("addNewBooking");
    }

    public static void main(String[] args) {
        displayMainMenu();

    }
}
