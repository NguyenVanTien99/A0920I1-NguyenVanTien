package controllers._1_service_menu;

import com.sun.tools.javac.Main;
import commons.FileUntil;
import controllers._0_main_menu.MainController;
import models.House;
import models.Room;
import models.Villa;

import java.util.Scanner;

public class ServicesMainMenu {
    public static Scanner scanner = new Scanner(System.in);
    private static String nameServices;
    private static double area;
    private static double cost;
    private static int amountOfPeopleMax;
    private static String rentType;

    public static void addNewServices(){
        String choose ;
        do {
            System.out.println(
                    "----------------------------------- \n"
                    + "1. Add new villa \n"
                    + "2. Add new house \n"
                    + "3. Add new room \n"
                    + "4. Back to menu \n"
                    + "5. Exit \n"
                    + "------------------------------------"
            );
            System.out.println("please choose");
            choose = scanner.nextLine();
//            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case "1" :
                    addNewVilla();
                    addNewServices();
                    break;
                case "2" :
                    addNewHouse();
                    addNewServices();
                    break;
                case "3" :
                    addNewRoom();
                    addNewServices();
                    break;
                case "4" :
                    MainController.displayMainMenu();
                    break;
                case "5" :
                    System.exit(0);
                default:
                    System.out.println("please choose 1 to 5");
                    addNewServices();
                    break;
            }
        }while (Integer.parseInt(choose) > 0 && Integer.parseInt(choose) < 6);

    }

    public static void generalInformationServices() {
        System.out.println("Enter the name services");
        nameServices = scanner.nextLine();
        System.out.println("Enter the area");
        area = scanner.nextDouble();
        System.out.println("Enter the cost");
        cost = scanner.nextDouble();
        System.out.println("Enter the mount of people: ");
        amountOfPeopleMax = scanner.nextInt();
        System.out.println("Enter the rent type");
        scanner.nextLine();
        rentType = scanner.nextLine();
    }

    public static void addNewRoom() {
        String idRoom;
        String accompaniedServiceFree;

        System.out.println("Enter the id room");
        idRoom = scanner.nextLine();

        generalInformationServices();

        System.out.println("Enter the accompanied Service Free");
        accompaniedServiceFree = scanner.nextLine();

        Room room = new Room(idRoom, nameServices, area, cost,
                amountOfPeopleMax, rentType, accompaniedServiceFree);
        String line = room.addFileCsv();
        FileUntil.writeInFile(MainController.PATH_FILE_ROOM, line);

    }

    public static void addNewHouse() {
        String idHouse;
        String standardRoom;
        String comfortDescription;
        String numberofFloors;

        System.out.println("Enter the id house");
        idHouse = scanner.nextLine();

        generalInformationServices();

        System.out.println("Enter the standard Room");
        standardRoom = scanner.nextLine();
        System.out.println("Enter the comfort Description");
        comfortDescription = scanner.nextLine();
        System.out.println("Enter the number of Floors");
        numberofFloors = scanner.nextLine();

        House house = new House(idHouse, nameServices, area, cost,
                amountOfPeopleMax, rentType, standardRoom, comfortDescription, Integer.parseInt(numberofFloors));
        String line = house.addFileCsv();
        FileUntil.writeInFile(MainController.PATH_FILE_HOUSE, line);
    }

    public static void addNewVilla() {
        String idVilla;
        String standardRoom;
        String comfortableDecription;
        double poolArea;
        String numberOfFloors;

        System.out.println("Enter the id villa");
        idVilla = scanner.nextLine();

        generalInformationServices();

        System.out.println("Enter the standard room");
        standardRoom = scanner.nextLine();
        System.out.println("Enter comfortable Decription");
        comfortableDecription = scanner.nextLine();
        System.out.println("Enter the pool Area");
        poolArea = scanner.nextDouble();
        System.out.println("Enter number Of Floors");
        numberOfFloors = scanner.nextLine();

        Villa villa = new Villa(idVilla, nameServices, area, cost,
                                amountOfPeopleMax, rentType, standardRoom
                                ,comfortableDecription, poolArea, Integer.parseInt(numberOfFloors));

        String line = villa.addFileCsv();
        FileUntil.writeInFile(MainController.PATH_FILE_VILLA, line);

    }
}
