package controllers._2_customer_menu;

import controllers.file.ReadFile;
import models.Customer;

import java.util.Collections;

public class ShowCustomer {
    public static void showInformationCustomers(){
        ReadFile.readFileCustomer();
        if(ReadFile.customerList.isEmpty()){
            System.out.println("No customer exist");
        }
        int index = 1;
        Collections.sort(ReadFile.customerList);
        for (Customer customer : ReadFile.customerList) {
            System.out.println(index++ + " " + customer.toString());
        }
    }
}
