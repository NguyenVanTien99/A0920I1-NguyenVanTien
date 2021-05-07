package model;

import java.sql.Date;

public class Room {
    private int id;
    private String renterName;
    private String phoneNumber;
    private String rentDate;
    private String paymentMethod;
    private String remark;

    public Room(int id, String renterName, String phoneNumber, String rentDate, String paymentMethod, String remark) {
        this.id = id;
        this.renterName = renterName;
        this.phoneNumber = phoneNumber;
        this.rentDate = rentDate;
        this.paymentMethod = paymentMethod;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRenterName() {
        return renterName;
    }

    public void setRenterName(String renterName) {
        this.renterName = renterName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRentDate() {
        return rentDate;
    }

    public void setRentDate(String rentDate) {
        this.rentDate = rentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
