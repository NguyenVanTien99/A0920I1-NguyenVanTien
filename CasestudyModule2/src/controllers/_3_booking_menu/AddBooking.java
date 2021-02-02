package controllers._3_booking_menu;

import Validation.RegularException;
import commons.FileUntil;
import controllers._0_main_menu.MainController;
import controllers.file.ReadFile;
import controllers._1_service_menu.ShowServicesMainMenu;
import controllers._2_customer_menu.ShowCustomer;

import java.util.Scanner;

public class AddBooking {
    private static Scanner scanner = new Scanner(System.in);
    private static String choiceCustomer;
    public static void addNewBooking() {
        String choose ;
        do {
            System.out.println("----------------------------------------");
            System.out.println("1. Booking Villa. ");
            System.out.println("2. Booking House. ");
            System.out.println("3. Booking Room.");
            System.out.println("4. Back to main menu.");
            System.out.println("5. Exit.");
            System.out.println("----------------------------------------");
            System.out.print("Enter your choice : ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    choiceVilla();
                    FileUntil.writeInFile(ReadFile.PATH_FILE_BOOKING, ReadFile.customerList.get(Integer.parseInt(choiceCustomer) - 1).addInformationBooking());
                    System.out.println("SUCCESS");
                    break;
                case "2":
                    choiceHouse();
                    FileUntil.writeInFile(ReadFile.PATH_FILE_BOOKING, ReadFile.customerList.get(Integer.parseInt(choiceCustomer) - 1).addInformationBooking());
                    System.out.println("SUCCESS");
                    break;
                case "3":
                    choiceRoom();
                    FileUntil.writeInFile(ReadFile.PATH_FILE_BOOKING, ReadFile.customerList.get(Integer.parseInt(choiceCustomer) - 1).addInformationBooking());
                    System.out.println("SUCCESS");
                    break;
                case "4":
                    MainController.displayMainMenu();
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter 1 to 5");
                    addNewBooking();
                    break;

            }
        }while (Integer.parseInt(choose) > 0 && Integer.parseInt(choose) < 6);

    }
    public static void choiceCustomer(){
        ShowCustomer.showInformationCustomers();
        boolean flag;

        do {
            System.out.println("choose customer booking");
            choiceCustomer = scanner.nextLine();
            flag = true;
            try {
                RegularException.indexCustomerException(choiceCustomer);
            }catch (IndexOutOfBoundsException e ){
                System.out.println(e.getMessage());
                flag = false;
            }

        }while (!flag);

    }

    public static void choiceVilla() {
        choiceCustomer();
        ShowServicesMainMenu.showAllVilla();
        boolean flag;
        String chooseVilla = null;
        do {
            flag = true;
            System.out.println("Choose villa you want booking");
            chooseVilla = scanner.nextLine();
            try {
                RegularException.indexVillaException(chooseVilla);
            }catch (IndexOutOfBoundsException e ){
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        ReadFile.customerList.get(Integer.parseInt(choiceCustomer) - 1).setService(ReadFile.villaList.get(Integer.parseInt(chooseVilla) - 1));
    }

    public static void choiceRoom() {
        choiceCustomer();
        ShowServicesMainMenu.showAllRoom();
        boolean flag;
        String chooseRoom = null;
        do {
            flag = true;
            System.out.println("Choose room you want booking");
            chooseRoom = scanner.nextLine();
            try {
                RegularException.indexRoomException(chooseRoom);
            }catch (IndexOutOfBoundsException e ){
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);
        ReadFile.customerList.get(Integer.parseInt(choiceCustomer) - 1).setService(ReadFile.roomList.get(Integer.parseInt(chooseRoom) - 1));
    }

    public static void choiceHouse() {
        choiceCustomer();
        ShowServicesMainMenu.showAllHouse();

        boolean flag;
        String chooseHouse = null;
        do {
            flag = true;
            System.out.println("Choose House you want booking");
            chooseHouse = scanner.nextLine();
            try {
                RegularException.indexHouseException(chooseHouse);
            }catch (IndexOutOfBoundsException e ){
                System.out.println(e.getMessage());
                flag = false;
            }
        }while (!flag);

        ReadFile.customerList.get(Integer.parseInt(choiceCustomer) - 1).setService(ReadFile.houseList.get(Integer.parseInt(chooseHouse) - 1));
    }

}
