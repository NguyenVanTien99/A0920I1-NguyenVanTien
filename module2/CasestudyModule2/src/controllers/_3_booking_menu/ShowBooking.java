package controllers._3_booking_menu;

import controllers.file.ReadFile;
import models.Customer;

public class ShowBooking {
    public static void showCustomerHadBooking() {
        ReadFile.readFileBooking();
        if(ReadFile.bookingList.isEmpty()){
            System.out.println("No booking exist");
        }
        int index = 1;
        for (Customer customer: ReadFile.bookingList) {
            System.out.println(index++ + " " + customer.showInfor());
        }
    }
}
