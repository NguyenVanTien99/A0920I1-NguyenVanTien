package controllers._0_main_menu;

import controllers._1_service_menu.AddServicesMainMenu;
import controllers._1_service_menu.ShowServicesMainMenu;
import controllers._2_customer_menu.AddCustomer;
import controllers._2_customer_menu.ShowCustomer;
import controllers._3_booking_menu.AddBooking;
import controllers._3_booking_menu.ShowBooking;
import controllers._4_employee_menu.ShowEmployee;
import controllers._5_cinema_menu.Cinema;

import java.util.Scanner;

public class MainController {
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
                            + "6.show information booking \n"
                            + "7.Show informaton of Employee \n"
                            + "8.cinema \n"
                            + "9.Exit \n"
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
                    AddBooking.addNewBooking();
                    break;
                case "6":
                    ShowBooking.showCustomerHadBooking();
                    break;
                case "7":
                    ShowEmployee.showInforEmployee();
                    break;
                case "8":
                    Cinema.cinemaMenu();
                    break;
                case "9":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choose 1 to 7");
                    displayMainMenu();
                    break;
            }
        }while (Integer.parseInt(choose) >= 1 && Integer.parseInt(choose) <=9);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
