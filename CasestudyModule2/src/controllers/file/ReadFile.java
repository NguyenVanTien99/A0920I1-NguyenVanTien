package controllers._0_main_menu;

import commons.FileUntil;
import controllers._1_service_menu.AddServicesMainMenu;
import controllers._1_service_menu.ShowServicesMainMenu;
import controllers._2_customer_menu.AddCustomer;
import controllers._2_customer_menu.ShowCustomer;
import models.*;

import java.util.*;

public class ReadFile {
    public static final String COMMA = ",";
    public static final String PATH_FILE_VILLA = "src/data/villa.csv";
    public static final String PATH_FILE_ROOM = "src/data/room.csv";
    public static final String PATH_FILE_HOUSE = "src/data/house.csv";
    public static final String PATH_FILE_CUSTOMER = "src/data/customer.csv";
    public static final String PATH_FILE_CONTRACT = "src/data/contract.csv";
    public static final String PATH_FILE_BOOKING = "src/data/booking.csv";
    public static List<Villa> villaList;
    public static List<House> houseList;
    public static List<Room> roomList;
    public static List<Customer> customerList;
    public static List<Customer> bookingList;
    public static List<Contract> contractsList;


    public static void readFileVilla(){
        villaList = new ArrayList<>();
        List<String> stringList = FileUntil.readFromFile(PATH_FILE_VILLA);
        for(String string : stringList){
            String[] stringSplit = string.split(",");
            Villa villa = new Villa(stringSplit[0],stringSplit[1],Double.parseDouble(stringSplit[2]),
                                    Double.parseDouble(stringSplit[3]), Integer.parseInt(stringSplit[4]),
                                    stringSplit[5],stringSplit[6],stringSplit[7],
                                    Double.parseDouble(stringSplit[8]),Integer.parseInt(stringSplit[9]));
            villaList.add(villa);
        }


    }

    public static void readFileHouse(){
        houseList = new ArrayList<>();
        List<String> stringList = FileUntil.readFromFile(PATH_FILE_HOUSE);
            for (String string : stringList) {
                String[] stringSplit = string.split(",");
                House house = new House(stringSplit[0], stringSplit[1], Double.parseDouble(stringSplit[2]),
                        Double.parseDouble(stringSplit[3]), Integer.parseInt(stringSplit[4]),
                        stringSplit[5], stringSplit[6], stringSplit[7], Integer.parseInt(stringSplit[8]));
                houseList.add(house);
            }
    }

    public static void readFileRoom(){
        roomList = new ArrayList<>();
        List<String> stringList = FileUntil.readFromFile(PATH_FILE_ROOM);
        for(String string : stringList){
            String[] stringSplit = string.split(",");
            Room room = new Room(stringSplit[0],stringSplit[1],Double.parseDouble(stringSplit[2]),
                    Double.parseDouble(stringSplit[3]), Integer.parseInt(stringSplit[4]),
                    stringSplit[5],stringSplit[6]);
            roomList.add(room);
        }
    }

    public static void readFileCustomer(){
        customerList = new ArrayList<>();
                List<String> stringList = FileUntil.readFromFile(PATH_FILE_CUSTOMER);
        for(String string : stringList){
            String[] stringSplit = string.split(",");
            Customer customer = new Customer(stringSplit[0],stringSplit[1],stringSplit[2],
                    stringSplit[3], stringSplit[4], stringSplit[5],stringSplit[6], stringSplit[7]);
            customerList.add(customer);
        }
    }

    public static void readFileContract(){
        contractsList = new ArrayList<>();
        List<String> stringList = FileUntil.readFromFile(PATH_FILE_CONTRACT);
        for(String string : stringList){
            String[] stringSplit = string.split(",");
            Contract contract = new Contract(stringSplit[0],stringSplit[1],stringSplit[2],
                    Double.parseDouble(stringSplit[3]), Double.parseDouble(stringSplit[4]));
            contractsList.add(contract);
        }
    }





}
