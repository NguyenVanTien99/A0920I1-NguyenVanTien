package controllers._5_cinema_menu;

import Validation.RegularException;
import controllers._0_main_menu.MainController;
import controllers._2_customer_menu.ShowCustomer;
import controllers.file.ReadFile;
import models.Customer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Cinema {
    private static Scanner scanner = new Scanner(System.in);
    private static int ticket = 2;
    private static Queue<Customer> customersQueue = new LinkedList<>();

    public static void cinemaMenu(){
        String choice;
        do {
            System.out.println("-----------------------------------");
            System.out.println("1. Buy tickets.");
            System.out.println("2. Print list of customer buy tickets.");
            System.out.println("3. Back.");
            System.out.println("4. Exit.");
            System.out.println("-----------------------------------");

            System.out.print("Enter choice: ");
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    checkSoldOut();
                    buyTickets();
                    cinemaMenu();
                    break;
                case "2":
                    printList();
                    cinemaMenu();
                    break;
                case "3":
                    MainController.displayMainMenu();
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter 1 - 4");
                    cinemaMenu();
                    break;

            }
        } while (Integer.parseInt(choice) > 0 && Integer.parseInt(choice) < 4);
    }

    private static void checkSoldOut() {
        if(customersQueue.size() == ticket){
            System.out.println("Sold out");
            cinemaMenu();
        }
    }

    private static void printList() {
        if(customersQueue.isEmpty()){
            System.out.println("No customer book ticket");
        }

        while (!customersQueue.isEmpty()){
            System.out.println(customersQueue.poll().getFullName());
        }
    }

    private static void buyTickets() {
        String choiceCustomer = null;
        ShowCustomer.showInformationCustomers();
        boolean flag;
        do {
            flag = true;
            System.out.println("Choose Customer");
            choiceCustomer = scanner.nextLine();
            try {
                RegularException.indexCustomerException(choiceCustomer);
            }catch (IndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        customersQueue.add(ReadFile.customerList.get(Integer.parseInt(choiceCustomer)-1));
        System.out.println("SUSSCES");
    }

    public static void main(String[] args) {
        cinemaMenu();
    }
}


